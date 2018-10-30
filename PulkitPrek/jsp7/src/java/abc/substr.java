package abc;

import java.util.Date;
import java.io.*;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.*;

public class substr extends SimpleTagSupport{
    private String input=null;
    private int start,end;
    
    public void setInput(String input){
        this.input=input;
    }
    
    public void setStart(int start){
        this.start=start;
    }
    
    public void setEnd(int end)
    {
        this.end=end;
    }
    public void doTag() throws JspException,IOException{
        
         JspWriter out=getJspContext().getOut();
         out.println("the sub string is "+input.substring(start,end));
    }
    
    
}


