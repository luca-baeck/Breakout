import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author (Luca Bäck) 
 * @version (04.01.2021)
 * 
 */
public class Bestenlisteb extends Actor
{
    //sounds
    GreenfootSound music1 = new GreenfootSound("Clicked sound.mp3");
   
    public void act() 
    {
        //anzeigen des Bestenlisten Interfaces/Menüs wenn der Button gedrückt wurde
        if(Greenfoot.mouseClicked(this)){
         Bestenliste s = new Bestenliste();
         this.getWorld().addObject(s, 320, 240);
         Zurück2 v=new Zurück2();
         this.getWorld().addObject(v, 560,440);
         //sound abspielern
         music1.setVolume(90);
         music1.play();
         Erster1 e= new Erster1();
         this.getWorld().addObject(e,380, 200);
         Zweiter2 z = new Zweiter2();
         this.getWorld().addObject(z,380, 300);
         Dritter3 d = new Dritter3();
         this.getWorld().addObject(d,380, 400);
        }
    }    
}
