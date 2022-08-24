import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author (Luca Bäck) 
 * @version (04.01.2021)
 * 
 */
public class Bälleverfügbar extends Actor
{
    /**
     * Act - do whatever the Bälleverfügbar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //aufrufen der Methode Label
        Label();
    }  
    public void Label(){
        //erstellen eines Bildes mit den Maßen 100 und 30
        GreenfootImage img = new GreenfootImage(100,30);
        
        // schrift in blauer schrift in Größe 20 mit der Schriftart "OptimusPrinceps" zeigt Anzahl der verfügbaren Bälle an
        img.setColor(Color.BLUE);
        img.setFont(new Font("OptimusPrinceps", false, false , 20));
        img.drawString ("Bälle: "+ Playground.balls,2,18);
        setImage (img);
    }
}
