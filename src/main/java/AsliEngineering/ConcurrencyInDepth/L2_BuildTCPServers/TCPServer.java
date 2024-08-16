package AsliEngineering.ConcurrencyInDepth.L2_BuildTCPServers;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Project: DSAlgo
 * Package: AsliEngineering.ConcurrencyInDepth.L2_BuildTCPServers
 * <p>
 * User: piyushbajaj
 * Date: 10/08/23
 * Time: 1:55 pm
 * <p>
 * ref: <a href="https://www.codejava.net/java-se/networking/java-socket-server-examples-tcp-ip">...</a>
 */
public class TCPServer {
    public static void main(String[] args) {
        if (args.length < 1) {
            return;
        }

        int port = Integer.parseInt(args[0]);
        try (ServerSocket serverSocket = new ServerSocket(port)) {

            //Step 1: Start listening on the port
            //Try it out, by running this in terminal: java src/AsliEngineering/ConcurrencyInDepth/L2_BuildTCPServers/TCPServer.java 6868
            System.out.println("Server is listening on port " + port);

            while (true) {
                //Step 2: Wait for client to connect
                System.out.println("Waiting for a client to connect");
                Socket socket = serverSocket.accept();

                System.out.println("New Client Connected");

//                new ServerTh

                //Step 3: Send the response from the server to the connected client
                OutputStream outputStream = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(outputStream, true);

                writer.println(new Date());

//                socket.close();
//                serverSocket.close();
            }
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
