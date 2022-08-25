import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//importiert alle wichtigen klassen
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


  
   

public class DateiErzeugen extends Actor {
    //anlegen einer Zeichenkette die den namen der Datei enthält
    String s = "Alltime Bestenliste.txt";
    
    static String Platzierung="4"; 
    //arrays für namen und punkte der besten drei Spieler
    static  String[] namel =new String[3];
    static  String[] punktel=new String[3];
    
    int pa=0;      
    int o=0; 
   
    boolean namek=false;
    
    public void act(){
        if(o==0){
         //aufrufen der Methode Last und Speichern    
         Last(); 
        
         Speichern(s);
       
         o=9;
        }
    }
    public  void Last() {
        
      File file = new File(s);  
    try {
      
        //wenn datei noch nicht erstellt wurde anlegen einer neuen datei mit namen s  
        if (file.createNewFile() ) {
      PrintWriter pWriter = null;
        
        try {
            pWriter = new PrintWriter(new BufferedWriter(new FileWriter(s))); 
            //standart werten eingeben
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
        //auslesen der Datei und zuweisung der arrays
        try {
            in = new BufferedReader(new FileReader(s));
            String zeile = null;
            String zeil="1";
            int zeill=0;
            while ((zeile = in.readLine()) != null) {
                
            if (zeile.contains(zeil+".")) {
              
              int iPos = zeile.indexOf('.');
              int jPos = zeile.indexOf(' ');
              
              punktel[zeill] = zeile.substring( iPos+1,jPos).trim();
              namel[zeill] = zeile.substring(jPos, zeile.length()).trim();
              
             
              
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
    
    public void Rechnen(){
        
       
       
       
  
    //einordnen der punktzahl in die Bestenliste
    for(int h=3;h>0;h--){
       
        int m=Integer.parseInt(punktel[h-1]);
       
    if(Label.Punkte>m){
        
       Platzierung=Integer.toString(h);
       
    }
}


    if(Platzierung.equals("3")){
       punktel[2]=Integer.toString(Label.Punkte);
        namel[2]=Starting.name; 
    }
    if(Platzierung.equals("2")){
        punktel[2]=punktel[1];
        namel[2]=namel[1];
        punktel[1]=Integer.toString(Label.Punkte);
        namel[1]=Starting.name;
    }
    if(Platzierung.equals("1")){
        punktel[2]=punktel[1];
        namel[2]=namel[1];
        punktel[1]=punktel[0];
        namel[1]=namel[0];
        punktel[0]=Integer.toString(Label.Punkte);
        namel[0]=Starting.name;
    }

   
   
}
    
    public  void Speichern(String s){
     
    //ruft methode rechnen auf    
    Rechnen();
   if(namek==false){
     BufferedReader reader = null;
    BufferedWriter writer = null;
    StringBuffer lesepuffer = null;
    lesepuffer = new StringBuffer();
   
    //überschreibt aktuelle werte in der datei mit neuen aktualisierten werten
    try {
      reader = new BufferedReader(new FileReader(s));
     
      String zeile = null;
      int c=0;
      while((zeile = reader.readLine()) != null) {
        // Ändern
        if(c<3){
            String n="";
           if(Integer.parseInt(punktel[c])<=9){
            n = (c+1)+".0"+punktel[c]+" "+ namel[c];
            
        }
        if(Integer.parseInt(punktel[c])>9){
            n = (c+1)+"."+punktel[c]+" "+ namel[c];
           
        }
            zeile=zeile.replace(zeile,n);
            
            c=c+1;
        }
        
             lesepuffer.append(zeile + System.getProperty("line.separator"));
          
        }
        // Puffern
       
      
    } catch(FileNotFoundException e) {
      e.printStackTrace();
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(reader != null) reader.close();
      } catch(IOException e) {
      }
    }

    // Lesepuffer speichern
    try {
      writer = new BufferedWriter(new FileWriter(s));

      writer.write(lesepuffer.toString());
      writer.flush();
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(writer != null) writer.close();
      } catch(IOException e) {
      }
     }
    }
}
 }   

    
    
    

