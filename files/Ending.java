import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author (Luca Bäck) 
 * @version (04.01.2021)
 * 
 */
public class Ending extends World
{
    public Ending()
    {    
        // Create a new world with 640x480 cells with a cell size of 1x1 pixels.
        super(640, 480, 1);
        
        Finalscore ball = new Finalscore(); //fügt den endgültigen Punktestand in Form von der Actor Klasse hinzu
        addObject(ball,450, 260);
        DateiErzeugen n = new DateiErzeugen(); //Speichern des Punktestandes
        addObject(n,360, 375);
         
         
        //Anzeigen des ersten bis dritten Platzes über alle Zeit
        Erster e= new Erster(); 
        addObject(e,360, 360);
        Zweiter z = new Zweiter();
        addObject(z,360, 400);
        Dritter d = new Dritter();
        addObject(d,360, 440);
    }
}
