import greenfoot.*;
import javax.swing.JOptionPane;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JFrame;
/**
 * 
 * @author (Luca Bäck) 
 * @version (04.01.2021)
 * 
 */
public class Name extends Actor
{
    boolean nameok = true;
    //sounds
    GreenfootSound music = new GreenfootSound("Abgehlent.mp3");
    GreenfootSound music1 = new GreenfootSound("Clicked sound.mp3");
    JFrame frmOpt;
    public void act() 
    {
        if (frmOpt == null) {
frmOpt = new JFrame();
}

 if(Greenfoot.mouseClicked(this)){
    frmOpt.setVisible(true);
    frmOpt.setLocationRelativeTo(null);
    frmOpt.setAlwaysOnTop(true);
    music1.setVolume(90);
    music1.play();
    nameok=true;
    Starting.name="";
    //versuchen ein eingabe fenster für den Namen anzuzeigen
       try{
          Starting.name= JOptionPane.showInputDialog(frmOpt,"Please enter your name:","Breakout_Username",JOptionPane.PLAIN_MESSAGE);
        } catch(Exception e) {
      
    }  
    //auslesen des namens
    try{ 
      Starting.name=Starting.name.trim();
    } catch(NullPointerException e) {
      
    }
    frmOpt.dispose();
          int l=0;
          String str="";
          check();
          try{
           l=Starting.name.length();
        }
         catch (NullPointerException e){}
        
       try{ 
      str =Starting.name.trim();
    } catch(NullPointerException e) {
      
    }    
          if(str!=null&& !(str+" ").equals(" ")  ){
             
          if(l<=10&&l>0&&nameok==true){
           
              Starting.Name1=true;
          
          getWorld().removeObject(this);
        }
        else{
         music.setVolume(75);
         music.play();
         Starting.name=null;
         
        }
        } else{
          music.setVolume(75);
         music.play(); 
         Starting.name=null;
        
        }
        }
    }
    public void check(){
        //überprüfen ob der name akzeptiert wird
        String v="";
       
        for(int z = 0;z<3;z++){
        try{ 
        v =Starting.name.toUpperCase();
    } catch(NullPointerException e) {
      
    }             
      
            
            if(Namereload.namev[z].toUpperCase().equals(v)){
               nameok=false; 
               
            }
            
    }
    
    }
}
