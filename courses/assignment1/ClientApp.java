import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.rmi.Naming;
import java.net.MalformedURLException;

public class ClientApp{

    public static void main(String[] args)
        throws MalformedURLException, RemoteException, NotBoundException{

            StudentInterface stuInterface = (StudentInterface)Naming.lookup("rmi://localhost:9999/stuInfo");

            // System.out.println(stuInterface.showInfo());

            System.out.println(
                String.format("%-10s","YKPT") + String.format("%-30s","Name") + String.format("%-20s","Address") + "\n"
            );

            for( Student stu : stuInterface.showInfo() ){

                System.out.println(stu.getInfo());
            }
    }
}