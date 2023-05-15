import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our snake.
 * 
 * @author Bonnie Zhuang
 * @version May 2023
 */
public class Strawberry extends Actor
{
    /**
     * Act - do whatever the Strawberry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Apple falls downward.
        int x = getX();
        int y = getY() + 2;
        setLocation(x, y);
        
        //Game over when apple falls out of world.
        MyWorld world = (MyWorld)getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
