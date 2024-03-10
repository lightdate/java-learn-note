package learn.note.network_programming;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {

        try (Socket socket = new Socket("localhost", 8080)) {
            // Input stream from server
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            // Output stream to server
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            // Send data to server
            writer.println("Hello, Server!");

            // Read response from server
            String response = reader.readLine();
            System.out.println("Received from server: " + response);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
