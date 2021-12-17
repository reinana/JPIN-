import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class HelloClient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        
        
        
        // -----------------8--------------

        Socket server = new Socket("127.0.0.1",9999);
        PrintWriter out = new PrintWriter(server.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while((line = br.readLine()) != null) {
            out.println(line);
            out.flush();
        }
        br.close();
        server.close();

        
        
        
        
        
        
        
        
        
        
        
        // ------------7-------------
        // Socket server = new Socket("127.0.0.1", 9999);

        // PrintWriter out = new PrintWriter(server.getOutputStream());

        // out.println("Hello.");
        // out.println("bye");
        // out.flush();

        // server.close();
    }
}
