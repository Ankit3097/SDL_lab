// server side
import java.net.*;
import java.io.*;
import java.lang.*;


public class Server
{
	Socket clientSocket = null;
	ServerSocket serverSocket = null;
	DataInputStream input = null;
	
	public Server()
	{	
		try
		{				
			ServerSocket serverSock = new ServerSocket(3000);
			System.out.println("Server Socket created");
			System.out.println("Waiting for a client");
				
			clientSocket = serverSocket.accept();
			
			//input = new DataInputStream(new BufferedReader ( clientSocket.getInputStream() ) );
			input = new DataInputStream(new BufferedInputStream( clientSocket.getInputStream() ));
			
			String s = input.readLine();
			System.out.println("client " + s);
			
			clientSocket.close();
			serverSocket.close();					
		}
			
		catch( Exception e )
		{
			e.printStackTrace();
		}	
	}
	
	public static void main(String... args)
	{
		Server server = new Server();
	}	
}		

		

