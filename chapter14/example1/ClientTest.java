package example1;

import java.net.Socket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.*;
import java.net.*;

public class ClientTest{

    public static void main(String[] args)throws UnknownHostException, IOException{

        try{


            Socket socket = new Socket("Server1",9999);

            DataOutputStream dataOut =  new DataOutputStream(socket.getOutputStream());

            dataOut.writeUTF("This is message from Client");
            
            dataOut.close();
            socket.close();
        
        }catch(UnknownHostException exception){

            exception.printStackTrace();
        
        }catch(IOException exception){

            exception.printStackTrace();
        }
    }
}