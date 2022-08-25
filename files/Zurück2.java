import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author (Luca Bäck) 
 * @version (04.01.2021)
 * 
 */
public class Zurück2 extends Actor
{
    GreenfootSound music1 = new GreenfootSound("Clicked sound.mp3");
    //sounds
    public void act() 
    {
        //als button verwenden um zwischen verschiedenen anzeigen wechseln
       if(Greenfoot.mouseClicked(this)){
          getWorld().removeObjects(getWorld().getObjects(Bestenliste.class));
          music1.setVolume(90);
           music1.play();
          getWorld().removeObjects(getWorld().getObjects(Erster1.class));
          getWorld().removeObjects(getWorld().getObjects(Zweiter2.class));
          getWorld().removeObjects(getWorld().getObjects(Dritter3.class));
         getWorld().removeObject(this); 
        }
    }    
}
