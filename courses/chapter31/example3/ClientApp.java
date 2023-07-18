package chapter31.example3;

import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.rmi.Naming;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ClientApp {

    public static void main(String[] args)
    throws RemoteException, MalformedURLException, NotBoundException, IOException{

        CalculatorInterface interface1 = (CalculatorInterface)Naming.lookup("rmi://localhost:9000/calculatorApp");

        Scanner scan = new Scanner(System.in);
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Command :: ");
        String command = buffer.readLine().toLowerCase();

        System.out.print("Enter First Number :: ");
        int num1 = scan.nextInt();

        System.out.print("Enter Second Number :: ");
        int num2 = scan.nextInt();

        System.out.println("The Result is " + interface1.calculate(num1, num2, command));
        
        scan.close();
    }
}