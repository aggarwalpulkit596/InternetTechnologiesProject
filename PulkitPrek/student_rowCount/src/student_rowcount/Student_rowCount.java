
package student_rowcount;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


class countRow{
    
    Connection conn;
    ResultSet rs;
    CallableStatement cstmt;
    

    public countRow() throws ClassNotFoundException{
        
        try{
     String driver_name="com.mysql.jdbc.Driver";
       String Db_URl="jdbc:mysql://localhost/nirnay";
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
    
    void getRowCount() throws SQLException{
        
        cstmt=conn.prepareCall("{call countR(?)}");
        cstmt.setInt(1,roll_no);
        
                
    }

}


public class Student_rowCount {

    
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
