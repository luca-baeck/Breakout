import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author (Luca Bäck) 
 * @version (04.01.2021)
 * 
 */
public class Finalscore extends Actor
{
    /**
     * Act - do whatever the Finalscore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //aufrufen der methode label
        Label();
    }   
    public void Label(){
         //erstellen eines GreenfootImages zum Anzeigen der Punkte
        GreenfootImage imgs = new GreenfootImage(250,50);
        
       
        imgs.setColor(Color.RED);
        imgs.setFont(new Font("OptimusPrinceps", false, false ,35));
        imgs.drawString (Label.Punkte+" Punkte",10,30);
        setImage (imgs);
    }
}
