package example2;

import java.net.*;
import java.io.*;

class CalculatorServer{

    private int num1 = 0;
    private int num2 = 0;
    private String command = "";
    private int result = 0;

    public CalculatorServer() throws IOException, UnknownHostException{

        ServerSocket serverSocket = new ServerSocket(7900);
        System.out.println("Sever is Ready!!!");
        
        Socket clientSocket = serverSocket.accept();
        System.out.println("Connection is connected!!!");


        DataInputStream dataInput = new DataInputStream(clientSocket.getInputStream());


        this.num1 = dataInput.readInt();
        this.num2 = dataInput.readInt();
        this.command = dataInput.readUTF().toLowerCase();

        // System.out.println(this.num1 + " " + this.num2 + " " + this.command);

        switch( this.command ){

            case "add":
                this.result = Calculate.add(num1,num2);
            break;

            case "sub":
                this.result = Calculate.substract(num1,num2);
            break; 

            case "mul":
                this.result = Calculate.multiply(num1,num2);
            break;

            case "div":
                this.result = Calculate.divide(num1,num2);
            break;
        }
        
        DataOutputStream dataOutput = new DataOutputStream(clientSocket.getOutputStream());

        dataOutput.writeInt(this.result);



        serverSocket.close();
        clientSocket.close();
        dataInput.close();


    }
}

class Calculate{

    static int add(int num1, int num2){

        return num1 + num2;
    }

    static int substract(int num1, int num2){

        return num1 - num2;
    }

    static int multiply(int num1, int num2){
        
        return num1 * num2;
    }

    static int divide(int num1, int num2){

        return num1/num2;
    }
}

public class ServerSide{

    public static void main(String[] args)throws IOException{

        CalculatorServer server1 = new CalculatorServer();
    }
}