package com.smelnyk.db;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.database.Database.*;
import io.grpc.database.ServiceGrpc;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GrpcClient {

    private static GrpcClient instance;
    private final ManagedChannel channel;
    private final ServiceGrpc.ServiceBlockingStub blockingStub;

    private GrpcClient(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()  // For simplicity, use plaintext communication. In production, use SSL/TLS.
                .build();
        this.blockingStub = ServiceGrpc.newBlockingStub(channel);
    }
    public static GrpcClient getInstance(String host, int port) {
        if (instance == null) {
            instance = new GrpcClient(host, port);
        }
        return instance;
    }
    public static GrpcClient getInstance() {
        if (instance == null) {
            instance = new GrpcClient("localhost", 8080);
        }
        return instance;
    }
    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void create(String name, String path) {
        CreateRequest request = CreateRequest.newBuilder()
                .setName(name)
                .setPath(path)
                .build();

        try {
            SuccessfulResponse response = blockingStub.create(request);
            System.out.println("Create Response: " + response);
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }
    public void open(String path) {
        Path request = Path.newBuilder()
                .setPath(path)
                .build();

        try {
            SuccessfulResponse response = blockingStub.open(request);
            System.out.println("Open Response: " + response);
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }
    public void get_name() {
        EmptyRequest request = EmptyRequest.newBuilder().build();

        try {
            Name response = blockingStub.getName(request);
            System.out.println("Get Name Response: " + response.getName());
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }
    public void get_table_names() {
        EmptyRequest request = EmptyRequest.newBuilder().build();

        try {
            Names response = blockingStub.getTableNames(request);
            for (Name name : response.getNamesList()) {
                System.out.println("Table Name: " + name.getName());
            }
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }
    public void save() {
        EmptyRequest request = EmptyRequest.newBuilder().build();

        try {
            SuccessfulResponse response = blockingStub.save(request);
            System.out.println("Save Response: " + response);
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }

    public void remove_table(String tableName) {
        Name request = Name.newBuilder()
                .setName(tableName)
                .build();

        try {
            SuccessfulResponse response = blockingStub.removeTable(request);
            System.out.println("Remove Table Response: " + response);
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }

    public void create_Table(String tableName, List<Integer> dbTypes) {
        CreateTableRequest request = CreateTableRequest.newBuilder()
                .setName(tableName)
                .setSchema(Schema.newBuilder().addAllDBType(dbTypes))
                .build();

        try {
            SuccessfulResponse response = blockingStub.createTable(request);
            System.out.println("Create Table Response: " + response);
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }

    public void insert_row(String tableName, List<String> values) {
        InsertRowRequest request = InsertRowRequest.newBuilder()
                .setTable(tableName)
                .setRow(Row.newBuilder().addAllValue(values))
                .build();

        try {
            SuccessfulResponse response = blockingStub.insertRow(request);
            System.out.println("Insert Row Response: " + response);
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }

    public void remove_row(String tableName, int rowIndex) {
        RowPosition request = RowPosition.newBuilder()
                .setTable(tableName)
                .setIndex(rowIndex)
                .build();

        try {
            SuccessfulResponse response = blockingStub.removeRow(request);
            System.out.println("Remove Row Response: " + response);
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }
    public void get_table_schema(String tableName) {
        Table request = Table.newBuilder()
                .setTable(tableName)
                .build();

        try {
            Schema response = blockingStub.getTableSchema(request);
            System.out.println("Get Table Schema Response: " + response);
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }

    public void get_rows_sorted(String tableName, int sortedBy) {
        SortedRequest request = SortedRequest.newBuilder()
                .setTable(tableName)
                .setSortedBy(sortedBy)
                .build();

        try {
            Rows response = blockingStub.getRowsSorted(request);
            System.out.println("Get Rows Sorted Response: " + response);
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }

    public static void main(String[] args) {
        GrpcClient client = new GrpcClient("localhost", 50051);

        // Example usage
        client.create("example_table", "/path/to/table");
        client.open("/path/to/table");

        // Shutdown the channel when done
        try {
            client.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
