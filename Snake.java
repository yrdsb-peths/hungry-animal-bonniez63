import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Snake, our villain.
 * 
 * @author Bonnie Zhuang
 * @version May 2023
 */
public class Snake extends Actor
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        eat();
    }
    
    public void eat()
    {
        if(isTouching(Strawberry.class))
        {
            removeTouching(Strawberry.class);
            MyWorld world = (MyWorld) getWorld();
            world.createStrawberry();
            world.increaseScore();
        }
        
    }
}
