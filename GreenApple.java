import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Green Apple is poison to our snake.
 * 
 * @author Bonnie Zhuang
 * @version May 2023
 */
public class GreenApple extends Actor
{
    /**
     * Act - do whatever the GreenApple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Green apple falls downward.
        int x = getX();
        int y = getY() + 2;
        setLocation(x, y);
        
        //Game ends when snake touches green apple.
    }
}
