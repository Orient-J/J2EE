package exercise1;

import java.net.*;
import java.io.*;
import java.util.*;

class SquareClient{

    private double firstSide = 0;
    private double secondSide = 0;

    public SquareClient() throws IOException, UnknownHostException{

        Scanner scan = new Scanner(System.in);

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        Socket clientSocket = new Socket("localhost", 9999);

        DataOutputStream dataOut = new DataOutputStream(clientSocket.getOutputStream());

        DataInputStream dataIn = new DataInputStream(clientSocket.getInputStream());

        char trigger = 'y';

        do{

            System.out.print("Enter First Side :: ");
            this.firstSide = scan.nextDouble();

            System.out.print("Enter Second Side :: ");
            this.secondSide = scan.nextDouble();

            dataOut.writeDouble(this.firstSide);
            dataOut.writeDouble(this.secondSide);

            System.out.println("Area of Square is " + dataIn.readDouble());
            System.out.println("Perimeter of Square is " + dataIn.readDouble());

            System.out.print("Do You want to try again...? [yes] :: ");
            trigger = buffer.readLine().charAt(0);

            // System.out.println(this.trigger == "yes" ? "no" : this.trigger );


        }while( trigger == 'y');


        dataOut.close();
        dataIn.close();
        clientSocket.close();

    }
}

public class ClientSide{

    public static void main(String[] args) throws IOException{

        new SquareClient();
    }
}