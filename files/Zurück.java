import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author (Luca Bäck) 
 * @version (04.01.2021)
 * 
 */
public class Zurück extends Actor
{
    //sounds
    GreenfootSound music1 = new GreenfootSound("Clicked sound.mp3");
   
    /**
     * Act - do whatever the Zurück wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act() 
    {
       //als button verwenden um zwischen verschiedenen anzeigen wechseln
       if(Greenfoot.mouseClicked(this)){
          getWorld().removeObjects(getWorld().getObjects(Anleitung.class));
          music1.setVolume(90);
          music1.play();
         getWorld().removeObject(this); 
        }
    }    
}
