package chapter31.example3;

import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.rmi.Naming;
import java.net.MalformedURLException;

public class ServerApp extends UnicastRemoteObject implements CalculatorInterface {

    public ServerApp() throws RemoteException{

        super();
    }

    public String calculate(double num1, double num2, String command) throws RemoteException {

        double result = 0;

        switch(command) {

            case "add" :  result = num1 + num2 ; break;
            case "sub" :  result = num1 - num2 ; break;
            case "mul" :  result = num1 * num2 ; break;
            case "div" :  result = num1 / num2 ; break;
            case "pow" :  result = Math.pow(num1,num2);
            default : return "";
        }

        return result + "";
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException{

        ServerApp app1 = new ServerApp();

        LocateRegistry.createRegistry(9000);

        Naming.rebind("rmi://localhost:9000/calculatorApp", app1);

        System.out.println("Server Is Already Started!!!");
    }
}