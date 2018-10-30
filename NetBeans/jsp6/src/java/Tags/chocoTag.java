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
public class chocoTag extends TagSupport{
    String texture;
    public void setTexture(String texture){
        this.texture=texture;
    }
    public int doStartTag()throws JspException{
        JspWriter out = pageContext.getOut();
        try{
            if(texture=="Chewy"||texture=="chewy" )
                out.print("FiveStar,BarOne");
            if(texture=="Crunchy"|| texture=="crunchy")
                out.print("Munch,KitKat");
        }catch(Exception e){e.printStackTrace();}
        
        return SKIP_BODY;
    }
}
