import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
    public static void main(String[] args) throws IOException {
        
        ServerSocket server = new ServerSocket(9999);

        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;
        while(true) {
            line = br.readLine();
            if("bye".equals(line)) {
                break;
            }
            System.out.println(line);
        }

    }
}