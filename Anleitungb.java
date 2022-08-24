import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Anleitungb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Anleitungb extends Actor
{
   GreenfootSound music1 = new GreenfootSound("Clicked sound.mp3");
  
    /**
     * Act - do whatever the Anleitungb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void act() 
    {   
       
        
       
        
       //wenn object angeklickt wird bestenliste anzeigen (sound abspielen) 
       if(Greenfoot.mouseClicked(this)){
           Anleitung s=new Anleitung();
           this.getWorld().addObject(s, 320, 240);
           Zurück v=new Zurück();
           this.getWorld().addObject(v, 560,440);
           music1.setVolume(90);
           music1.play();
        }
      
    }    
}
