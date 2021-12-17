import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class HelloClient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket server = new Socket("127.0.0.1", 9999);

        PrintWriter out = new PrintWriter(server.getOutputStream());

        out.println("Hello.");
        out.println("bye");
        out.flush();

        server.close();
    }
}
