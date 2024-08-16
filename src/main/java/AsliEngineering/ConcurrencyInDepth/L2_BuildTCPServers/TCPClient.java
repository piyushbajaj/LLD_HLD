package AsliEngineering.ConcurrencyInDepth.L2_BuildTCPServers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Project: DSAlgo
 * Package: AsliEngineering.ConcurrencyInDepth.L2_BuildTCPServers
 * <p>
 * User: piyushbajaj
 * Date: 10/08/23
 * Time: 6:35 pm
 * <p>
 * ref: <a href="https://www.codejava.net/java-se/networking/java-socket-server-examples-tcp-ip">...</a>
 */

// This is responsible to connect to the server, and prints the data received
public class TCPClient {

    public static void main(String[] args) {
        if (args.length < 2) {
            return;
        }

        String hostName = args[0];
        int port = Integer.parseInt(args[1]);

        try (Socket socket = new Socket(hostName, port)) {

            //Step 4: Read the response from the server
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            System.out.println("Processing the request");

            Thread.sleep(8000);

            // Read the response from the server
            String time = bufferedReader.readLine();
            System.out.println(time);

        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
