import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Naming;
import java.net.MalformedURLException;
import java.util.ArrayList;

public class ServerApp extends UnicastRemoteObject implements StudentInterface {

    public ServerApp() throws RemoteException{

        super();
    }

    public ArrayList<Student> showInfo() throws RemoteException{

        return list;
    }

    public static void main(String[] args) throws MalformedURLException, RemoteException{
     

        Student student1;
        student1 = new Student("Kyaw Pyae Sone", 21978, "Tarkeyta");
        list.add(student1);

        student1 = new Student("Alice", 21999, "Ah Lone");
        list.add(student1);

        student1 = new Student("Kise", 21969, "Thinganyun");
        list.add(student1);

        ServerApp server1 = new ServerApp();

        LocateRegistry.createRegistry(9999);

        Naming.rebind("rmi://localhost:9999/stuInfo",server1);

        System.out.println("Server Is Ready!!!");

        
    }
}