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
    
    GreenfootSound snakeSound = new GreenfootSound("snake-hissing-6092.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[7];
    GreenfootImage[] idleLeft = new GreenfootImage[7]; 
    
    String facing = "left";
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Snake()
    {
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/snake_idle/idle" + i + ".png");
            idleLeft[i].scale(100, 100);
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/snake_idle/idle" + i + ".png");
            idleRight[i].mirrorHorizontally();
            idleRight[i].scale(100, 100);
        }
        
        setImage(idleLeft[0]);
        animationTimer.mark();
    }
    
    int imageIndex = 0;
    public void animateSnake()
    {
        if(animationTimer.millisElapsed() < 2000)
        {
            animationTimer.mark();
        }
        if(facing.equals("left"))
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
        else
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
    }
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
            facing = "right";
        }
        eat();
        animateSnake();
    }
    
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            snakeSound.play();
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
        }
        
    }
}
