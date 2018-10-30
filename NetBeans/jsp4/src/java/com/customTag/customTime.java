/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.customTag;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
public class customTime extends SimpleTagSupport {
     public void doTag() throws JspException, IOException {
      JspWriter out = getJspContext().getOut();
       try{
        int time;
        time=Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if(time<12){
            out.print("!!Good Morning ");
        }
        else if(time>=12 && time<18){
            out.print("!!Good Afternoon ");
        }
        else
            out.print("!!Good Evening ");
       }catch(Exception e){System.out.println(e);}  
   }
}

