package statementexample;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StatementExample {
        static String driver="com.mysql.jdbc.Driver";
        static String url="jdbc:mysql://localhost/student"; 
        static String user="root";
        static String pass="keshav";
    public static void main(String[] args) throws ClassNotFoundException {
        Connection conn=null;
        CallableStatement stmt=null;
        
        try
        {
            Class.forName(driver);
            conn=DriverManager.getConnection(url,user,pass);
            String sql="{call getStudentName (?, ?)}";
            stmt=conn.prepareCall(sql);
            
            int roll=3;
            stmt.setInt(1, roll);
            stmt.registerOutParameter(2,java.sql.Types.VARCHAR);
            stmt.execute();
            String studentName = stmt.getString(2);
            System.out.println("Student Name with roll No:" + roll + " is " + studentName);
            stmt.close();
            conn.close();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
    }
    
}
