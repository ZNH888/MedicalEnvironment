package ds.zhuldyz.service1;

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
    comments = "Source: service1.proto")
public final class PatientMonitoringServiceGrpc {

  private PatientMonitoringServiceGrpc() {}

  public static final String SERVICE_NAME = "patientmonitoring.PatientMonitoringService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.zhuldyz.service1.Service1Proto.GetVitalSignsRequest,
      ds.zhuldyz.service1.Service1Proto.GetVitalSignsResponse> getGetVitalSignsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVitalSigns",
      requestType = ds.zhuldyz.service1.Service1Proto.GetVitalSignsRequest.class,
      responseType = ds.zhuldyz.service1.Service1Proto.GetVitalSignsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.zhuldyz.service1.Service1Proto.GetVitalSignsRequest,
      ds.zhuldyz.service1.Service1Proto.GetVitalSignsResponse> getGetVitalSignsMethod() {
    io.grpc.MethodDescriptor<ds.zhuldyz.service1.Service1Proto.GetVitalSignsRequest, ds.zhuldyz.service1.Service1Proto.GetVitalSignsResponse> getGetVitalSignsMethod;
    if ((getGetVitalSignsMethod = PatientMonitoringServiceGrpc.getGetVitalSignsMethod) == null) {
      synchronized (PatientMonitoringServiceGrpc.class) {
        if ((getGetVitalSignsMethod = PatientMonitoringServiceGrpc.getGetVitalSignsMethod) == null) {
          PatientMonitoringServiceGrpc.getGetVitalSignsMethod = getGetVitalSignsMethod = 
              io.grpc.MethodDescriptor.<ds.zhuldyz.service1.Service1Proto.GetVitalSignsRequest, ds.zhuldyz.service1.Service1Proto.GetVitalSignsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "patientmonitoring.PatientMonitoringService", "GetVitalSigns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.zhuldyz.service1.Service1Proto.GetVitalSignsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.zhuldyz.service1.Service1Proto.GetVitalSignsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientMonitoringServiceMethodDescriptorSupplier("GetVitalSigns"))
                  .build();
          }
        }
     }
     return getGetVitalSignsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.zhuldyz.service1.Service1Proto.SetAlertValueRequest,
      ds.zhuldyz.service1.Service1Proto.Acknowledgment> getSetAlertValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAlertValue",
      requestType = ds.zhuldyz.service1.Service1Proto.SetAlertValueRequest.class,
      responseType = ds.zhuldyz.service1.Service1Proto.Acknowledgment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.zhuldyz.service1.Service1Proto.SetAlertValueRequest,
      ds.zhuldyz.service1.Service1Proto.Acknowledgment> getSetAlertValueMethod() {
    io.grpc.MethodDescriptor<ds.zhuldyz.service1.Service1Proto.SetAlertValueRequest, ds.zhuldyz.service1.Service1Proto.Acknowledgment> getSetAlertValueMethod;
    if ((getSetAlertValueMethod = PatientMonitoringServiceGrpc.getSetAlertValueMethod) == null) {
      synchronized (PatientMonitoringServiceGrpc.class) {
        if ((getSetAlertValueMethod = PatientMonitoringServiceGrpc.getSetAlertValueMethod) == null) {
          PatientMonitoringServiceGrpc.getSetAlertValueMethod = getSetAlertValueMethod = 
              io.grpc.MethodDescriptor.<ds.zhuldyz.service1.Service1Proto.SetAlertValueRequest, ds.zhuldyz.service1.Service1Proto.Acknowledgment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "patientmonitoring.PatientMonitoringService", "SetAlertValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.zhuldyz.service1.Service1Proto.SetAlertValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.zhuldyz.service1.Service1Proto.Acknowledgment.getDefaultInstance()))
                  .setSchemaDescriptor(new PatientMonitoringServiceMethodDescriptorSupplier("SetAlertValue"))
                  .build();
          }
        }
     }
     return getSetAlertValueMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PatientMonitoringServiceStub newStub(io.grpc.Channel channel) {
    return new PatientMonitoringServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PatientMonitoringServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PatientMonitoringServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PatientMonitoringServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PatientMonitoringServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PatientMonitoringServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getVitalSigns(ds.zhuldyz.service1.Service1Proto.GetVitalSignsRequest request,
        io.grpc.stub.StreamObserver<ds.zhuldyz.service1.Service1Proto.GetVitalSignsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVitalSignsMethod(), responseObserver);
    }

    /**
     */
    public void setAlertValue(ds.zhuldyz.service1.Service1Proto.SetAlertValueRequest request,
        io.grpc.stub.StreamObserver<ds.zhuldyz.service1.Service1Proto.Acknowledgment> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAlertValueMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVitalSignsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.zhuldyz.service1.Service1Proto.GetVitalSignsRequest,
                ds.zhuldyz.service1.Service1Proto.GetVitalSignsResponse>(
                  this, METHODID_GET_VITAL_SIGNS)))
          .addMethod(
            getSetAlertValueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.zhuldyz.service1.Service1Proto.SetAlertValueRequest,
                ds.zhuldyz.service1.Service1Proto.Acknowledgment>(
                  this, METHODID_SET_ALERT_VALUE)))
          .build();
    }
  }

  /**
   */
  public static final class PatientMonitoringServiceStub extends io.grpc.stub.AbstractStub<PatientMonitoringServiceStub> {
    private PatientMonitoringServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientMonitoringServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientMonitoringServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientMonitoringServiceStub(channel, callOptions);
    }

    /**
     */
    public void getVitalSigns(ds.zhuldyz.service1.Service1Proto.GetVitalSignsRequest request,
        io.grpc.stub.StreamObserver<ds.zhuldyz.service1.Service1Proto.GetVitalSignsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVitalSignsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setAlertValue(ds.zhuldyz.service1.Service1Proto.SetAlertValueRequest request,
        io.grpc.stub.StreamObserver<ds.zhuldyz.service1.Service1Proto.Acknowledgment> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAlertValueMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PatientMonitoringServiceBlockingStub extends io.grpc.stub.AbstractStub<PatientMonitoringServiceBlockingStub> {
    private PatientMonitoringServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientMonitoringServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientMonitoringServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientMonitoringServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.zhuldyz.service1.Service1Proto.GetVitalSignsResponse getVitalSigns(ds.zhuldyz.service1.Service1Proto.GetVitalSignsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVitalSignsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ds.zhuldyz.service1.Service1Proto.Acknowledgment setAlertValue(ds.zhuldyz.service1.Service1Proto.SetAlertValueRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetAlertValueMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PatientMonitoringServiceFutureStub extends io.grpc.stub.AbstractStub<PatientMonitoringServiceFutureStub> {
    private PatientMonitoringServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PatientMonitoringServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientMonitoringServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PatientMonitoringServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.zhuldyz.service1.Service1Proto.GetVitalSignsResponse> getVitalSigns(
        ds.zhuldyz.service1.Service1Proto.GetVitalSignsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVitalSignsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.zhuldyz.service1.Service1Proto.Acknowledgment> setAlertValue(
        ds.zhuldyz.service1.Service1Proto.SetAlertValueRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAlertValueMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VITAL_SIGNS = 0;
  private static final int METHODID_SET_ALERT_VALUE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PatientMonitoringServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PatientMonitoringServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VITAL_SIGNS:
          serviceImpl.getVitalSigns((ds.zhuldyz.service1.Service1Proto.GetVitalSignsRequest) request,
              (io.grpc.stub.StreamObserver<ds.zhuldyz.service1.Service1Proto.GetVitalSignsResponse>) responseObserver);
          break;
        case METHODID_SET_ALERT_VALUE:
          serviceImpl.setAlertValue((ds.zhuldyz.service1.Service1Proto.SetAlertValueRequest) request,
              (io.grpc.stub.StreamObserver<ds.zhuldyz.service1.Service1Proto.Acknowledgment>) responseObserver);
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

  private static abstract class PatientMonitoringServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PatientMonitoringServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.zhuldyz.service1.Service1Proto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PatientMonitoringService");
    }
  }

  private static final class PatientMonitoringServiceFileDescriptorSupplier
      extends PatientMonitoringServiceBaseDescriptorSupplier {
    PatientMonitoringServiceFileDescriptorSupplier() {}
  }

  private static final class PatientMonitoringServiceMethodDescriptorSupplier
      extends PatientMonitoringServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PatientMonitoringServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PatientMonitoringServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PatientMonitoringServiceFileDescriptorSupplier())
              .addMethod(getGetVitalSignsMethod())
              .addMethod(getSetAlertValueMethod())
              .build();
        }
      }
    }
    return result;
  }
}
