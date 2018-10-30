/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tags;

/**
 *
 * @author Tarun
 */
import javax.servlet.jsp.JspException;  
import javax.servlet.jsp.JspWriter;  
import javax.servlet.jsp.tagext.TagSupport;

public class substringTag extends TagSupport {
    String input;
    int start,end;
    public void setInput(String input){
        this.input=input;
    }
    public void setStart(int start){
        this.start=start;
    }
    public void setEnd(int end){
        this.end=end;
    }
    public int doStartTag()throws JspException{
        JspWriter out= pageContext.getOut();
        try{
            out.print(input.substring(end));
            out.print("<br>");
            out.print(input.substring(start, end));
            
        }catch(Exception e){e.printStackTrace();}
        return SKIP_BODY;
    }
    
}
