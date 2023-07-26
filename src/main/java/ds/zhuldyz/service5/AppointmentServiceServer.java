package ds.zhuldyz.service5;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class AppointmentServiceServer {
    private static final int PORT = 50053;

    public static void main(String[] args) throws IOException, InterruptedException {
        AppointmentServiceServer server = new AppointmentServiceServer();
        server.start();
        server.blockUntilShutdown();
    }

    private Server grpcServer;

    private void start() throws IOException {
        grpcServer = ServerBuilder.forPort(PORT)
                .addService(new AppointmentServiceImplement())
                .build()
                .start();

        System.out.println("Server started, listening on port " + PORT);

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.err.println("Shutting down gRPC server since JVM is shutting down");
                AppointmentServiceServer.this.stop();
                System.err.println("Server shut down");
            }
        });
    }

    private void stop() {
        if (grpcServer != null) {
            grpcServer.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (grpcServer != null) {
            grpcServer.awaitTermination();
        }
    }
}
