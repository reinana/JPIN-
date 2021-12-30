import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer{
    public static void main(String[] args) throws Exception {
        
        ServerSocket server = new ServerSocket(9999); // ポート番号を指定してソケットにした
        Socket socket = server.accept(); //acceptはSocket型を返す
        InputStream is = socket.getInputStream(); // InputStream型を返すバイナリー

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        // InputStreamはバイナリーBufferdReaderはstring

        while(true) {
            String line = br.readLine();
            if("bye".equals(line)) {
                break;
            }
            System.out.println(line);
        }
        socket.close();//ソケットを閉じる
    }
}