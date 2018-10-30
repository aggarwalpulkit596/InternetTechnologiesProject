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
public class reverseTag extends TagSupport {
    String input;
    public void setInput(String input){
        this.input=input;
    }
    public int doStartTag() throws JspException{
        JspWriter out = pageContext.getOut();
        try{
            StringBuilder str=new StringBuilder(input);
            out.print(str.reverse());
        }catch(Exception e){e.printStackTrace();}
        return SKIP_BODY;
    }    
}
