package example2;

import java.net.*;
import java.io.*;


class CalculatorClient{

    private String command = "";
    private int num1 = 0;
    private int num2 = 0;
    private int result = 0;

    public CalculatorClient() throws IOException, UnknownHostException{

        // this.command = command;
        // this.num1 = num1;
        // this.num2 = num2;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Your Operation [ ADD, SUB, MUL, DIV ] :: ");
        this.command = buffer.readLine();

        System.out.print("Enter Your First Number :: ");
        this.num1 = Integer.parseInt(buffer.readLine());

        System.out.print("Enter Your Second Number :: ");
        this.num2 = Integer.parseInt(buffer.readLine());


        Socket clientSocket = new Socket("localhost",7900);

        DataOutputStream dataOut = new DataOutputStream(clientSocket.getOutputStream());

        dataOut.writeInt(num1);
        dataOut.writeInt(num2);
        dataOut.writeUTF(command);

        DataInputStream dataInput = new DataInputStream(clientSocket.getInputStream());

        System.out.println("The Result is " + dataInput.readInt());
        
        dataInput.close();
        dataOut.close();
        clientSocket.close();
    }
}


public class ClientSide{

    public static void main(String[] args) throws IOException{

        CalculatorClient client1 = new CalculatorClient();
    }
}