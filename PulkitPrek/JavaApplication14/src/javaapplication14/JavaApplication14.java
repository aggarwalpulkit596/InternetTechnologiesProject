

package javaapplication14;
import java.io.*;
class M
{
      void method()
      { 
      try{
         
         throw new IOException("device error");
          }catch(IOException e) 
             {
               System.out.println(e);
                
             }
}
public class JavaApplication14 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            M m = new M();
            m.method();
            
        }catch(IOException e)
        { 
           }
    }
    
}
