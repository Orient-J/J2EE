package chapter31.example1;

import java.rmi.RemoteException;
import java.rmi.Naming;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.net.MalformedURLException;

public class ServerApp extends UnicastRemoteObject implements Media{

    public ServerApp() throws RemoteException{

        super();
    }

    public int sum(int num1, int num2) throws RemoteException {

        return num1 + num2;
    }

    public static void main(String[] args)throws RemoteException, MalformedURLException {
        
        ServerApp server1 = new ServerApp();

        LocateRegistry.createRegistry(9000);

        Naming.rebind("rmi://localhost:9000/doObj", server1);

        System.out.println("Server is ready");

    }
}