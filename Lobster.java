import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
                     // Dale Thomson
/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAndTurn();
        eat();
    }  
    public void moveAndTurn()
    {
        move (4);
        if (Greenfoot.getRandomNumber(100) <10)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5)
        {
            turn(360);
        }
        if (getY() <= 5 || getY() >= getWorld().getHeight() - 5)
        {
            turn(360);
        }
    }
    
    public void eat()
    {
    Actor crab;    
    crab = getOneObjectAtOffset(0,0,Crab.class);
    if(crab!=null){
            World world;
            world = getWorld();
            world.removeObject(crab);
            Greenfoot.playSound("eating.wav");
        }
    }
        
    }    

