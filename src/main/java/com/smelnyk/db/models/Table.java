package com.smelnyk.db.models;

import java.util.*;
import java.util.stream.Collectors;

public class Table {
    private Integer id;
    private String name;
    private Base base;
    private List<Attribute> attributes;
    private Map<Integer, Row> rows;

    public Table(){}

    public Table(Integer id, String name, Base base) {
        this.id = id;
        this.name = name;
        this.base = base;
        this.attributes = new ArrayList<>();
        this.rows = new HashMap<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public Map<Integer, Row> getRows() {
        return rows;
    }

    public void setRows(Map<Integer, Row> rows) {
        this.rows = rows;
    }

    public Integer getLastRowId(){
        //System.out.println("rowlist in getLastRowId:");
        Collection<Row> rowList = rows.values();
        List<Row> rowsList = new ArrayList<Row>(rowList);
//        for (int i=0; i<rowsList.size(); i+=1)
//        {
//            System.out.println(rowsList.get(i).getId());
//        }
        if(rows.size() == 0)
            return 0; else return rowsList.get(rowsList.size() - 1).getId();
        //else return new ArrayList<>(rows.keySet()).get(rows.size() - 1);
    }

    public Row findRowById(int id){
        return rows.get(id);
    }

    public void addRow(List<Object> values){
        Integer id = getLastRowId() + 1;
        Row row = new Row(id, this);
        row.setValues(values);
        rows.put(id, row);
    }

    public void updateRow(Row row, List<Object> values){
        rows.get(row.getId()).setValues(values);
    }

    public void deleteRow(Row row){
        rows.remove(row.getId());
    }

    public void deleteDuplicateRows(){
        Map<Integer, Row> rowMap = new HashMap<>();
        List<Row> uniqueRows = rows.values().stream().distinct().collect(Collectors.toList());

        for(Row row : uniqueRows){
            rowMap.put(row.getId(), row);
        }

        setRows(rowMap);
    }

    public void sortByField(int row_number) {
        Collection<Row> rowList = rows.values();
        List<Row> rowsList = new ArrayList<Row>(rowList);
        Collections.sort(rowsList, new Comparator<Row>() {
            @Override
            public int compare(Row u1, Row u2) {
                Integer price1 = (Integer) u1.getValues().get(1);
                Integer price2 = (Integer) u2.getValues().get(1);
                //System.out.println(price1 + " " + price2);
                if(price1 > price2)
                    return 1;
                else if(price1 < price2)
                    return -1;
                else return 0;
            }
        });
        rows.clear();
        for(int i = 0; i < rowsList.size(); i++) {
            Row row = rowsList.get(i);
            //System.out.println(row.getId() + " " + row.getValues());
            rows.put(i+1, row);
        }
        //System.out.println("rowslist in sort: ");
        rowList = rows.values();
        rowsList = new ArrayList<Row>(rowList);
//        for (int i=0; i<rowsList.size(); i+=1)
//        {
//            System.out.println(rowsList.get(i).getId());
//        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Table) {
            Table temp = (Table) obj;
            if(this.id == temp.id && this.rows.equals(temp.rows))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.id.hashCode() + this.rows.hashCode();
    }
}
