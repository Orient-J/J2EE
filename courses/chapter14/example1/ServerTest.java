package example1;

import java.net.*;
import java.io.*;

public class ServerTest{

    public static void main(String[] args){

        try{

            ServerSocket serverSocket = new ServerSocket(9999);

            System.out.println("Server is ready.");

            Socket clientSocket = serverSocket.accept();

            System.out.println("Connection is established");

            DataInputStream dataInput = new DataInputStream(clientSocket.getInputStream());

            // System.out.println("This is Message from Client Program => " + dataInput.readUTF());

            String str = dataInput.readUTF();

            System.out.println(str);

            dataInput.close();
            clientSocket.close();
            serverSocket.close();
        
        }catch(IOException exception){

            System.out.println(exception);
        }

    }
}