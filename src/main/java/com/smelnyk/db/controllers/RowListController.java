package com.smelnyk.db.controllers;

import com.smelnyk.db.models.Attribute;
import com.smelnyk.db.models.Row;
import com.smelnyk.db.models.Table;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class RowListController {
    private final Table table;

    @FXML private ComboBox<String> SortFields;

    @FXML private ComboBox<String> SortOrder;

    @FXML
    public TableView<Object> rowList;

    public RowListController(Table table){
        this.table = table;
    }

    @FXML
    public void initialize(){
        showColumns();
        showRows();
        initializeSortFields();
    }

    private void initializeSortFields() {
        List<Attribute> attributes = table.getAttributes();
        ObservableList<String> attributesString = FXCollections.observableArrayList();
        for(int i = 0; i < attributes.size(); i++) {
            attributesString.add(attributes.get(i).getName());
        }
        SortFields.setItems(attributesString);
        SortFields.getSelectionModel().selectFirst();
        SortOrder.getSelectionModel().selectFirst();
    }

    private void showColumns(){
        rowList.setEditable(true);
        TableColumn<Object, String> colId = new TableColumn<>("Id");
        rowList.getColumns().add(colId);
        for(Attribute attribute: table.getAttributes())
            rowList.getColumns().add(new TableColumn<Object, String>(attribute.getName()));
    }


    private void showRows(){
        for (int columnNum = 0; columnNum < rowList.getColumns().size(); columnNum++) {
            final int finalColumnNum = columnNum;
            rowList.getColumns().get(finalColumnNum).setCellValueFactory(cell ->
                    new SimpleObjectProperty(((List<Object>)cell.getValue()).get(finalColumnNum)));
        }

        Collection<Row> rows = table.getRows().values();
        ObservableList<Object> values = FXCollections.observableArrayList();
        rows.forEach(row -> values.add(FXCollections.observableArrayList(row.getAllValues())));
        rowList.setItems(values);
    }

    public void insertRow(MouseEvent mouseEvent) throws IOException {
        setRowCreateStage(mouseEvent, null);
    }

    public void updateRow(MouseEvent mouseEvent) throws IOException {
        Object object = rowList.getSelectionModel().getSelectedItem();
        if(object != null) {
            List<Object> values = (List<Object>) object;
            Row row = table.getRows().get(values.get(0));
            setRowCreateStage(mouseEvent, row);
        }
        else
            noRowSelectedMessage();
    }

    public void deleteRow(MouseEvent mouseEvent){
        Object object = rowList.getSelectionModel().getSelectedItem();
        List<Object> values = (List<Object>) object;
        Row row = table.getRows().get(values.get(0));
        table.deleteRow(row);
        showRows();
    }

    public void deleteDuplicates(MouseEvent mouseEvent){
        table.deleteDuplicateRows();
        showRows();
    }

    public List<Attribute> getAttributes() {
        ComboBox sortFieldsCombo = new ComboBox();
        return table.getAttributes();
    }

    private void setRowCreateStage(MouseEvent mouseEvent, Row row) throws IOException {
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("/views/createRow.fxml"));
        loader.setControllerFactory(type -> {
            if (type == RowCreateController.class) {
                return new RowCreateController(table, row);
            }
            try {
                return type.getConstructor().newInstance();
            } catch (Exception exc) {
                throw new RuntimeException(exc);
            }
        });

        Stage stage = new Stage();
        if(row == null)
            stage.setTitle("Insert Row");
        else
            stage.setTitle("Update Row");

        int columnsAmount = table.getAttributes().size();
        stage.setHeight(160.0 + columnsAmount*30.0);
        stage.setMinWidth(370);
        stage.setResizable(false);
        stage.setScene(new Scene(loader.load()));
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(((Node)mouseEvent.getSource()).getScene().getWindow());

        stage.setOnHidden(e -> {
            showRows();
        });
        stage.show();

    }

    private void noRowSelectedMessage() {
        Warning.show("No row selected. Please select a row");
    }

    public void sortByField(MouseEvent mouseEvent) {
        String selectedAttribute = SortFields.getSelectionModel().getSelectedItem();
        if(selectedAttribute == null) {
            Warning.show("You need to select field!");
        } else {
            rowList.getSortOrder().clear();
            TableColumn sortColumn = getTableColumnByName(rowList, selectedAttribute);
            String sortOrder = SortOrder.getSelectionModel().getSelectedItem();
            TableColumn.SortType sortType;
            if(sortOrder.equalsIgnoreCase("ASC")) {
                sortType = TableColumn.SortType.ASCENDING;
            } else {
                sortType = TableColumn.SortType.DESCENDING;
            }
            sortColumn.setSortType(sortType);
            rowList.getSortOrder().add(sortColumn);
            rowList.sort();
        }
    }

    private <T> TableColumn<T, ?> getTableColumnByName(TableView<T> tableView, String name) {
        for (TableColumn<T, ?> col : tableView.getColumns())
            if (col.getText().equals(name)) return col ;
        return null ;
    }
}
