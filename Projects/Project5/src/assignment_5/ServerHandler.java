package assignment_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerHandler implements Runnable {
    private Socket server;
    private BufferedReader in;
    private PrintWriter out;

    public ServerHandler(Socket s) throws IOException {
        server = s;
        in = new BufferedReader(new InputStreamReader(server.getInputStream()));
        out = new PrintWriter(server.getOutputStream(), true);
    }

    @Override
    public void run() {
        String serverResponse = null;
        try
        {
            while(true)
            {
                String command = in.readLine();
                System.out.println(command);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            out.close();
            try {
                in.close();
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
