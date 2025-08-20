import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,340,255);

        Enemy enemy1 = new Enemy();
        addObject(enemy1, 50, 60);

        Enemy enemy2 = new Enemy();
        addObject(enemy2, 125, 300);

        Enemy enemy3 = new Enemy();
        addObject(enemy3, 75, 500);
        Enemy enemy4 = new Enemy();
        addObject(enemy4,311,117);
        Enemy enemy5 = new Enemy();
        addObject(enemy5,411,501);
        Enemy enemy6 = new Enemy();
        addObject(enemy6,580,58);
        Enemy enemy7 = new Enemy();
        addObject(enemy7,629,302);
        Enemy enemy8 = new Enemy();
        addObject(enemy8,732,505);
    }
}
