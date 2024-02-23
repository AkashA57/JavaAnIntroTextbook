package chat.ten.serverclient;

import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServer
{
 public static void main(String[] args)
 {
  int sum = 0;
  Scanner inputStream = null;
  PrintWriter outputStream = null;
  ServerSocket serverSocket = null;
  try
  {
        // Wait for connection on port 6789
        System.out.println("Waiting for a connection.");
        serverSocket = new ServerSocket(6789);
        Socket socket = serverSocket.accept();
        // Connection made, set up streams
        inputStream = new Scanner(new
          InputStreamReader(socket.getInputStream()));
        outputStream = new PrintWriter(new
          DataOutputStream(socket.getOutputStream()));
      // Read a line from the client
        System.out.println("Before while.");
        while(inputStream.hasNextInt()) {
        	System.out.println("Entering");
        	System.out.println(sum);
        	sum = sum + inputStream.nextInt();
        	System.out.println(sum);
        }
        System.out.println("After while.");

        // Output text to the client
                     outputStream.println("Well, ");
                     outputStream.println(sum +
                          " is a total!");
                     outputStream.flush();
                     System.out.println("Closing connection");
                     inputStream.close();
                     outputStream.close();
                   }
                   catch (Exception e)
                   {
                     // If any exception occurs, display it
                     System.out.println("Error " + e);
                  }
} }
