import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author (Luca Bäck) 
 * @version (04.01.2021)
 * 
 */
public class Presss extends Actor
{
    /**
     * Act - do whatever the Presss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //aufrufen der methode label
        Label();
    }   
    public void Label(){
        //erstellen eines GreenfootImages zum Anzeigen der Start Anweisung
        GreenfootImage imgs = new GreenfootImage(250,30);
        
       
        imgs.setColor(Color.YELLOW);
        imgs.setFont(new Font("OptimusPrinceps", false, false , 18));
        imgs.drawString ("Press ^s^ to start the game!",10,20);
        setImage (imgs);
    }
}
