package assignment_5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerMain {
    private static ArrayList<ClientHandler> clients = new ArrayList<>();
    private static ExecutorService pool = Executors.newFixedThreadPool(4);

    public static void main (String[] args) throws IOException
    {
        ServerSocket listener = new ServerSocket(6666);
        int numClients = 0;
        while(true)
        {
            System.out.println("[SERVER] Waiting... ");
            Socket client = listener.accept();
            numClients++;
            System.out.println("[SERVER] Connected");
            System.out.println("[SERVER] " + numClients + " clients connected");
            ClientHandler clientThread = new ClientHandler(client, clients, numClients);
            clients.add(clientThread);
            pool.execute(clientThread);

        }
    }
}