package assignment_5;

import java.io.*;
import java.net.Socket;

public class ClientMain {

    public static void main(String[] args) throws IOException
    {
        Socket socket = new Socket("localhost", 6666);

        ServerHandler serverConn = new ServerHandler(socket);
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        new Thread(serverConn).start();

        while(true)
        {
            System.out.println("> ");
            String command = keyboard.readLine();

            if(command.equals("quit")) {
                System.out.println("[SERVER] Disconnected");
                break;
            }
            out.println(command);

        }
        socket.close();
        System.exit(0);
    }
}