import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *Create Dushan Malinda
 */
public class Main {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(3000);//create server socket
            Socket socket=serverSocket.accept();//create local socket and accept the message
            DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
            //use to read data from client side

            String message=dataInputStream.readUTF();
            //UTF use to decode the msg come from the client side
            System.out.println(message);
            socket.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
