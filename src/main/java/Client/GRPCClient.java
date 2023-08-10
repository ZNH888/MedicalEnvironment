package Client;

import ds.zhuldyz.service1.PatientMonitoringServiceGrpc;
import ds.zhuldyz.service1.Service1Proto;
import ds.zhuldyz.service4.PrescriptionManagementServiceGrpc;
import ds.zhuldyz.service4.Service4Proto;
import ds.zhuldyz.service5.AppointmentServiceGrpc;
import ds.zhuldyz.service5.Service5Proto;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GRPCClient extends JFrame implements ActionListener {

	private static final String HOST = "localhost";
	private static final int PORT1 = 50051; 
	private static final int PORT4 = 50052; 
	private static final int PORT5 = 50053; 

	private PatientMonitoringServiceGrpc.PatientMonitoringServiceBlockingStub patientMonitoringStub;
	private PrescriptionManagementServiceGrpc.PrescriptionManagementServiceBlockingStub prescriptionManagementStub;
	private AppointmentServiceGrpc.AppointmentServiceBlockingStub appointmentStub;

	private JTextArea outputTextArea;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new GRPCClient().setVisible(true));
	}

	public GRPCClient() {
		setTitle("gRPC Client GUI");
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
		ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT1).usePlaintext().build();
		patientMonitoringStub = PatientMonitoringServiceGrpc.newBlockingStub(channel);

		channel = ManagedChannelBuilder.forAddress(HOST, PORT4).usePlaintext().build();
		prescriptionManagementStub = PrescriptionManagementServiceGrpc.newBlockingStub(channel);

		channel = ManagedChannelBuilder.forAddress(HOST, PORT5).usePlaintext().build();
		appointmentStub = AppointmentServiceGrpc.newBlockingStub(channel);

		JButton getVitalSignsButton = new JButton("Get Vital Signs");
		getVitalSignsButton.addActionListener(this);

		JButton createPrescriptionButton = new JButton("Create Prescription");
		createPrescriptionButton.addActionListener(this);

		JButton bookAppointmentButton = new JButton("Book Appointment");
		bookAppointmentButton.addActionListener(this);

		outputTextArea = new JTextArea(10, 30);
		outputTextArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(outputTextArea);

		JPanel buttonPanel = new JPanel();
		buttonPanel.add(getVitalSignsButton);
		buttonPanel.add(createPrescriptionButton);
		buttonPanel.add(bookAppointmentButton);

		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(buttonPanel, BorderLayout.NORTH);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		switch (command) {
		case "Get Vital Signs":
			getVitalSigns();
			break;
		case "Create Prescription":
			createPrescription();
			break;
		case "Book Appointment":
			bookAppointment();
			break;
		}
	}

	private void getVitalSigns() {
		Service1Proto.GetVitalSignsRequest request = Service1Proto.GetVitalSignsRequest.newBuilder()
				.setPatientId("12345") 
				.build();

		Service1Proto.GetVitalSignsResponse response = patientMonitoringStub.getVitalSigns(request);

		outputTextArea.append("Blood Pressure: " + response.getBloodPressure() + "\n");
		outputTextArea.append("Temperature: " + response.getTemperature() + "\n");
		outputTextArea.append("\n");
	}

	private void createPrescription() {
		Service4Proto.CreatePrescriptionRequest request = Service4Proto.CreatePrescriptionRequest.newBuilder().build();

		Service4Proto.CreatePrescriptionResponse response = prescriptionManagementStub.createPrescription(request);

		outputTextArea.append("Prescription ID: " + response.getMedicineName() + " " + response.getDose() + "\n");
		outputTextArea.append("\n");
	}

	private void bookAppointment() {
		Service5Proto.AppointmentRequest request = Service5Proto.AppointmentRequest.newBuilder().setPatientId("12345") 
				.setDoctorId("67890")
				.setAppointmentDate("2023-09-24") 
				.build();

		Service5Proto.AppointmentResponse response = appointmentStub.bookAppointment(request);

		outputTextArea.append("Appointment ID: " + response.getAppointmentId() + "\n");
		outputTextArea.append("\n");
	}
}
