package io.grpc.database;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
/*@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: database.proto")*/
public final class ServiceGrpc {

  private ServiceGrpc() {}

  public static final String SERVICE_NAME = "database.Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.database.Database.CreateRequest,
      io.grpc.database.Database.SuccessfulResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = io.grpc.database.Database.CreateRequest.class,
      responseType = io.grpc.database.Database.SuccessfulResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.Database.CreateRequest,
      io.grpc.database.Database.SuccessfulResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.Database.CreateRequest, io.grpc.database.Database.SuccessfulResponse> getCreateMethod;
    if ((getCreateMethod = ServiceGrpc.getCreateMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCreateMethod = ServiceGrpc.getCreateMethod) == null) {
          ServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.Database.CreateRequest, io.grpc.database.Database.SuccessfulResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.SuccessfulResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.Database.Path,
      io.grpc.database.Database.SuccessfulResponse> getOpenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "open",
      requestType = io.grpc.database.Database.Path.class,
      responseType = io.grpc.database.Database.SuccessfulResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.Database.Path,
      io.grpc.database.Database.SuccessfulResponse> getOpenMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.Database.Path, io.grpc.database.Database.SuccessfulResponse> getOpenMethod;
    if ((getOpenMethod = ServiceGrpc.getOpenMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getOpenMethod = ServiceGrpc.getOpenMethod) == null) {
          ServiceGrpc.getOpenMethod = getOpenMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.Database.Path, io.grpc.database.Database.SuccessfulResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "open"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.Path.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.SuccessfulResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("open"))
              .build();
        }
      }
    }
    return getOpenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.Database.EmptyRequest,
      io.grpc.database.Database.Name> getGetNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get_name",
      requestType = io.grpc.database.Database.EmptyRequest.class,
      responseType = io.grpc.database.Database.Name.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.Database.EmptyRequest,
      io.grpc.database.Database.Name> getGetNameMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.Database.EmptyRequest, io.grpc.database.Database.Name> getGetNameMethod;
    if ((getGetNameMethod = ServiceGrpc.getGetNameMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetNameMethod = ServiceGrpc.getGetNameMethod) == null) {
          ServiceGrpc.getGetNameMethod = getGetNameMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.Database.EmptyRequest, io.grpc.database.Database.Name>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get_name"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.Name.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("get_name"))
              .build();
        }
      }
    }
    return getGetNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.Database.EmptyRequest,
      io.grpc.database.Database.Names> getGetTableNamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get_table_names",
      requestType = io.grpc.database.Database.EmptyRequest.class,
      responseType = io.grpc.database.Database.Names.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.Database.EmptyRequest,
      io.grpc.database.Database.Names> getGetTableNamesMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.Database.EmptyRequest, io.grpc.database.Database.Names> getGetTableNamesMethod;
    if ((getGetTableNamesMethod = ServiceGrpc.getGetTableNamesMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetTableNamesMethod = ServiceGrpc.getGetTableNamesMethod) == null) {
          ServiceGrpc.getGetTableNamesMethod = getGetTableNamesMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.Database.EmptyRequest, io.grpc.database.Database.Names>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get_table_names"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.Names.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("get_table_names"))
              .build();
        }
      }
    }
    return getGetTableNamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.Database.EmptyRequest,
      io.grpc.database.Database.SuccessfulResponse> getSaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "save",
      requestType = io.grpc.database.Database.EmptyRequest.class,
      responseType = io.grpc.database.Database.SuccessfulResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.Database.EmptyRequest,
      io.grpc.database.Database.SuccessfulResponse> getSaveMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.Database.EmptyRequest, io.grpc.database.Database.SuccessfulResponse> getSaveMethod;
    if ((getSaveMethod = ServiceGrpc.getSaveMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getSaveMethod = ServiceGrpc.getSaveMethod) == null) {
          ServiceGrpc.getSaveMethod = getSaveMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.Database.EmptyRequest, io.grpc.database.Database.SuccessfulResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "save"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.SuccessfulResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("save"))
              .build();
        }
      }
    }
    return getSaveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.Database.Name,
      io.grpc.database.Database.SuccessfulResponse> getRemoveTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "remove_table",
      requestType = io.grpc.database.Database.Name.class,
      responseType = io.grpc.database.Database.SuccessfulResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.Database.Name,
      io.grpc.database.Database.SuccessfulResponse> getRemoveTableMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.Database.Name, io.grpc.database.Database.SuccessfulResponse> getRemoveTableMethod;
    if ((getRemoveTableMethod = ServiceGrpc.getRemoveTableMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getRemoveTableMethod = ServiceGrpc.getRemoveTableMethod) == null) {
          ServiceGrpc.getRemoveTableMethod = getRemoveTableMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.Database.Name, io.grpc.database.Database.SuccessfulResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "remove_table"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.Name.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.SuccessfulResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("remove_table"))
              .build();
        }
      }
    }
    return getRemoveTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.Database.CreateTableRequest,
      io.grpc.database.Database.SuccessfulResponse> getCreateTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create_table",
      requestType = io.grpc.database.Database.CreateTableRequest.class,
      responseType = io.grpc.database.Database.SuccessfulResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.Database.CreateTableRequest,
      io.grpc.database.Database.SuccessfulResponse> getCreateTableMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.Database.CreateTableRequest, io.grpc.database.Database.SuccessfulResponse> getCreateTableMethod;
    if ((getCreateTableMethod = ServiceGrpc.getCreateTableMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCreateTableMethod = ServiceGrpc.getCreateTableMethod) == null) {
          ServiceGrpc.getCreateTableMethod = getCreateTableMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.Database.CreateTableRequest, io.grpc.database.Database.SuccessfulResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create_table"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.CreateTableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.SuccessfulResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("create_table"))
              .build();
        }
      }
    }
    return getCreateTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.Database.RowPosition,
      io.grpc.database.Database.SuccessfulResponse> getRemoveRowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "remove_row",
      requestType = io.grpc.database.Database.RowPosition.class,
      responseType = io.grpc.database.Database.SuccessfulResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.Database.RowPosition,
      io.grpc.database.Database.SuccessfulResponse> getRemoveRowMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.Database.RowPosition, io.grpc.database.Database.SuccessfulResponse> getRemoveRowMethod;
    if ((getRemoveRowMethod = ServiceGrpc.getRemoveRowMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getRemoveRowMethod = ServiceGrpc.getRemoveRowMethod) == null) {
          ServiceGrpc.getRemoveRowMethod = getRemoveRowMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.Database.RowPosition, io.grpc.database.Database.SuccessfulResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "remove_row"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.RowPosition.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.SuccessfulResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("remove_row"))
              .build();
        }
      }
    }
    return getRemoveRowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.Database.InsertRowRequest,
      io.grpc.database.Database.SuccessfulResponse> getInsertRowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "insert_row",
      requestType = io.grpc.database.Database.InsertRowRequest.class,
      responseType = io.grpc.database.Database.SuccessfulResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.Database.InsertRowRequest,
      io.grpc.database.Database.SuccessfulResponse> getInsertRowMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.Database.InsertRowRequest, io.grpc.database.Database.SuccessfulResponse> getInsertRowMethod;
    if ((getInsertRowMethod = ServiceGrpc.getInsertRowMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getInsertRowMethod = ServiceGrpc.getInsertRowMethod) == null) {
          ServiceGrpc.getInsertRowMethod = getInsertRowMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.Database.InsertRowRequest, io.grpc.database.Database.SuccessfulResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "insert_row"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.InsertRowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.SuccessfulResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("insert_row"))
              .build();
        }
      }
    }
    return getInsertRowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.Database.Table,
      io.grpc.database.Database.Schema> getGetTableSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get_table_schema",
      requestType = io.grpc.database.Database.Table.class,
      responseType = io.grpc.database.Database.Schema.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.Database.Table,
      io.grpc.database.Database.Schema> getGetTableSchemaMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.Database.Table, io.grpc.database.Database.Schema> getGetTableSchemaMethod;
    if ((getGetTableSchemaMethod = ServiceGrpc.getGetTableSchemaMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetTableSchemaMethod = ServiceGrpc.getGetTableSchemaMethod) == null) {
          ServiceGrpc.getGetTableSchemaMethod = getGetTableSchemaMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.Database.Table, io.grpc.database.Database.Schema>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get_table_schema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.Table.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.Schema.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("get_table_schema"))
              .build();
        }
      }
    }
    return getGetTableSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.database.Database.SortedRequest,
      io.grpc.database.Database.Rows> getGetRowsSortedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get_rows_sorted",
      requestType = io.grpc.database.Database.SortedRequest.class,
      responseType = io.grpc.database.Database.Rows.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.database.Database.SortedRequest,
      io.grpc.database.Database.Rows> getGetRowsSortedMethod() {
    io.grpc.MethodDescriptor<io.grpc.database.Database.SortedRequest, io.grpc.database.Database.Rows> getGetRowsSortedMethod;
    if ((getGetRowsSortedMethod = ServiceGrpc.getGetRowsSortedMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetRowsSortedMethod = ServiceGrpc.getGetRowsSortedMethod) == null) {
          ServiceGrpc.getGetRowsSortedMethod = getGetRowsSortedMethod =
              io.grpc.MethodDescriptor.<io.grpc.database.Database.SortedRequest, io.grpc.database.Database.Rows>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get_rows_sorted"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.SortedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.database.Database.Rows.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("get_rows_sorted"))
              .build();
        }
      }
    }
    return getGetRowsSortedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceStub>() {
        @java.lang.Override
        public ServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceStub(channel, callOptions);
        }
      };
    return ServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingStub>() {
        @java.lang.Override
        public ServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceBlockingStub(channel, callOptions);
        }
      };
    return ServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceFutureStub>() {
        @java.lang.Override
        public ServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceFutureStub(channel, callOptions);
        }
      };
    return ServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(io.grpc.database.Database.CreateRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.SuccessfulResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void open(io.grpc.database.Database.Path request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.SuccessfulResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenMethod(), responseObserver);
    }

    /**
     */
    public void getName(io.grpc.database.Database.EmptyRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.Name> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNameMethod(), responseObserver);
    }

    /**
     */
    public void getTableNames(io.grpc.database.Database.EmptyRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.Names> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTableNamesMethod(), responseObserver);
    }

    /**
     */
    public void save(io.grpc.database.Database.EmptyRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.SuccessfulResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveMethod(), responseObserver);
    }

    /**
     */
    public void removeTable(io.grpc.database.Database.Name request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.SuccessfulResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveTableMethod(), responseObserver);
    }

    /**
     */
    public void createTable(io.grpc.database.Database.CreateTableRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.SuccessfulResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTableMethod(), responseObserver);
    }

    /**
     */
    public void removeRow(io.grpc.database.Database.RowPosition request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.SuccessfulResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveRowMethod(), responseObserver);
    }

    /**
     */
    public void insertRow(io.grpc.database.Database.InsertRowRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.SuccessfulResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertRowMethod(), responseObserver);
    }

    /**
     */
    public void getTableSchema(io.grpc.database.Database.Table request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.Schema> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTableSchemaMethod(), responseObserver);
    }

    /**
     */
    public void getRowsSorted(io.grpc.database.Database.SortedRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.Rows> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRowsSortedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.database.Database.CreateRequest,
                io.grpc.database.Database.SuccessfulResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getOpenMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.database.Database.Path,
                io.grpc.database.Database.SuccessfulResponse>(
                  this, METHODID_OPEN)))
          .addMethod(
            getGetNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.database.Database.EmptyRequest,
                io.grpc.database.Database.Name>(
                  this, METHODID_GET_NAME)))
          .addMethod(
            getGetTableNamesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.database.Database.EmptyRequest,
                io.grpc.database.Database.Names>(
                  this, METHODID_GET_TABLE_NAMES)))
          .addMethod(
            getSaveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.database.Database.EmptyRequest,
                io.grpc.database.Database.SuccessfulResponse>(
                  this, METHODID_SAVE)))
          .addMethod(
            getRemoveTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.database.Database.Name,
                io.grpc.database.Database.SuccessfulResponse>(
                  this, METHODID_REMOVE_TABLE)))
          .addMethod(
            getCreateTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.database.Database.CreateTableRequest,
                io.grpc.database.Database.SuccessfulResponse>(
                  this, METHODID_CREATE_TABLE)))
          .addMethod(
            getRemoveRowMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.database.Database.RowPosition,
                io.grpc.database.Database.SuccessfulResponse>(
                  this, METHODID_REMOVE_ROW)))
          .addMethod(
            getInsertRowMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.database.Database.InsertRowRequest,
                io.grpc.database.Database.SuccessfulResponse>(
                  this, METHODID_INSERT_ROW)))
          .addMethod(
            getGetTableSchemaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.database.Database.Table,
                io.grpc.database.Database.Schema>(
                  this, METHODID_GET_TABLE_SCHEMA)))
          .addMethod(
            getGetRowsSortedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.database.Database.SortedRequest,
                io.grpc.database.Database.Rows>(
                  this, METHODID_GET_ROWS_SORTED)))
          .build();
    }
  }

  /**
   */
  public static final class ServiceStub extends io.grpc.stub.AbstractAsyncStub<ServiceStub> {
    private ServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(io.grpc.database.Database.CreateRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.SuccessfulResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void open(io.grpc.database.Database.Path request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.SuccessfulResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getName(io.grpc.database.Database.EmptyRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.Name> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTableNames(io.grpc.database.Database.EmptyRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.Names> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTableNamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void save(io.grpc.database.Database.EmptyRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.SuccessfulResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeTable(io.grpc.database.Database.Name request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.SuccessfulResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTable(io.grpc.database.Database.CreateTableRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.SuccessfulResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeRow(io.grpc.database.Database.RowPosition request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.SuccessfulResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveRowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void insertRow(io.grpc.database.Database.InsertRowRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.SuccessfulResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertRowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTableSchema(io.grpc.database.Database.Table request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.Schema> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTableSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRowsSorted(io.grpc.database.Database.SortedRequest request,
        io.grpc.stub.StreamObserver<io.grpc.database.Database.Rows> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRowsSortedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ServiceBlockingStub> {
    private ServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.database.Database.SuccessfulResponse create(io.grpc.database.Database.CreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.Database.SuccessfulResponse open(io.grpc.database.Database.Path request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.Database.Name getName(io.grpc.database.Database.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.Database.Names getTableNames(io.grpc.database.Database.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTableNamesMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.Database.SuccessfulResponse save(io.grpc.database.Database.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.Database.SuccessfulResponse removeTable(io.grpc.database.Database.Name request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.Database.SuccessfulResponse createTable(io.grpc.database.Database.CreateTableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.Database.SuccessfulResponse removeRow(io.grpc.database.Database.RowPosition request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveRowMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.Database.SuccessfulResponse insertRow(io.grpc.database.Database.InsertRowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertRowMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.Database.Schema getTableSchema(io.grpc.database.Database.Table request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTableSchemaMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.database.Database.Rows getRowsSorted(io.grpc.database.Database.SortedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRowsSortedMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ServiceFutureStub> {
    private ServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.Database.SuccessfulResponse> create(
        io.grpc.database.Database.CreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.Database.SuccessfulResponse> open(
        io.grpc.database.Database.Path request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.Database.Name> getName(
        io.grpc.database.Database.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.Database.Names> getTableNames(
        io.grpc.database.Database.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTableNamesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.Database.SuccessfulResponse> save(
        io.grpc.database.Database.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.Database.SuccessfulResponse> removeTable(
        io.grpc.database.Database.Name request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.Database.SuccessfulResponse> createTable(
        io.grpc.database.Database.CreateTableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.Database.SuccessfulResponse> removeRow(
        io.grpc.database.Database.RowPosition request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveRowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.Database.SuccessfulResponse> insertRow(
        io.grpc.database.Database.InsertRowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertRowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.Database.Schema> getTableSchema(
        io.grpc.database.Database.Table request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTableSchemaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.database.Database.Rows> getRowsSorted(
        io.grpc.database.Database.SortedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRowsSortedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_OPEN = 1;
  private static final int METHODID_GET_NAME = 2;
  private static final int METHODID_GET_TABLE_NAMES = 3;
  private static final int METHODID_SAVE = 4;
  private static final int METHODID_REMOVE_TABLE = 5;
  private static final int METHODID_CREATE_TABLE = 6;
  private static final int METHODID_REMOVE_ROW = 7;
  private static final int METHODID_INSERT_ROW = 8;
  private static final int METHODID_GET_TABLE_SCHEMA = 9;
  private static final int METHODID_GET_ROWS_SORTED = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((io.grpc.database.Database.CreateRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.Database.SuccessfulResponse>) responseObserver);
          break;
        case METHODID_OPEN:
          serviceImpl.open((io.grpc.database.Database.Path) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.Database.SuccessfulResponse>) responseObserver);
          break;
        case METHODID_GET_NAME:
          serviceImpl.getName((io.grpc.database.Database.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.Database.Name>) responseObserver);
          break;
        case METHODID_GET_TABLE_NAMES:
          serviceImpl.getTableNames((io.grpc.database.Database.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.Database.Names>) responseObserver);
          break;
        case METHODID_SAVE:
          serviceImpl.save((io.grpc.database.Database.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.Database.SuccessfulResponse>) responseObserver);
          break;
        case METHODID_REMOVE_TABLE:
          serviceImpl.removeTable((io.grpc.database.Database.Name) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.Database.SuccessfulResponse>) responseObserver);
          break;
        case METHODID_CREATE_TABLE:
          serviceImpl.createTable((io.grpc.database.Database.CreateTableRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.Database.SuccessfulResponse>) responseObserver);
          break;
        case METHODID_REMOVE_ROW:
          serviceImpl.removeRow((io.grpc.database.Database.RowPosition) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.Database.SuccessfulResponse>) responseObserver);
          break;
        case METHODID_INSERT_ROW:
          serviceImpl.insertRow((io.grpc.database.Database.InsertRowRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.Database.SuccessfulResponse>) responseObserver);
          break;
        case METHODID_GET_TABLE_SCHEMA:
          serviceImpl.getTableSchema((io.grpc.database.Database.Table) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.Database.Schema>) responseObserver);
          break;
        case METHODID_GET_ROWS_SORTED:
          serviceImpl.getRowsSorted((io.grpc.database.Database.SortedRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.database.Database.Rows>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.database.Database.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service");
    }
  }

  private static final class ServiceFileDescriptorSupplier
      extends ServiceBaseDescriptorSupplier {
    ServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceMethodDescriptorSupplier
      extends ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getOpenMethod())
              .addMethod(getGetNameMethod())
              .addMethod(getGetTableNamesMethod())
              .addMethod(getSaveMethod())
              .addMethod(getRemoveTableMethod())
              .addMethod(getCreateTableMethod())
              .addMethod(getRemoveRowMethod())
              .addMethod(getInsertRowMethod())
              .addMethod(getGetTableSchemaMethod())
              .addMethod(getGetRowsSortedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
