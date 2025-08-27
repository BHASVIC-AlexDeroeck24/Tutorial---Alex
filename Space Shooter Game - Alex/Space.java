import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
    HealthBar healthbar = new HealthBar();
    Counter counter = new Counter();
    boolean bossLevel = false;
    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
    }

    public Counter getCounter()
    {
        return counter;
    }

    public HealthBar getHealthBar()
    {
        return healthbar;
    }

    public void act()
    {
        addEnemy1();
        addEnemy2();
        boss();
    }

    public void boss()
    {
        if (counter.score == 25 || counter.score == 26)
        {
            if (bossLevel == false)
            {
                addObject(new Boss(), 300, 0);
                bossLevel = true;
            }
        }
    }

    public void addEnemy1()
    {
        if(Greenfoot.getRandomNumber(60)<1)
        {
            addObject(new Enemy1(),Greenfoot.getRandomNumber(800), 0);
        }
    }

    public void addEnemy2()
    {
        if(Greenfoot.getRandomNumber(100)<1)
        {
            addObject(new Enemy2(),Greenfoot.getRandomNumber(800), 0);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(counter, 100, 80);
        addObject(healthbar, 400, 80);
        Player player = new Player();
        addObject(player,400,600);

    }
}
