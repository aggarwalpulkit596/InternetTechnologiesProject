package abc;


import java.io.*;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.*;

public class hello extends SimpleTagSupport{
    private String name=null;
 
    
    public void setName(String name){
        this.name=name;
    }
    
    public void doTag() throws JspException,IOException{
        
         JspWriter out=getJspContext().getOut();
         out.println("hello "+name);
    }
    
    
}