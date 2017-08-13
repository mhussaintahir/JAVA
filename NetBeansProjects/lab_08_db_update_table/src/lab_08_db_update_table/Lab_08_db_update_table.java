
package lab_08_db_update_table;
import java.sql.*;

public class Lab_08_db_update_table {
public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/demo","root","12345");
            Statement stmt= conn.createStatement();
            
            String sql="create table if not exists registration11(id int,Sname varchar(100),age int,primary key(id))";
            stmt.executeUpdate(sql);
            
            sql="insert into registration11 values(100,'Hussain',20)";
            stmt.executeUpdate(sql);
            
            sql="insert into registration11 values(101,'Nabeel',21)";
            stmt.executeUpdate(sql);
            
            sql="insert into registration11 values(102,'Asim',22)";
            stmt.executeUpdate(sql);
            
            sql="insert into registration11 values(103,'Fahad',23)";
            stmt.executeUpdate(sql);
            
            sql="insert into registration11 values(104,'Saad',25)";
           stmt.executeUpdate(sql);
            
            ResultSet rs=stmt.executeQuery("select * from registration11");
            
            while(rs.next())
            {
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
           } conn.close();
           }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }}
