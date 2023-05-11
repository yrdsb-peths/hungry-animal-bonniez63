import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World our villain lives in.
 * 
 * @author Bonnie Zhuang
 * @version May 2023
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Snake snake = new Snake();
        addObject(snake, 300, 300);
        
        scoreLabel = new Label(0, 75);
        addObject(scoreLabel, 50, 50);
        
        createStrawberry();
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    public void createStrawberry()
    {
        Strawberry strawberry = new Strawberry();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(strawberry, x, y);
    }
}
