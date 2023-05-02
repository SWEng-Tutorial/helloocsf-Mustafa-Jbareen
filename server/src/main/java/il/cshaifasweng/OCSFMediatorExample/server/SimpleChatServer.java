package il.cshaifasweng.OCSFMediatorExample.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class SimpleChatServer
{
	
	private static SimpleServer server;
    public static void main( String[] args ) throws IOException
    {
        server = new SimpleServer(3012);
        System.out.println("server is listening");
        server.listen();
    }
}
