
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author (Luca Bäck) 
 * @version (04.01.2021)
 * 
 */

public class Starting extends World
{
    //anzeigename erstellen
 static String name;
 //variablen vom typ integer und boolean
 int i=0;
 int s=0;
 static boolean Name1=false;
 static boolean namef=false;

   //sounds
 GreenfootSound music1 = new GreenfootSound("Minecraft.mp3");
 GreenfootSound b = new GreenfootSound("Angenommen.mp3");
 GreenfootSound b1 = new GreenfootSound("Bier1.mp3");
 GreenfootSound g = new GreenfootSound("Gamemusic.mp3");
 //objecte
 Anleitungb but = new Anleitungb();
    public Starting()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 480, 1); 
        name=null;
        namef=false;
        Name1=false;
        Namereload n = new Namereload();
        addObject(n,360, 375);
         if(name == null){
          Name name = new Name();
          addObject(name, 320,160); 
        
        } 
        Presss();
    }
  public void act(){
     if(s==0){
         //background music
         music1.playLoop();
         music1.setVolume(90);
         s=9;
        }
        
     
      if(i==0){
          
         if(name!=null  ){
         
          if(Name1==true){
          Base2 nam1 = new Base2();
          addObject(nam1,320,157);    
          Namea nam = new Namea();
          addObject(nam,390-135/2,160);
          b.setVolume(100);
          b.play(); 
          
          i=9;
          namef=true;
        }
        } 
        
        }
      if(namef==true && Greenfoot.isKeyDown("s") ){ //wenn name korrekt eingegeben kann man mit s das spiel starten
          music1.stop();
         
          b1.setVolume(100);
          b1.play(); 
          g.setVolume(85);
          g.playLoop(); 
          Greenfoot.setWorld( new Playground()) ; //laden der neues scene
         
         
        
        }
       
       
    }
    public void Presss(){
        Presss nam = new Presss();
        addObject(nam,325,420);
        Musstname nam1 = new Musstname();
        addObject(nam1,325,360);
        Anleitungb but = new Anleitungb();
        addObject(but,100,400);
        Bestenlisteb but1 = new Bestenlisteb();
        addObject(but1,540,400);
         
    }
}
