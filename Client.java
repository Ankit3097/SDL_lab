// client side
import java.net.*;
import java.io.*;
import java.lang.*;

public class Client
{
	Socket clientSocket = null;
	DataOutputStream out = null;
	
	public Client()
	{
		try
		{
			clientSocket = new Socket("127.0.0.1", 3000);
			System.out.println("Client establishes connection to Server");
		
			//out = new DataOutputStream( newBufferedOutputStream ( client.getOutputStream() ) );
			out = new DataOutputStream(clientSocket.getOutputStream() );
			System.out.println("Sending data to Server");
			System.out.println("Hello!! Server");
			System.out.println("Data Sent");
			
			clientSocket.close();
		}
		
		catch( Exception e )
		{
			e.printStackTrace();
		}	
	}
	
	public static void main(String... args) 
	{
		Client c = new Client();
	}
}
	

