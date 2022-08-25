import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author (Luca Bäck) 
 * @version (04.01.2021)
 * 
 */
public class Dritter extends Actor
{
    /**
     * Act - do whatever the Dritter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //aufrufen der methode label
        Label();
    }   
    public void Label(){
        //anlegen eines GreenfootImages mit den Maßen 400 und 50
        GreenfootImage imgs = new GreenfootImage(400,50);
        
        //farbe auf gelb setzen und schrift auf "OptimusPrinceps" mit Größe 30 setzen
        imgs.setColor(Color.YELLOW);
        imgs.setFont(new Font("OptimusPrinceps", false, false ,30));
        imgs.drawString ("3. "+DateiErzeugen.namel[2]+": "+DateiErzeugen.punktel[2]+" Punkte",10,30);
        setImage (imgs);
    }   
}
