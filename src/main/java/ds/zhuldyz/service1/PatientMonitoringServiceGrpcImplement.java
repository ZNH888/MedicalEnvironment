package ds.zhuldyz.service1;

import ds.zhuldyz.service1.PatientMonitoringServiceGrpc.PatientMonitoringServiceImplBase;
import ds.zhuldyz.service1.Service1Proto.Acknowledgment;
import ds.zhuldyz.service1.Service1Proto.GetVitalSignsRequest;
import ds.zhuldyz.service1.Service1Proto.GetVitalSignsResponse;
import ds.zhuldyz.service1.Service1Proto.SetAlertValueRequest;
import io.grpc.stub.StreamObserver;

public class PatientMonitoringServiceGrpcImplement extends PatientMonitoringServiceImplBase {

    @Override
    public void getVitalSigns(GetVitalSignsRequest request, StreamObserver<GetVitalSignsResponse> responseObserver) {
        // TODO: Implement logic to get patient's vital signs based on the request
        
        // code
        String patientId = request.getPatientId();
        // Perform necessary operations to get the patient's vital signs
        
        // Create the response message
        GetVitalSignsResponse response = GetVitalSignsResponse.newBuilder()
                .setBloodPressure(120) // Replace with actual blood pressure value
                .setTemperature(37) // Replace with actual temperature value
                .build();
        
        System.out.println("Receive message:"+patientId);
        
        // Send the response back to the client
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void setAlertValue(SetAlertValueRequest request, StreamObserver<Acknowledgment> responseObserver) {
        // TODO: Implement logic to set the values for alerts based on the request
        
        // code:
        String patientId = request.getPatientId();
        float bloodPressureValue = request.getBloodPressureValue();
        float temperatureValue = request.getTemperatureValue();
        // Perform necessary operations to set the alert values
        
        // Create the acknowledgment response
        Acknowledgment acknowledgment = Acknowledgment.newBuilder()
                .setSuccess(true) // Replace with appropriate success value
                .build();
        
        // Send the response back to the client
        responseObserver.onNext(acknowledgment);
        responseObserver.onCompleted();
    }
}
