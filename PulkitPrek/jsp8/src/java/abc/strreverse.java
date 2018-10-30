package abc;


import java.io.*;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.*;

public class strreverse extends SimpleTagSupport{
    private String string=null;
    
    public void setString(String string){
        this.string=string;
    }
    
   

    public void doTag() throws JspException,IOException{
        
         JspWriter out=getJspContext().getOut();
         StringBuilder str1=new StringBuilder();
         str1.append(string);
         str1=str1.reverse();
         out.println("the reverse string is "+str1);
    }
    
    
}


