package com.smelnyk.db.controllers;

import com.smelnyk.db.models.Base;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import com.smelnyk.db.GrpcClient;

public class DatabaseCreateController {
    @FXML
    public TextField textField;

    @FXML
    public void submit(MouseEvent mouseEvent) {
        try {
            createDatabase();
            close(mouseEvent);
        }
        catch (Exception e){
            Warning.show(e);
        }
    }

    @FXML
    public void close(MouseEvent mouseEvent) {
        ((Node) mouseEvent.getSource()).getScene().getWindow().hide();
    }

    private void createDatabase()  {
        String name = textField.getText();
        String path = "databases/" + name + ".json";
        GrpcClient client = GrpcClient.getInstance();
        client.create(name, path);
        Base base = new Base(name);
    }
}
