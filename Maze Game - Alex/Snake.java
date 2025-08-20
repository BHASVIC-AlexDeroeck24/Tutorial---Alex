import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    int speed = 2;
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Snake()
    {
        getImage().scale(getImage().getWidth() / 3 * 2, getImage().getHeight() / 3 * 2);
    }
    public void act()
    {
        moveAround();
    }
    public void moveAround()
    {
        setLocation(getX(),getY() + speed);
        if (isTouching(Walls.class))
        {
            speed = -speed;
        }
    }
}
