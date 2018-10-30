package abc;


import java.io.*;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.*;

public class choco extends SimpleTagSupport{
    private String texture=null;
     
   
    public void setTexture(String texture){
        this.texture=texture;
    }
    
  
    public void doTag() throws JspException,IOException{
        
         JspWriter out=getJspContext().getOut();
         StringBuffer str1=new StringBuffer();
         if(texture.equalsIgnoreCase("chewy"))
         {
             str1.append("Five star, BarOne ");
         }
         else if(texture.equalsIgnoreCase("crunchy"))
         {
             str1.append("Munch, Kitcat");
         }
        
         out.println(str1);
    }
    
    
}