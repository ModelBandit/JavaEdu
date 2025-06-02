package Socketp;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;

import java.util.Scanner;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.locks.Lock;

public class ServerMain {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Scanner scanner = new Scanner(System.in);
		
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			serverSocket = new ServerSocket(8989);
			socket = serverSocket.accept();
			
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			in = new BufferedReader(isr);
			out = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String inputMessage = in.readLine();
				if("quit".equalsIgnoreCase(inputMessage))
					break;
				
				System.out.println("from: " + inputMessage);
				System.out.print("send>>");
				
				String outputMessage = scanner.nextLine();
				out.println(outputMessage);
				out.flush();
				if("quit".equalsIgnoreCase(outputMessage))
					break;
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				scanner.close();
				socket.close();
				serverSocket.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

class Accepter extends Thread{
}