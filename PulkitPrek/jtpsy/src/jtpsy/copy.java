/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtpsy;

/**
 *
 * @author KMV
 */
import java.io.FileWriter; 
import java.io.IOException; 
class copy 
{ 
    public static void main(String[] args) throws IOException 
    { 
        // Accept a string 
        String str = "File Handling in Java using "+ 
                     " FileWriter and FileReader"; 
  
        // attach a file to FileWriter 
        FileWriter fw=new FileWriter("text"); 
  
        // read character wise from string and write 
        // into FileWriter 
        for (int i = 0; i < str.length(); i++) 
            fw.write(str.charAt(i)); 
  
        //close the file 
        fw.close(); 
    } 
} 