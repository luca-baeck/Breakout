import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
  import java.io.File;
import java.io.IOException;

/**
 * 
 * @author (Luca Bäck) 
 * @version (04.01.2021)
 * 
 */

public class Namereload extends Actor
{
   String s = "Alltime Bestenliste.txt";
   //anlegen von arrays für namen und punkte
   static String[] namev = new String[3];
   static   String[] punktev=new String[3];
   int i=0;
    /**
     * Act - do whatever the Namereload wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(i==0){
            //aufrufen der methode Last
            Last();
            i=9;
        }
    }   
    
  public  void Last() {
        
      File file = new File(s);  
    try {
      
           
        if (file.createNewFile() ) {
      PrintWriter pWriter = null;
       
        try {
            pWriter = new PrintWriter(new BufferedWriter(new FileWriter(s))); 
            //standartwerte
            pWriter.println("1.00 Lol");
            pWriter.println("2.00 Lul");
            pWriter.println("3.00 Lal");
            pWriter.println("Alltime Bestenliste:");
            } catch (IOException ioe) {
            ioe.printStackTrace();     
        } finally {
            if (pWriter != null){
                pWriter.flush();
                pWriter.close();
            }
        }  
      } // end of if
       } catch(Exception e) {
      System.err.println(e);
    }  
    
    
    
    
    if (!file.canRead() || !file.isFile())
            System.exit(0);
      
        BufferedReader in = null;
    
        try {
            in = new BufferedReader(new FileReader(s));
            String zeile = null;
            String zeil="1";
            int zeill=0;
            //auslesen der datei und zuweisung der arrays
            while ((zeile = in.readLine()) != null) {
                
            if (zeile.contains(zeil+".")) {
              
              int iPos = zeile.indexOf('.');
              int jPos = zeile.indexOf(' ');
              
              punktev[zeill] = zeile.substring( iPos+1,jPos).trim();
              namev[zeill] = zeile.substring(jPos, zeile.length()).trim();
              
              
              
               zeill=zeill+1;
               int z  = Integer.parseInt(zeil);
               z=z+1;
               zeil=Integer.toString(z);
              
            } // end of if
           
           
          
            }   
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null)
                try {
                    in.close();
                } catch (IOException e) {
                }
        }
    
    }
}
