import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author (Luca Bäck) 
 * @version (04.01.2021)
 * 
 */
public class Playground extends World
{
    
      //fügt Sounds als object hinzu
    GreenfootSound music = new GreenfootSound("Newball.mp3"); 
    GreenfootSound go = new GreenfootSound("Gameover.mp3");
     
    //static um zugreifen und abrufen von anderen Scipts aus möglich zu machen
    static int mPunkte; // legt geradzahlige Variable an für  maximale Punkte und Anzahl an Bällen
    static int balls = 3;
         
    int f = 1;
    int h = 1;
    int b1=0; //Anzahl blöcke mit einem Punkt
    int b2=0; //Anzahl blöcke mit zwei Punkten
    
    public Playground()
    {    
        
    super(640, 480, 1); 
    balls = 3; //3 startbälle
        
    b1=0;
    b2=0; 
         
         
         
    }

     public void act(){
         // wenn Leertaste gedrückt und kein Ball im Spiel ist und noch bälle verfügbar sind wird Ball mit einen Sound dem Spiel hinzugefügt
        if(Greenfoot.isKeyDown("space") && getObjects(Ball.class).size()==0 && balls>0){ 
                    
         Ball ball = new Ball();
         addObject(ball, 320, 240);
         Playground.balls=Playground.balls-1;
         music.setVolume(90);
         music.play();
         
        }
        //ruft methode fuellen auf
        fuellen();
       // maximal mögliche Punktezahl wird errechnet;
        mPunkte= 2*b2+1*b1;
       //wenn spiel vorbei ist(keine bälle mehr oder alle Blöcke eingesammelt), kurz pause und dann für jeden übrigen ball 3 extra punkte
       if(balls==-1|| Label.Punkte==mPunkte ){ 
        try{
         Thread.sleep(1000); // 1000 ms pause
        }catch(InterruptedException e){}
        if(balls == -1){
         balls = 0;
        }
         Greenfoot.setWorld( new Ending()) ; //wechseln der Welt zur Endszene
         Label.Punkte=Label.Punkte + 3*balls; //punkte zahl anpassen
         go.setVolume(90); // sound weil das Spiel vorbei ist
         go.play();
        }
       
        }
     private void fuellen(){
         
        if(f==1){
            
         //zufälliges  aufüllen des Spielfeldes mit for schleifen für jede reihe
         for(int g = 40;g<=640;g=g+56){
         int z = Greenfoot.getRandomNumber(10); 
         if(z==2||z==3||z==1){
         Box2 box2 = new Box2();
         addObject(box2, 0+g,45);
          b2=b2+1;
            }
         if(z>3){
         Box box1 = new Box();
         addObject(box1, 0+g,45);
         b1=b1+1;
            }
         if(z==0){
         Speed box3 = new Speed();
         addObject(box3, 0+g,45);
         
            }
        }
        for(int d = 30;d<=640;d=d+58){
         int z = Greenfoot.getRandomNumber(10); 
         if(z==2||z==3||z==4){
         Box2 box2 = new Box2();
         addObject(box2, 0+d,100);
         b2=b2+1;
            }
         if(z>4){
         Box box1 = new Box();
         addObject(box1, 0+d,100);
         b1=b1+1;
            }
         if(z==0||z==1){
         Speed box3 = new Speed();
         addObject(box3, 0+d,100);
         
            }
        }
        for(int d = 30;d<=640;d=d+58){
         int z = Greenfoot.getRandomNumber(10); 
         if(z==2||z==3||z==1){
         Box2 box2 = new Box2();
         addObject(box2, 0+d,155);
         b2=b2+1;
            }
         if(z>3){
         Box box1 = new Box();
         addObject(box1, 0+d,155);
         b1=b1+1;
            }
         if(z==0){
         Speed box3 = new Speed();
         addObject(box3, 0+d,155);
         
            }
        }
        
       
        f=2;
        //hinzufügen der boxen für punkte und ball anzeige
        Base base1= new Base();
        addObject(base1,515,455);
        Base base2= new Base();
        addObject(base2,127,455);
         
         
         
        
          
            
        //namensanzeige und andere Anzeigen/graphicen
        this.showText(Starting.name, 320, 455);
        Label laber = new Label();
        addObject(laber, 520, 457);
        Bälleverfügbar labern = new Bälleverfügbar();
        addObject(labern, 140, 459);
        try{
         Thread.sleep(1000);
        }catch(InterruptedException e){}
        //hinzufügen eines Balles nach kurzer pause mit Sound
        Ball ball1 = new Ball();
        addObject(ball1, 320, 240);
        music.setVolume(90);
        music.play();
        }  
        //neues paddle hinzufügen
        if(h==1){
        Paddle paddle = new Paddle();
        addObject(paddle,1,1);
        h=2;
        }
        
        
         
        
        }
        }
       

