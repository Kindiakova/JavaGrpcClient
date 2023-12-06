package com.smelnyk.db;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import com.smelnyk.db.GrpcClient;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import io.grpc.database.Database;
import io.grpc.database.ServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
//import lombok.extern.slf4j.Slf4j;

public class Main extends Application{

    public static GrpcClient client;
    public static void main(String[] args) {
        GrpcClient client = GrpcClient.getInstance();

        launch(args);

        try {
            client.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/views/databaseList.fxml"));

        stage.setTitle("DBMS");
        stage.setMinHeight(300);
        stage.setMinWidth(400);
        stage.setScene(new Scene(root, 400, 300));
        stage.show();


    }
}