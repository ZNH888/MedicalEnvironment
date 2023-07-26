package ds.zhuldyz.service5;

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
    comments = "Source: service5.proto")
public final class AppointmentServiceGrpc {

  private AppointmentServiceGrpc() {}

  public static final String SERVICE_NAME = "appointment.AppointmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.zhuldyz.service5.Service5Proto.AppointmentRequest,
      ds.zhuldyz.service5.Service5Proto.AppointmentResponse> getBookAppointmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BookAppointment",
      requestType = ds.zhuldyz.service5.Service5Proto.AppointmentRequest.class,
      responseType = ds.zhuldyz.service5.Service5Proto.AppointmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.zhuldyz.service5.Service5Proto.AppointmentRequest,
      ds.zhuldyz.service5.Service5Proto.AppointmentResponse> getBookAppointmentMethod() {
    io.grpc.MethodDescriptor<ds.zhuldyz.service5.Service5Proto.AppointmentRequest, ds.zhuldyz.service5.Service5Proto.AppointmentResponse> getBookAppointmentMethod;
    if ((getBookAppointmentMethod = AppointmentServiceGrpc.getBookAppointmentMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getBookAppointmentMethod = AppointmentServiceGrpc.getBookAppointmentMethod) == null) {
          AppointmentServiceGrpc.getBookAppointmentMethod = getBookAppointmentMethod = 
              io.grpc.MethodDescriptor.<ds.zhuldyz.service5.Service5Proto.AppointmentRequest, ds.zhuldyz.service5.Service5Proto.AppointmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "appointment.AppointmentService", "BookAppointment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.zhuldyz.service5.Service5Proto.AppointmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.zhuldyz.service5.Service5Proto.AppointmentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("BookAppointment"))
                  .build();
          }
        }
     }
     return getBookAppointmentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AppointmentServiceStub newStub(io.grpc.Channel channel) {
    return new AppointmentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AppointmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AppointmentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AppointmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AppointmentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AppointmentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void bookAppointment(ds.zhuldyz.service5.Service5Proto.AppointmentRequest request,
        io.grpc.stub.StreamObserver<ds.zhuldyz.service5.Service5Proto.AppointmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBookAppointmentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBookAppointmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.zhuldyz.service5.Service5Proto.AppointmentRequest,
                ds.zhuldyz.service5.Service5Proto.AppointmentResponse>(
                  this, METHODID_BOOK_APPOINTMENT)))
          .build();
    }
  }

  /**
   */
  public static final class AppointmentServiceStub extends io.grpc.stub.AbstractStub<AppointmentServiceStub> {
    private AppointmentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AppointmentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppointmentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AppointmentServiceStub(channel, callOptions);
    }

    /**
     */
    public void bookAppointment(ds.zhuldyz.service5.Service5Proto.AppointmentRequest request,
        io.grpc.stub.StreamObserver<ds.zhuldyz.service5.Service5Proto.AppointmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBookAppointmentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AppointmentServiceBlockingStub extends io.grpc.stub.AbstractStub<AppointmentServiceBlockingStub> {
    private AppointmentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AppointmentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppointmentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AppointmentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.zhuldyz.service5.Service5Proto.AppointmentResponse bookAppointment(ds.zhuldyz.service5.Service5Proto.AppointmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getBookAppointmentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AppointmentServiceFutureStub extends io.grpc.stub.AbstractStub<AppointmentServiceFutureStub> {
    private AppointmentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AppointmentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppointmentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AppointmentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.zhuldyz.service5.Service5Proto.AppointmentResponse> bookAppointment(
        ds.zhuldyz.service5.Service5Proto.AppointmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBookAppointmentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BOOK_APPOINTMENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AppointmentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AppointmentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BOOK_APPOINTMENT:
          serviceImpl.bookAppointment((ds.zhuldyz.service5.Service5Proto.AppointmentRequest) request,
              (io.grpc.stub.StreamObserver<ds.zhuldyz.service5.Service5Proto.AppointmentResponse>) responseObserver);
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

  private static abstract class AppointmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AppointmentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.zhuldyz.service5.Service5Proto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AppointmentService");
    }
  }

  private static final class AppointmentServiceFileDescriptorSupplier
      extends AppointmentServiceBaseDescriptorSupplier {
    AppointmentServiceFileDescriptorSupplier() {}
  }

  private static final class AppointmentServiceMethodDescriptorSupplier
      extends AppointmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AppointmentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AppointmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AppointmentServiceFileDescriptorSupplier())
              .addMethod(getBookAppointmentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
