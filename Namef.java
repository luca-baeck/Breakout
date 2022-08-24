import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author (Luca Bäck) 
 * @version (04.01.2021)
 * 
 */
public class Namef extends Actor
{
    /**
     * Act - do whatever the Namef wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //aufrufen der methode label
        Label();
    }   
    public void Label(){
         //erstellen eines GreenfootImages zum Anzeigen des Namens
        GreenfootImage imgs = new GreenfootImage(300,40);
        
       
        imgs.setColor(Color.GREEN);
        imgs.setFont(new Font("Arial", false, false , 30));
        imgs.drawString (Starting.name,2,30);
        setImage (imgs);
    }
}
