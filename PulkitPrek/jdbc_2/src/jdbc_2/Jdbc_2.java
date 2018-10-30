
package jdbc_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Jdbc_2 {

        public static void main(String[] args) throws ClassNotFoundException {
            
             Connection conn=null;
         try{
             
     String driver_name="com.mysql.jdbc.Driver";
       String Db_URl="jdbc:mysql://localhost/pulkit";
       String user="root";
       String pass="keshav";
       
       
           Class.forName(driver_name);
           System.out.println("loading drivers.....successfully");
           
           conn=DriverManager.getConnection(Db_URl,user,pass);
           System.out.println("creating connections");
        }
        catch(SQLException e)
       {
           System.out.println("exception is "+e);
       }
        
    }
    
}
