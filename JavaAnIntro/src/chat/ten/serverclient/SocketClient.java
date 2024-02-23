package chat.ten.serverclient;

import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {

	public static void main(String[] args)
	 {
		String s;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer 1");
		int num1 = 5;
		System.out.println("Enter an integer 1");
		int num2 = 6;
		keyboard.close();
	  Scanner inputStream = null;
	  PrintWriter outputStream = null;
	  try
	  {
	   // Connect to server on same machine, port 6789
	   Socket clientSocket = new Socket("localhost",6789);
	   // Set up streams to send/receive data
	   inputStream = new Scanner(new
	     InputStreamReader(clientSocket.getInputStream()));
	   outputStream = new PrintWriter(new
	     DataOutputStream(clientSocket.getOutputStream()));
	   // Send "Java" to the server
	   outputStream.println(num1);
	   outputStream.println(num2);
	   outputStream.flush(); // Sends data to the stream
	   // Read everything from the server until no
	   // more lines and output it to the screen
	   while (inputStream.hasNextLine())
	   {
	     s = inputStream.nextLine();
	     System.out.println(s);
	   }
	   inputStream.close();
	   outputStream.close();
	  }
	  catch (Exception e)
	  {
	   // If any exception occurs, display it
	   System.out.println("Error " + e);
	  }
	} }
