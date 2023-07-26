package ds.zhuldyz.service4;

import ds.zhuldyz.service4.PrescriptionManagementServiceGrpc.PrescriptionManagementServiceImplBase;
import ds.zhuldyz.service4.Service4Proto.CreatePrescriptionRequest;
import ds.zhuldyz.service4.Service4Proto.CreatePrescriptionResponse;
import io.grpc.stub.StreamObserver;

public class PrescriptionManagementServiceImplementation extends PrescriptionManagementServiceImplBase {

  @Override
  public void createPrescription(CreatePrescriptionRequest request,
                                 StreamObserver<CreatePrescriptionResponse> responseObserver) {
    // Retrieve patient ID and doctor ID from the request
    String patientId = request.getPatientId();
    String doctorId = request.getDoctorId();

    // TODO: Implement prescription creation logic
    

    // Create the prescription response
    CreatePrescriptionResponse response = CreatePrescriptionResponse.newBuilder()
        .setMedicineName("Sample Medicine")
        .setDose("Sample Dose")
        .build();

    // Send the response to the client
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}
