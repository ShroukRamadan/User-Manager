/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


      


/**           
 *
 * @author shrouk
 */
public class AddUser {
     
    
    public AddUser() 
    {
    
    }
         
        
          
    public void adduser ()  {
    
    
        String s= "su adduser";

        try {
            
            
            Process p = Runtime.getRuntime().exec(s);
            
            BufferedReader stdInput = new BufferedReader(new 
                 InputStreamReader(p.getInputStream()));
            
            BufferedWriter writer= new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));

            BufferedReader stdError = new BufferedReader(new 
                 InputStreamReader(p.getErrorStream()));

            // read the output from the command
            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
            
           // stdInput.close();
            //p.waitFor();
            
            
            // read any errors from the attempted command
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
            
            System.exit(0);
        }
        catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
            
    }


    public void Login() throws IOException
    {
       
        try 
        {
          String installTrickledCmd = "sudo -S vim /etc/resolv.conf";
          Runtime runtime = Runtime.getRuntime();
          Process proc = runtime.exec(installTrickledCmd);
        }
       
        catch(Throwable throwable)
        {
          throw new RuntimeException(throwable);
        }
       
    
    }

   
              
        
    
}
