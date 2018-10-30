
package Tags;

/**
 *
 * @author Tarun
 */
import javax.servlet.jsp.JspException;  
import javax.servlet.jsp.JspWriter;  
import javax.servlet.jsp.tagext.TagSupport; 
public class helloTag extends TagSupport{
    String name;
    public void setName(String name){
        this.name=name;
    }
    public int doStartTag() throws JspException{
        JspWriter out=pageContext.getOut();  
        try{
            out.print("Hello " +name);
        }catch(Exception e){
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
    
}
