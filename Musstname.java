import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author (Luca Bäck) 
 * @version (04.01.2021)
 * 
 */
public class Musstname extends Actor
{
    /**
     * Act - do whatever the Musstname wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
    {
        //aufrufen der methode Label
        Label();
    }   
    public void Label(){
         //erstellen eines GreenfootImages zum Anzeigen der Warnung das ein Name eingegeben werden muss
        GreenfootImage imgs = new GreenfootImage(250,30);
        
       
        imgs.setColor(Color.GREEN);
        imgs.setFont(new Font("Arial", false, false , 18));
        imgs.drawString ("You must enter your name",10,20);
        setImage (imgs);
    }
}
