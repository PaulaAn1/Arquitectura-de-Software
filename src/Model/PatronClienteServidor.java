package Model;

public class PatronClienteServidor {
    // Ejemplo simple de cliente-servidor usando Sockets
import java.io.*;
import java.net.*;

    // Servidor
    class Server {
        public static void main(String[] args) throws IOException {
            ServerSocket serverSocket = new ServerSocket(8080);
            Socket clientSocket = serverSocket.accept();
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                out.println("Servidor: " + inputLine);
            }
        }
    }

    // Cliente
    class Client {
        public static void main(String[] args) throws IOException {
            Socket socket = new Socket("localhost", 8080);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out.println("Hola, servidor");
            System.out.println("Respuesta: " + in.readLine());
        }
    }

}
