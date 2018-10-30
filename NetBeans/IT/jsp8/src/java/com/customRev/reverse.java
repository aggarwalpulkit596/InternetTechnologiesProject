package com.customRev;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class reverse extends SimpleTagSupport 
{
    String input;
    String reverse="";
    public void setInput(String input)
    {
        this.input=input;
    }
    public void doTag() throws JspException, IOException 
    {
        JspWriter out = getJspContext().getOut();
        try
        {
            for(int i = input.length() - 1; i >= 0; i--)
            {
                reverse = reverse + input.charAt(i);
            }
            out.println(reverse);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
    }
}
