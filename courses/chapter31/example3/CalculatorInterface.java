package chapter31.example3;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorInterface extends Remote{

    public String calculate(double num1, double num2, String command) throws RemoteException;
}