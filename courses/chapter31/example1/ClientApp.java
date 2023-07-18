package chapter31.example1;

import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.Naming;


public class ClientApp {

    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
        
        Media media1 = (Media)Naming.lookup("rmi://localhost:9000/doObj");

        System.out.println("Get Remote Object");

        System.out.println(media1.sum(12, 8));

    }
}