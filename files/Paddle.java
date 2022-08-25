import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author (Luca Bäck) 
 * @version (04.01.2021)
 * 
 */
public class Paddle extends Actor
{
    /**
     * Act - do whatever the Paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    int i = 0;
    
    
    
    
    public void act() 
    {
    
   
     
    
        
   
      
   
       
        
        
    //startposition    
    if(i==0){
        setLocation(320,410);
        i=1;
    }
    //bewegun nach links und rechts
    if(getX() >=65){
        
        if(Greenfoot.isKeyDown("a")){
         setLocation(getX()-6, getY());
        }
    }
    if (getX() <= 575){
        if(Greenfoot.isKeyDown("d")){
         setLocation(getX()+6, getY());
        }
    }
    }     
}
