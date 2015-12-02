import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
                     // Dale Thomson
public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAndTurn();
        eat();
    }

    public void  moveAndTurn(){
        move(4);
        if(Greenfoot.isKeyDown("a")){
            turn(-3);
        }
        if(Greenfoot.isKeyDown("d")){
            turn(3);
        }    
    }

    public void eat(){
        Actor worm;
        worm = getOneObjectAtOffset(0,0,Worm.class);
        if(worm!=null){
            World world;
            world = getWorld();
            world.removeObject(worm);
            Greenfoot.playSound("eating.wav");        }

    }

}
