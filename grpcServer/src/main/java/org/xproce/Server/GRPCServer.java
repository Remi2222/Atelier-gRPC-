package org.xproce.Server;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.xproce.Service.BankGrpcService;
import java.io.IOException;
public class GRPCServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(5555)
                .addService(new BankGrpcService())
                .build();
        server.start();
        server.awaitTermination();
    }
}

