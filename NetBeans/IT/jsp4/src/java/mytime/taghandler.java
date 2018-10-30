/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KMV
 */
package mytime;  
import java.util.Calendar;  
import javax.servlet.jsp.JspException;  
import javax.servlet.jsp.JspWriter;  
import javax.servlet.jsp.tagext.TagSupport;  

public class taghandler extends TagSupport{  
  
public int doStartTag() throws JspException {  
    
    int hr, min, sec;
    JspWriter out=pageContext.getOut();//returns the instance of JspWriter  
    try{  
      out.print("Time : ");
            hr = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
            min = Calendar.getInstance().get(Calendar.MINUTE);
            sec = Calendar.getInstance().get(Calendar.SECOND);
            out.print(hr+"hr-");
            out.print(min+"min-");
            out.print(sec+"sec<br>");
            if(hr>=0 && hr<12 )
            {
                out.println("Good Morning ");
            }
            else if(hr>=12 && hr<=17)
            {
                out.println("Good Afternoon ");
            }
            else
            {
                out.println("Good Evening ");
            }
       }
       catch(Exception e){System.out.println(e);
       
      }  
    return 0;
}  }