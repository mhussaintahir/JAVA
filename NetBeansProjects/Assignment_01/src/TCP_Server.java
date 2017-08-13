
import java.util.*;
import java.net.*;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Muhmmad Hussain
 */
public class TCP_Server {
    public static void main(String[] args)throws IOException
    {
        int id;
        ServerSocket ss=new ServerSocket(1340);
        System.out.println("Waiting for Connection ");
        Socket s1=ss.accept();
        System.out.println("Request Accepted ");
        
        Scanner sc=new Scanner(s1.getInputStream());
        
        id=sc.nextInt();
        
        System.out.println("Your id is "+id);
        
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/demo","root","12345");
            
            Statement stmt= conn.createStatement();
            
            ResultSet rs=stmt.executeQuery("select * from students");
            
            ArrayList<String> sd=new ArrayList<String>();
            
            while(rs.next())
            {
                if(id==rs.getInt(1))
                {
                    sd.add("ID      :   "+String.valueOf(rs.getInt(1)));
                    sd.add("Name    :   "+rs.getString(2));
                    sd.add("Age     :   "+String.valueOf(rs.getInt(3)));
                    
                    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
                }
              
            }
            
           PrintStream p=new PrintStream(s1.getOutputStream());
           
           
           for(String s  :sd)
           {
           p.println(s);
           }
            conn.close();
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
