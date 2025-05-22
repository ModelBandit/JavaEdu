package Socketp;

import java.net.ServerSocket;
import java.net.Socket;

import java.io.IOException;

public class Server {
	public Server() {

	}
	
	public ServerSocket CreateServerSocket() {
		try {
			return new ServerSocket(8989);
		}
		catch(IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}

