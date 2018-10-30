package com.custom;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class hello extends SimpleTagSupport
{
    String name;
    public void setName(String name)
    {
        this.name=name;
    }
    public void doTag() throws JspException, IOException
    {
        JspWriter out =getJspContext().getOut();
        try
        {
            out.println("Hello "+name);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
