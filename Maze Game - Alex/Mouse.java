import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mouse extends Actor
{
    /**
     * Act - do whatever the Mouse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 3;
    int collect = 0;
    public Mouse()
    {
        getImage().scale(getImage().getWidth() / 2, getImage().getHeight() / 2);
    }
    public void act()
    {
        // Add your action code here.
        moveAround();
        hitFood();
        hitTeleporter();
        youLose();
        youWin();
    }
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + speed, getY());
            if (hitWall() == true)
            {
                setLocation(getX() - speed, getY());
            }
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - speed, getY());
            if (hitWall() == true)
            {
                setLocation(getX() + speed, getY());
            }
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - speed);
            if (hitWall() == true)
            {
                setLocation(getX(), getY() + speed);
            }
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + speed);
            if (hitWall() == true)
            {
                setLocation(getX(), getY() - speed);
            }
        }
    }
    public boolean hitWall()
    {
        if (isTouching(Walls.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void hitFood()
    {
        if(getOneIntersectingObject(Pizza.class)!=null)
        {
            getWorld().removeObject(getOneIntersectingObject(Pizza.class));
            speed ++;
            collect++;
        }
    }
    public void hitTeleporter()
    {
        if(isTouching(Teleporter.class))
        {
            setLocation(40,566);
        }
    }
    public boolean hitEnemy()
    {
        if(isTouching(Enemy.class) || isTouching(Snake.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void youLose()
    {
        if (hitEnemy())
        {
            getWorld().addObject(new YouLose(), 300, 300);
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
    public void youWin()
    {
        if (isTouching(WinningPlatform.class) && collect >= 4)
        {
            getWorld().addObject(new YouWin(), 300, 300);
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
}
