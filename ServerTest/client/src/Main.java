import java.io.DataOutputStream;
import java.net.Socket;

/**
 *Create Dushan Malinda
 */

public class Main {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("localhost",3000);
            DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF("Hello I'm Dushan");
            dataOutputStream.flush();
            dataOutputStream.close();
            socket.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
