package ds.zhuldyz.service4;

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
    comments = "Source: service4.proto")
public final class PrescriptionManagementServiceGrpc {

  private PrescriptionManagementServiceGrpc() {}

  public static final String SERVICE_NAME = "prescription.PrescriptionManagementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.zhuldyz.service4.Service4Proto.CreatePrescriptionRequest,
      ds.zhuldyz.service4.Service4Proto.CreatePrescriptionResponse> getCreatePrescriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePrescription",
      requestType = ds.zhuldyz.service4.Service4Proto.CreatePrescriptionRequest.class,
      responseType = ds.zhuldyz.service4.Service4Proto.CreatePrescriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.zhuldyz.service4.Service4Proto.CreatePrescriptionRequest,
      ds.zhuldyz.service4.Service4Proto.CreatePrescriptionResponse> getCreatePrescriptionMethod() {
    io.grpc.MethodDescriptor<ds.zhuldyz.service4.Service4Proto.CreatePrescriptionRequest, ds.zhuldyz.service4.Service4Proto.CreatePrescriptionResponse> getCreatePrescriptionMethod;
    if ((getCreatePrescriptionMethod = PrescriptionManagementServiceGrpc.getCreatePrescriptionMethod) == null) {
      synchronized (PrescriptionManagementServiceGrpc.class) {
        if ((getCreatePrescriptionMethod = PrescriptionManagementServiceGrpc.getCreatePrescriptionMethod) == null) {
          PrescriptionManagementServiceGrpc.getCreatePrescriptionMethod = getCreatePrescriptionMethod = 
              io.grpc.MethodDescriptor.<ds.zhuldyz.service4.Service4Proto.CreatePrescriptionRequest, ds.zhuldyz.service4.Service4Proto.CreatePrescriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "prescription.PrescriptionManagementService", "CreatePrescription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.zhuldyz.service4.Service4Proto.CreatePrescriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.zhuldyz.service4.Service4Proto.CreatePrescriptionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PrescriptionManagementServiceMethodDescriptorSupplier("CreatePrescription"))
                  .build();
          }
        }
     }
     return getCreatePrescriptionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrescriptionManagementServiceStub newStub(io.grpc.Channel channel) {
    return new PrescriptionManagementServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrescriptionManagementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PrescriptionManagementServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrescriptionManagementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PrescriptionManagementServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PrescriptionManagementServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createPrescription(ds.zhuldyz.service4.Service4Proto.CreatePrescriptionRequest request,
        io.grpc.stub.StreamObserver<ds.zhuldyz.service4.Service4Proto.CreatePrescriptionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePrescriptionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePrescriptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.zhuldyz.service4.Service4Proto.CreatePrescriptionRequest,
                ds.zhuldyz.service4.Service4Proto.CreatePrescriptionResponse>(
                  this, METHODID_CREATE_PRESCRIPTION)))
          .build();
    }
  }

  /**
   */
  public static final class PrescriptionManagementServiceStub extends io.grpc.stub.AbstractStub<PrescriptionManagementServiceStub> {
    private PrescriptionManagementServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrescriptionManagementServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrescriptionManagementServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrescriptionManagementServiceStub(channel, callOptions);
    }

    /**
     */
    public void createPrescription(ds.zhuldyz.service4.Service4Proto.CreatePrescriptionRequest request,
        io.grpc.stub.StreamObserver<ds.zhuldyz.service4.Service4Proto.CreatePrescriptionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePrescriptionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PrescriptionManagementServiceBlockingStub extends io.grpc.stub.AbstractStub<PrescriptionManagementServiceBlockingStub> {
    private PrescriptionManagementServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrescriptionManagementServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrescriptionManagementServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrescriptionManagementServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.zhuldyz.service4.Service4Proto.CreatePrescriptionResponse createPrescription(ds.zhuldyz.service4.Service4Proto.CreatePrescriptionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreatePrescriptionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PrescriptionManagementServiceFutureStub extends io.grpc.stub.AbstractStub<PrescriptionManagementServiceFutureStub> {
    private PrescriptionManagementServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrescriptionManagementServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrescriptionManagementServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrescriptionManagementServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.zhuldyz.service4.Service4Proto.CreatePrescriptionResponse> createPrescription(
        ds.zhuldyz.service4.Service4Proto.CreatePrescriptionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePrescriptionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PRESCRIPTION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PrescriptionManagementServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrescriptionManagementServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PRESCRIPTION:
          serviceImpl.createPrescription((ds.zhuldyz.service4.Service4Proto.CreatePrescriptionRequest) request,
              (io.grpc.stub.StreamObserver<ds.zhuldyz.service4.Service4Proto.CreatePrescriptionResponse>) responseObserver);
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

  private static abstract class PrescriptionManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrescriptionManagementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.zhuldyz.service4.Service4Proto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PrescriptionManagementService");
    }
  }

  private static final class PrescriptionManagementServiceFileDescriptorSupplier
      extends PrescriptionManagementServiceBaseDescriptorSupplier {
    PrescriptionManagementServiceFileDescriptorSupplier() {}
  }

  private static final class PrescriptionManagementServiceMethodDescriptorSupplier
      extends PrescriptionManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrescriptionManagementServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PrescriptionManagementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrescriptionManagementServiceFileDescriptorSupplier())
              .addMethod(getCreatePrescriptionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
