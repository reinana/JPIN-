import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
    public static void main(String[] args) throws IOException {
        // ----------9 --------------

        ServerSocket server = new ServerSocket(9999);

        Socket socket = server.accept();

        InputStream is = socket.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        PrintWriter out = null;
        try {
            String line = br.readLine();
            System.out.println(line);

            out = new PrintWriter(socket.getOutputStream());
            out.print("HTTP/1.1 200 OK");
            out.print("\r\n");
            out.print("\r\n");
            out.print(line.replace("GET /", "").replace(" HTTP/1.1", ""));
            out.flush();

        
        }
        finally{
            br.close();
            socket.close();
        }



        // ------8---------サーバーを改造する

        // ServerSocket server = new ServerSocket(9999);
        // Socket socket = server.accept(); // 待ち受け

        // InputStream is = socket.getInputStream();
        // BufferedReader br = new BufferedReader(new InputStreamReader(is));

        // while(true) {
        //     String line = br.readLine();

        //     if(line == null) { // 筒の中に何もないとnullを返すので、nullの時は表示させないように
        //         continue;
        //     }

        //     if("bye".equals(line)) {
        //         break;
        //     }
        //     System.out.println(line);
        // }

        // server.close();



        // -----------------6-------------------
        // ServerSocket server = new ServerSocket(9999);

        // Socket socket = server.accept();
        // InputStream is = socket.getInputStream();
        // BufferedReader br = new BufferedReader(new InputStreamReader(is));

        // while(true) {
        //     String line = br.readLine();
        //     if("bye".equals(line)) {
        //         break;
        //     }
        //     System.out.println(line);
        // }

    }
}