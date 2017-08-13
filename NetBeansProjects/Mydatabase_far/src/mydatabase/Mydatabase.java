/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydatabase;

/**
 *
 * @author AG COMPUTER
 */
import java.sql.*;
public class Mydatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/demo9","root","19");
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from emp");
            while(rs.next())
            {
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
                
            }
            conn.close();
            
        }
        catch(Exception e)
        {
         System.out.println(e);   
        }
    }
    
}
