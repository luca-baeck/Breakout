import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author (Luca Bäck) 
 * @version (04.01.2021)
 * 
 */
public class Namea extends Actor
{
    /**
     * Act - do whatever the Namea wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //aufrufen der methode label
        Label();
    }   
    public void Label(){
         //erstellen eines GreenfootImages zum Anzeigen des Namens
        GreenfootImage imgs = new GreenfootImage(135,30);
        
       
        imgs.setColor(Color.BLACK);
        imgs.setFont(new Font("Arial", false, false , 18));
        imgs.drawString (Starting.name,2,20);
        setImage (imgs);
    }
}
