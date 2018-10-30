package com.customSub;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.*;
import java.io.IOException;
import javax.servlet.jsp.JspWriter;

public class substring extends SimpleTagSupport 
{
    String input;
    int start, end;
    
    public void setInput(String input)
    {
        this.input=input;
    }
    public void setStart( int start)
    {
        this.start= start;
    }
    public void setEnd(int end)
    {
        this.end=end;
    }
    public void doTag() throws JspException, IOException
    {
        JspWriter out = getJspContext().getOut();
        try
        {
            out.println(input.substring(start,end));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            
    }       
}
