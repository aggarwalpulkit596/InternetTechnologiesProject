package databases;

import java.sql.*;
import java.util.Scanner;
public class Databases {

  
    public static void main(String[] args) throws ClassNotFoundException {
       String driver_name="com.mysql.jdbc.Driver";
       String Db_URl="jdbc:mysql://localhost/nirnay";
       String user="root";
       String pass="keshav";
       
       Connection conn=null;
       Statement stmt=null;
       PreparedStatement pstmt=null;
       
       try
       {
           Class.forName(driver_name);
           System.out.println("loading drivers.....successfully");
           
           conn=DriverManager.getConnection(Db_URl,user,pass);
           System.out.println("creating connections");
           
           stmt=conn.createStatement();
           ResultSet rs = null;
           
           int ch;
           Scanner scan=new Scanner(System.in);
           do{
               System.out.println("****sql menu****");
               System.out.println("1.find total number of students");
               System.out.println("2.print average marks for each subject");
               System.out.println("3.find the name of student getting highest marks");
               System.out.println("4.find no of students getting 1st, 2nd and 3rd division");
               System.out.println("5.find subject wise topper");
               System.out.println("6.find the average marks");
               System.out.println("7.find the student getting 2nd highest marks");
               System.out.print("enter your choice:");
               int c;
               c = scan.nextInt();
               String sql;
               
               switch(c)
               {
                   case 1:
                       sql="select count(*) as no_stu from student";
                       rs=stmt.executeQuery(sql);
           
                        while(rs.next())
                            {
                                 int n=rs.getInt("no_stu");
                                 System.out.println("no of students are "+n);
                             }
                       break;
                   case 2:
                       System.out.println("Enter the subject(sub1/sub2/sub3)");
                       String input=scan.next();  
                       System.out.println(input);
                       
                       sql="select avg("+input+") as avg1 from result";
//                       pstmt=conn.prepareStatement(sql);
//                       pstmt.setString(1,input);
                       rs=stmt.executeQuery(sql);
                       
                       
           
                        while(rs.next())
                            {
                                 int n1=rs.getInt("avg1");
                                 
                                 System.out.println("average marks of "+input+" subject "+n1);
                               
                             }
                       break;
                   case 3:
                        sql="select first as fname from student where roll_no =(select roll from result where total=(select max(total) from result))";
                       rs=stmt.executeQuery(sql);
           
                        while(rs.next())
                            {
                                 String fname=rs.getString("fname");
                                 
                                 System.out.println("the student with maximum marks is  "+fname);
                             }
                       break;
                 case 4:
                        sql="select t1.first_division, t2.second_division, t3.third_division\n" +
"from\n" +
"  (select count(roll) as first_division from result where total>261) as t1,\n" +
"  (select count(roll) as second_division from result where total between 260 and 210) as t2,\n" +
"  (select count(roll) as third_division from result where total<210) as t3;";
                       rs=stmt.executeQuery(sql);
           
                        while(rs.next())
                            {
                                 int first=rs.getInt("first_division");
                                 int second=rs.getInt("second_division");
                                 int third=rs.getInt("third_division");
                                 System.out.println("the number of students with first division are "+first);
                                 System.out.println("the number of students with second division are "+second);
                                 System.out.println("the number of students with third division are "+third);
                             }
                       break;    
                       case 5:
                          sql="select t1.topper_sub1, t2.topper_sub2, t3.topper_sub3\n" +
"from\n" +
"  (select s.first as topper_sub1 from student s,result r where r.roll=s.roll_no and r.sub1=(select max(sub1) from result)) as t1,\n" +
"  (select s.first as topper_sub2 from student s,result r where r.roll=s.roll_no and r.sub2=(select max(sub2) from result)) as t2,\n" +
"  (select s.first as topper_sub3 from student s,result r where r.roll=s.roll_no and r.sub3=(select max(sub3) from result)) as t3;";
                          
                          rs=stmt.executeQuery(sql);
           
                        while(rs.next())
                            {
                                 String topper_sub1=rs.getString("topper_sub1");
                                 String topper_sub2=rs.getString("topper_sub2");
                                 String topper_sub3=rs.getString("topper_sub3");
                                 
                                 System.out.println("the topper of first subject is "+topper_sub1);
                                 System.out.println("the topper of second subject is "+topper_sub2);
                                 System.out.println("the topper of third subject is "+topper_sub3);
                             }
                       break;
                       
                      case 6:
                        sql="select avg(total) as average_marks from result";
                        
                       rs=stmt.executeQuery(sql);
           
                        while(rs.next())
                            {
                                 int fname=rs.getInt("average_marks");
                                 
                                 System.out.println("the average marks are "+fname);
                             }
                       break;
                       
                       case 7:
                        sql="select s.first as sname from student s, result r where s.roll_no=r.roll and r.total=(select max(total) as second_highest_score from result where total<(select max(total) from result))";
                        
                       rs=stmt.executeQuery(sql);
           
                        while(rs.next())
                            {
                                 String sname=rs.getString("sname");
                                 
                                 System.out.println("the student with second highest score is " +sname );
                             }
                       break;
               }
               System.out.print("do you want to continue(1/0):");
               ch=scan.nextInt();
               
               }while(ch==1);
           rs.close();
           stmt.close();
           conn.close();
           
           
       }
       
       catch(SQLException e)
       {
           System.out.println("exception is "+e);
       }
       
    }
    
}


