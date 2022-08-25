import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author (Luca Bäck) 
 * @version (04.01.2021)
 * 
 */
public class Erster1 extends Actor
{
    /**
     * Act - do whatever the Erster1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
         public void act() 
    {
        //aufrufen der methode label
        Label();
    }   
    public void Label(){
         //erstellen eines GreenfootImages zum Anzeigen des ersten Platzes
        GreenfootImage imgs = new GreenfootImage(400,50);
        
       
        imgs.setColor(Color.YELLOW);
        imgs.setFont(new Font("OptimusPrinceps", false, false ,30));
        imgs.drawString ("1. "+Namereload.namev[0]+": "+Namereload.punktev[0]+" Punkte",10,30);
        setImage (imgs);
    } 
    }    

