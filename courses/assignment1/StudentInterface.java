import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface StudentInterface extends Remote{

    ArrayList<Student> list = new ArrayList<Student>();

    public ArrayList<Student> showInfo() throws RemoteException;
}