package chapter31.example1;

import java.rmi.*;

public interface Media extends Remote{

    public int sum(int num1, int num2) throws RemoteException; 
}

