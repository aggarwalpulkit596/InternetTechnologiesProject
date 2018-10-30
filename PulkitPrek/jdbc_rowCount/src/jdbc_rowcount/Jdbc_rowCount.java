
package jdbc_rowcount;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Jdbc_rowCount {

    
    public static void main(String[] args) throws ClassNotFoundException {
        Connection conn=null;
        CallableStatement cstmt;
        ResultSet rs;
        
         try{
             
     String driver_name="com.mysql.jdbc.Driver";
       String Db_URl="jdbc:mysql://localhost/pulkit";
       String user="root";
       String pass="keshav";
       
       
           Class.forName(driver_name);
           System.out.println("loading drivers.....successfully");
           
           conn=DriverManager.getConnection(Db_URl,user,pass);
           System.out.println("creating connections");
           
           String sql="{call getrowcount(?)}";
           cstmt=conn.prepareCall(sql);
           cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
           cstmt.execute();
             System.out.println("");
        }
        catch(SQLException e)
       {
           System.out.println("exception is "+e);
       }
    }
    
}
