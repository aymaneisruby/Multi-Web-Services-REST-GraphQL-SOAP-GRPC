package org.sid.customerservice.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: customerService.proto")
public final class CustomerGrpcServiceGrpc {

  private CustomerGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "CustomerGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.sid.customerservice.stubs.CustomerService.GetCustomerRequest,
      org.sid.customerservice.stubs.CustomerService.GetCustomerResponse> getGetCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCustomer",
      requestType = org.sid.customerservice.stubs.CustomerService.GetCustomerRequest.class,
      responseType = org.sid.customerservice.stubs.CustomerService.GetCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.customerservice.stubs.CustomerService.GetCustomerRequest,
      org.sid.customerservice.stubs.CustomerService.GetCustomerResponse> getGetCustomerMethod() {
    io.grpc.MethodDescriptor<org.sid.customerservice.stubs.CustomerService.GetCustomerRequest, org.sid.customerservice.stubs.CustomerService.GetCustomerResponse> getGetCustomerMethod;
    if ((getGetCustomerMethod = CustomerGrpcServiceGrpc.getGetCustomerMethod) == null) {
      synchronized (CustomerGrpcServiceGrpc.class) {
        if ((getGetCustomerMethod = CustomerGrpcServiceGrpc.getGetCustomerMethod) == null) {
          CustomerGrpcServiceGrpc.getGetCustomerMethod = getGetCustomerMethod = 
              io.grpc.MethodDescriptor.<org.sid.customerservice.stubs.CustomerService.GetCustomerRequest, org.sid.customerservice.stubs.CustomerService.GetCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CustomerGrpcService", "getCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.customerservice.stubs.CustomerService.GetCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.customerservice.stubs.CustomerService.GetCustomerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerGrpcServiceMethodDescriptorSupplier("getCustomer"))
                  .build();
          }
        }
     }
     return getGetCustomerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.customerservice.stubs.CustomerService.GetAllCustomersRequest,
      org.sid.customerservice.stubs.CustomerService.GetAllCustomersResponse> getGetListCustomersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListCustomers",
      requestType = org.sid.customerservice.stubs.CustomerService.GetAllCustomersRequest.class,
      responseType = org.sid.customerservice.stubs.CustomerService.GetAllCustomersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.customerservice.stubs.CustomerService.GetAllCustomersRequest,
      org.sid.customerservice.stubs.CustomerService.GetAllCustomersResponse> getGetListCustomersMethod() {
    io.grpc.MethodDescriptor<org.sid.customerservice.stubs.CustomerService.GetAllCustomersRequest, org.sid.customerservice.stubs.CustomerService.GetAllCustomersResponse> getGetListCustomersMethod;
    if ((getGetListCustomersMethod = CustomerGrpcServiceGrpc.getGetListCustomersMethod) == null) {
      synchronized (CustomerGrpcServiceGrpc.class) {
        if ((getGetListCustomersMethod = CustomerGrpcServiceGrpc.getGetListCustomersMethod) == null) {
          CustomerGrpcServiceGrpc.getGetListCustomersMethod = getGetListCustomersMethod = 
              io.grpc.MethodDescriptor.<org.sid.customerservice.stubs.CustomerService.GetAllCustomersRequest, org.sid.customerservice.stubs.CustomerService.GetAllCustomersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CustomerGrpcService", "getListCustomers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.customerservice.stubs.CustomerService.GetAllCustomersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.customerservice.stubs.CustomerService.GetAllCustomersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerGrpcServiceMethodDescriptorSupplier("getListCustomers"))
                  .build();
          }
        }
     }
     return getGetListCustomersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.customerservice.stubs.CustomerService.SaveCustomerRequest,
      org.sid.customerservice.stubs.CustomerService.SaveCustomerResponse> getSaveCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveCustomer",
      requestType = org.sid.customerservice.stubs.CustomerService.SaveCustomerRequest.class,
      responseType = org.sid.customerservice.stubs.CustomerService.SaveCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.customerservice.stubs.CustomerService.SaveCustomerRequest,
      org.sid.customerservice.stubs.CustomerService.SaveCustomerResponse> getSaveCustomerMethod() {
    io.grpc.MethodDescriptor<org.sid.customerservice.stubs.CustomerService.SaveCustomerRequest, org.sid.customerservice.stubs.CustomerService.SaveCustomerResponse> getSaveCustomerMethod;
    if ((getSaveCustomerMethod = CustomerGrpcServiceGrpc.getSaveCustomerMethod) == null) {
      synchronized (CustomerGrpcServiceGrpc.class) {
        if ((getSaveCustomerMethod = CustomerGrpcServiceGrpc.getSaveCustomerMethod) == null) {
          CustomerGrpcServiceGrpc.getSaveCustomerMethod = getSaveCustomerMethod = 
              io.grpc.MethodDescriptor.<org.sid.customerservice.stubs.CustomerService.SaveCustomerRequest, org.sid.customerservice.stubs.CustomerService.SaveCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CustomerGrpcService", "saveCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.customerservice.stubs.CustomerService.SaveCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.customerservice.stubs.CustomerService.SaveCustomerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerGrpcServiceMethodDescriptorSupplier("saveCustomer"))
                  .build();
          }
        }
     }
     return getSaveCustomerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new CustomerGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomerGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomerGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CustomerGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCustomer(org.sid.customerservice.stubs.CustomerService.GetCustomerRequest request,
        io.grpc.stub.StreamObserver<org.sid.customerservice.stubs.CustomerService.GetCustomerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerMethod(), responseObserver);
    }

    /**
     */
    public void getListCustomers(org.sid.customerservice.stubs.CustomerService.GetAllCustomersRequest request,
        io.grpc.stub.StreamObserver<org.sid.customerservice.stubs.CustomerService.GetAllCustomersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListCustomersMethod(), responseObserver);
    }

    /**
     */
    public void saveCustomer(org.sid.customerservice.stubs.CustomerService.SaveCustomerRequest request,
        io.grpc.stub.StreamObserver<org.sid.customerservice.stubs.CustomerService.SaveCustomerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveCustomerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.customerservice.stubs.CustomerService.GetCustomerRequest,
                org.sid.customerservice.stubs.CustomerService.GetCustomerResponse>(
                  this, METHODID_GET_CUSTOMER)))
          .addMethod(
            getGetListCustomersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.customerservice.stubs.CustomerService.GetAllCustomersRequest,
                org.sid.customerservice.stubs.CustomerService.GetAllCustomersResponse>(
                  this, METHODID_GET_LIST_CUSTOMERS)))
          .addMethod(
            getSaveCustomerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.customerservice.stubs.CustomerService.SaveCustomerRequest,
                org.sid.customerservice.stubs.CustomerService.SaveCustomerResponse>(
                  this, METHODID_SAVE_CUSTOMER)))
          .build();
    }
  }

  /**
   */
  public static final class CustomerGrpcServiceStub extends io.grpc.stub.AbstractStub<CustomerGrpcServiceStub> {
    private CustomerGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCustomer(org.sid.customerservice.stubs.CustomerService.GetCustomerRequest request,
        io.grpc.stub.StreamObserver<org.sid.customerservice.stubs.CustomerService.GetCustomerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListCustomers(org.sid.customerservice.stubs.CustomerService.GetAllCustomersRequest request,
        io.grpc.stub.StreamObserver<org.sid.customerservice.stubs.CustomerService.GetAllCustomersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListCustomersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveCustomer(org.sid.customerservice.stubs.CustomerService.SaveCustomerRequest request,
        io.grpc.stub.StreamObserver<org.sid.customerservice.stubs.CustomerService.SaveCustomerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveCustomerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CustomerGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<CustomerGrpcServiceBlockingStub> {
    private CustomerGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.sid.customerservice.stubs.CustomerService.GetCustomerResponse getCustomer(org.sid.customerservice.stubs.CustomerService.GetCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.customerservice.stubs.CustomerService.GetAllCustomersResponse getListCustomers(org.sid.customerservice.stubs.CustomerService.GetAllCustomersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListCustomersMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.customerservice.stubs.CustomerService.SaveCustomerResponse saveCustomer(org.sid.customerservice.stubs.CustomerService.SaveCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveCustomerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CustomerGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<CustomerGrpcServiceFutureStub> {
    private CustomerGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.customerservice.stubs.CustomerService.GetCustomerResponse> getCustomer(
        org.sid.customerservice.stubs.CustomerService.GetCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.customerservice.stubs.CustomerService.GetAllCustomersResponse> getListCustomers(
        org.sid.customerservice.stubs.CustomerService.GetAllCustomersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListCustomersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.customerservice.stubs.CustomerService.SaveCustomerResponse> saveCustomer(
        org.sid.customerservice.stubs.CustomerService.SaveCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveCustomerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOMER = 0;
  private static final int METHODID_GET_LIST_CUSTOMERS = 1;
  private static final int METHODID_SAVE_CUSTOMER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CUSTOMER:
          serviceImpl.getCustomer((org.sid.customerservice.stubs.CustomerService.GetCustomerRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.customerservice.stubs.CustomerService.GetCustomerResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_CUSTOMERS:
          serviceImpl.getListCustomers((org.sid.customerservice.stubs.CustomerService.GetAllCustomersRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.customerservice.stubs.CustomerService.GetAllCustomersResponse>) responseObserver);
          break;
        case METHODID_SAVE_CUSTOMER:
          serviceImpl.saveCustomer((org.sid.customerservice.stubs.CustomerService.SaveCustomerRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.customerservice.stubs.CustomerService.SaveCustomerResponse>) responseObserver);
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

  private static abstract class CustomerGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.sid.customerservice.stubs.CustomerService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerGrpcService");
    }
  }

  private static final class CustomerGrpcServiceFileDescriptorSupplier
      extends CustomerGrpcServiceBaseDescriptorSupplier {
    CustomerGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerGrpcServiceMethodDescriptorSupplier
      extends CustomerGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerGrpcServiceFileDescriptorSupplier())
              .addMethod(getGetCustomerMethod())
              .addMethod(getGetListCustomersMethod())
              .addMethod(getSaveCustomerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
