package learn.note.network_programming;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Service {
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server waiting for client connection...");
            Socket clientSocket = serverSocket.accept();

            // Input stream from client
            InputStream input = clientSocket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            // Output stream to client
            OutputStream output = clientSocket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            // Read data from client
            String message = reader.readLine();
            System.out.println("Received from client: " + message);

            // Send response to client
            writer.println("Hello, Client!");

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
