import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author (Luca Bäck) 
 * @version (04.01.2021)
 * 
 */

public class Label extends Actor
{
    static int Punkte=0;
    int score = Punkte;
    int i=0;
    /**
     * Act - do whatever the Label wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(i==0){
        Punkte=0;
        i=2;
        }
        int score = Punkte;
        //aufrufen der metode punkte
        Label();
        
    }  
    public void Label(){
         //erstellen eines GreenfootImages zum Anzeigen der Punkte
        GreenfootImage img = new GreenfootImage(100,30);
        
        int score = Punkte;
        img.setColor(Color.MAGENTA);
        img.setFont(new Font("OptimusPrinceps", false, false , 18));
        img.drawString ("Punkte: "+ score,2,20);
        setImage (img);
    }
}
