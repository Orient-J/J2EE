package exercise1;

import java.net.*;
import java.io.*;

class SquareServer{

    private double side1 = 0;
    private double side2 = 0;

    public SquareServer()throws IOException, UnknownHostException{

        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Server Side is Ready!!!");

        Socket clientSocket = serverSocket.accept();
        System.out.println("Connection is already connected!!!");

        DataInputStream dataIn = new DataInputStream(clientSocket.getInputStream());

        DataOutputStream dataOut = new DataOutputStream(clientSocket.getOutputStream());

        try{

            while( true ){
            
                this.side1 = dataIn.readDouble();
                this.side2 = dataIn.readDouble();

                dataOut.writeDouble(findArea());
                dataOut.writeDouble(findPerimeter());

                serverSocket.close();
            }
            
        }catch(EOFException exception){
            
            System.out.println("Server is stopped");
        }

    }


    private double findArea(){

        return this.side1 * this.side2;
    }

    private double findPerimeter(){

        return 2 * ( this.side1 + this.side2 );
    }
}

public class ServerSide{

    public static void main(String[] args)throws IOException{

        new SquareServer();
    }
}