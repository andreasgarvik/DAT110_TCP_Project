package no.hvl.dat110.messaging;

import java.io.IOException;

import java.net.Socket;
import java.net.UnknownHostException;

public class MessagingClient {

	private String server;
	private int port;

	public MessagingClient(String server, int port) {
		this.server = server;
		this.port = port;
	}

	// connect to messaging server
	public Connection connect() {
		
		// TODO
		// create TCP socket for client and connection
		
		Connection connection = null;

		try {
			Socket clientSocket = new Socket(server, port);
			connection = new Connection(clientSocket);
		} catch (IOException e) {
			e.printStackTrace();
		}


		return connection;
	}
}
