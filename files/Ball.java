import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author (Luca Bäck) 
 * @version (04.01.2021)
 * 
 */
public class Ball extends Actor
{

   
    
    
  int z;
  //sounds
  GreenfootSound music = new GreenfootSound("Score1.mp3");
  GreenfootSound b = new GreenfootSound("Score2.mp3");
  GreenfootSound c = new GreenfootSound("Speed up.mp3");
  //anlegen der Variablen für die x und y Richtung des Balles
  private int dx = 7 - Greenfoot.getRandomNumber(15);
  private int dy = -10 + Greenfoot.getRandomNumber(6);
    public void act() 
    {
        
        
        if(dx==0){ //fixen des Fehlers das der ball sich immer in x richtung bewegen muss
        dx = 1;
        }
       //position aktualisieren
       setLocation(getX() + dx, getY() + dy);
       //aufrufen Aller Methoden die der ball benötigt
       pruefeKontaktRandRechts();
       pruefeKontaktRandLinks();
       pruefeKontaktRandOben();
       pruefeKontaktPaddle();
       pruefeKontaktBox();
       pruefeKontaktBox2();
       pruefeKontaktBox3();
       pruefeKontaktBase();
       pruefeKontaktRandUnten();       
    } 
    private void pruefeKontaktRandRechts()
    {
       //wenn der ball die rechte Spielfeld seite berührt wird seine x Richtung umgekehrt
       if(getX() >= 630){
           dx = -dx;
        }
    }
     private void pruefeKontaktRandLinks()
    {
        //wenn der ball die links Spielfeld seite berührt wird seine x Richtung umgekehrt
        if(getX() <= 10){
           dx = -1 * dx;     
        }
    }
    private void pruefeKontaktRandOben()
    {
       //wenn der ball die obere Spielfeld seite berührt wird seine y Richtung umgekehrt
       if(getY() <= 10){
           dy = -1 * dy;
        }
    }
     private void pruefeKontaktRandUnten()
    {
        //wenn der ball die untere Spielfeld seite berührt wird er entfernt und der ballzähler um eins verringert
        if(getY() >= 479){
           if(Playground.balls==0){
             Playground.balls=Playground.balls-1;  
            }
           getWorld().removeObject(this);
        
        }
    }
    private void pruefeKontaktPaddle()
    {
        //bei kontakt mit dem Paddle wird die y Richtung des Balles umgekehrt
        if(getOneIntersectingObject(Paddle.class) != null ){
           dy= -dy; 
           
           }
}
private void pruefeKontaktBox()
    {
        //bei kontakt mit einer Box wird die Box entfernt, ein Sound abgespielt und die Punktezahl um eins erhöht
        Actor block = getOneIntersectingObject(Box.class);
        if( block != null ){
           dy= -1 * dy;
           getWorld().removeObject(block);
           Label.Punkte=Label.Punkte+1;
            music.setVolume(90);
          music.play();
           
           }
}
private void pruefeKontaktBox2()
    {
        //bei kontakt mit einer Box wird die Box entfernt, ein Sound abgespielt und die Punktezahl um zwei erhöht
        Actor block = getOneIntersectingObject(Box2.class);
        if( block != null ){
           dy= -1 * dy;           
           getWorld().removeObject(block);
           Label.Punkte=Label.Punkte+2;
            b.setVolume(90);
          b.play();
           
           }
}
private void pruefeKontaktBox3()
    {
        //bei kontakt mit einer Box wird die Geschwindigkeit des balles zufällig verändert und ein sound abgespielt und der block entfernt
        Actor block = getOneIntersectingObject(Speed.class);
        if( block != null ){
           z= Greenfoot.getRandomNumber(2);
          
           if(z==0){
           dy= dy+2;
            dx=dx+3;
        } 
           if(z==1){
           dy= dy-2;
            dx=dx-3;
        } 
        if(dy==0){
            dy=3;
        }
         if(dx==0){
            dx=3;
        }
        c.setVolume(100);
          c.play();
          dy= -1 * dy;
           getWorld().removeObject(block);
           
           
           }
}
private void pruefeKontaktBase()
    {
        //lässt den Ball an den Anzeigen abprallen
        Actor block = getOneIntersectingObject(Base.class);
        if( block != null ){
           dy= -1 * dy;            
           
          
           }
}

}
