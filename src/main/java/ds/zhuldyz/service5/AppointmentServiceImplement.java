package ds.zhuldyz.service5;

import ds.zhuldyz.service5.AppointmentServiceGrpc.AppointmentServiceImplBase;
import ds.zhuldyz.service5.Service5Proto.AppointmentRequest;
import ds.zhuldyz.service5.Service5Proto.AppointmentResponse;
import io.grpc.stub.StreamObserver;

public class AppointmentServiceImplement extends AppointmentServiceImplBase {

	 public void bookAppointment(AppointmentRequest request, StreamObserver<AppointmentResponse> responseObserver) {
	        // Extract the required information from the request
	        String patientId = request.getPatientId();
	        String doctorId = request.getDoctorId();
	        String appointmentDate = request.getAppointmentDate();

	        // Create an appointment ID. In a real application, this would probably involve
	        // some business logic and communication with a database.
	        String appointmentId = patientId + "_" + doctorId + "_" + appointmentDate;

	        // Create a response
	        AppointmentResponse response = AppointmentResponse.newBuilder()
	                .setAppointmentId(appointmentId)
	                .build();

	        // Use responseObserver to send a single response back
	        responseObserver.onNext(response);

	        // Complete the RPC call
	        responseObserver.onCompleted();
	    }
}
