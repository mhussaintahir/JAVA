

/**
 *
 * @author Muhmmad Hussain
 */
import java.util.*;
import java.net.*;
import java.io.*;

public class TCP_Client {
    
    public static void main(String[] args) throws UnknownHostException,IOException
    {
        int id;
        
       String student_data;
        
        Socket s=new Socket("127.0.0.1",1340);
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter your id ");
        id=inp.nextInt();
        
        PrintStream ps=new PrintStream(s.getOutputStream());
        ps.println(id);
        
        Scanner sc=new Scanner(s.getInputStream());
        
        System.out.println("====== YOUR DATA======");
        while(sc.hasNext())
        {
           student_data=sc.nextLine();
            System.out.println(""+student_data);
           
        }
           
       
        
        
        
        
    }
    
}
