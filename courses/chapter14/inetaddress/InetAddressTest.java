package inetaddress;

// import InetAddress class to use InetAddress class
import java.net.InetAddress;
import java.util.Scanner;
import java.net.UnknownHostException;

public class InetAddressTest{

    public static void main(String[] args){

        System.out.print("Enter Your Website Name : ");
        String websiteName = new Scanner(System.in).nextLine();

        // System.out.println(websiteName);

        // get one IPAddress by InetAddress Class 

        try{

            InetAddress address = InetAddress.getByName(websiteName);

            System.out.println(address);
        
        }catch(UnknownHostException exception){

            exception.printStackTrace();
        }


        // get all ipAddress by InetAddress Class

        try{
            // since getting more than one addresses, must received by an array

            InetAddress[] addresses = InetAddress.getAllByName(websiteName);

            System.out.println("Getting All IpAddress");

            for( InetAddress each : addresses ){

                System.out.println(each);
            }
        
        }catch(UnknownHostException exception){

            exception.printStackTrace();
        }
    }
}
