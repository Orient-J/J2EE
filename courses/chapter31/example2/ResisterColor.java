package chapter31.example2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ResisterColor extends Remote{

    public enum colors {};

    public double computeFourBands(int first, int second, int multiplier, int tolerance) throws RemoteException;
}