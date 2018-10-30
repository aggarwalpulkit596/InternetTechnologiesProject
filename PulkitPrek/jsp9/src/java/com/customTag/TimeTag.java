package com.customTag;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
public class TimeTag extends SimpleTagSupport 
{
    public void doTag() throws JspException, IOException 
    {
        JspWriter out = getJspContext().getOut();
        try
        {
            out.print("Date : "+new Date());
//            out.print(Calendar.getInstance().get(Calendar.DAY_OF_MONTH)+"/");
//            out.print(Calendar.getInstance().get(Calendar.MONTH)+"/");
//            out.print(Calendar.getInstance().get(Calendar.YEAR)+"<br>");
//            out.print("Time : ");
//            out.print(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)+"hr-");
//            out.print(Calendar.getInstance().get(Calendar.MINUTE)+"min-");
//            out.print(Calendar.getInstance().get(Calendar.SECOND)+"sec");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
    }
}