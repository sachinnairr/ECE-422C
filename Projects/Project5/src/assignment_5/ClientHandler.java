package assignment_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientHandler implements Runnable {
    private Socket client;
    private BufferedReader in;
    private PrintWriter out;
    private int number;
    private ArrayList<ClientHandler> clients;
    private static ArrayList<Integer> disconnectedClients  = new ArrayList<>();

    public ClientHandler(Socket clientSocket, ArrayList<ClientHandler> clients, int number) throws IOException {

        this.client = clientSocket;
        this.clients = clients;
        this.number = number;
        in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        out = new PrintWriter(client.getOutputStream(), true);
    }

    @Override
    public void run() {
        try{
            out.println("[SERVER]: Connected: You are Client " + number);
            out.println("[SERVER]: Type 'quit' to quit.");
            out.println("[SERVER]: Type 'DM #' to DM a client .");
            out.println("[SERVER]: Or type 'toAll' to send to all users.");
            while (true)
            {
                try
                {
                    String request = in.readLine();

                    if(request.equals("quit"))
                    {
                        disconnectedClients.add(number);

                    }
                    else if(request.startsWith("message"))
                    {
                        int firstSpace = request.indexOf(" ");
                        if(firstSpace != -1)
                        {
                            if(new Scanner(request).useDelimiter("\\D+").hasNextInt())
                            {
                                int client = new Scanner(request).useDelimiter("\\D+").nextInt();
                                int i = clients.size();
                                if(client >= 0 && client <= i) {
                                    int digit = request.indexOf("" + client);
                                    String text = request.substring(digit + 1);
                                    if (text.length() != 0) {
                                        message(text.substring(1), client - 1, number - 1);
                                    }
                                }
                            }

                        }

                    }
                    else if (request.startsWith("toAll"))
                    {
                        int firstSpace = request.indexOf(" ");
                        if(firstSpace != -1)
                        {
                            toAll(request.substring(firstSpace + 1), number);
                        }

                    }
                }
                catch (NullPointerException n)
                {
                }
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        finally
        {
            out.close();
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

    private void message(String message, int to, int from)
    {
        ClientHandler sClient = clients.get(from);

        if(!(disconnectedClients.contains(to+1)))
        {
            ClientHandler rClient = clients.get(to);

            rClient.out.println("[CLIENT " + (from + 1) + "]: " + message);
            sClient.out.println("[YOU to CLIENT " + (to + 1) + "]: " + message);
        }
        else
        {
            sClient.out.println("[SERVER]: Client " + (from + 1) + " has disconnected.");
        }

    }

    private void toAll(String substring, int client)
    {
        for(ClientHandler aClient : clients)
        {
            aClient.out.println("[SERVER]: Client " + client + " says '" + substring + "'");
        }
    }
}
