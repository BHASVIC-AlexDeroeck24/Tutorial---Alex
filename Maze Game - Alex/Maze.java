import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maze extends World
{
    int time = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Maze()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    public void act()
    {
        time++;
        if (time % 540 == 0)
        {
            //addObject(new Enemy(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(600));
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Enemy enemy1 = new Enemy();
        addObject(enemy1, 500, 480);
        Enemy enemy2 = new Enemy();
        addObject(enemy2, 100, 350);
        Enemy enemy3 = new Enemy();
        addObject(enemy3, 100, 150);
        
        WinningPlatform winningplatform1 = new WinningPlatform();
        addObject(winningplatform1, 600, 325);

        WallWidthSmall wallWidthSmall = new WallWidthSmall();
        addObject(wallWidthSmall,69,529);
        wallWidthSmall.setLocation(35,532);
        WallWidthSmall wallWidthSmall2 = new WallWidthSmall();
        addObject(wallWidthSmall2,146,535);
        wallWidthSmall2.setLocation(153,535);
        WallWidthSmall wallWidthSmall3 = new WallWidthSmall();
        addObject(wallWidthSmall3,386,418);
        wallWidthSmall3.setLocation(386,417);
        WallWidthSmall wallWidthSmall4 = new WallWidthSmall();
        addObject(wallWidthSmall4,510,476);
        wallWidthSmall4.setLocation(494,473);
        WallWidthSmall wallWidthSmall5 = new WallWidthSmall();
        addObject(wallWidthSmall5,511,240);
        wallWidthSmall5.setLocation(508,240);
        wallWidthSmall4.setLocation(502,477);
        wallWidthSmall4.setLocation(501,471);
        wallWidthSmall4.setLocation(506,474);
        WallWidthSmall wallWidthSmall6 = new WallWidthSmall();
        addObject(wallWidthSmall6,214,410);
        wallWidthSmall6.setLocation(214,419);
        WallWidthSmall wallWidthSmall7 = new WallWidthSmall();
        addObject(wallWidthSmall7,334,355);
        wallWidthSmall7.setLocation(330,358);
        WallWidthSmall wallWidthSmall8 = new WallWidthSmall();
        addObject(wallWidthSmall8,333,241);
        wallWidthSmall8.setLocation(327,241);
        WallWidthSmall wallWidthSmall9 = new WallWidthSmall();
        addObject(wallWidthSmall9,39,295);
        wallWidthSmall9.setLocation(37,298);
        WallWidthSmall wallWidthSmall10 = new WallWidthSmall();
        addObject(wallWidthSmall10,88,66);
        wallWidthSmall10.setLocation(100,66);
        WallWidthMedium wallWidthMedium = new WallWidthMedium();
        addObject(wallWidthMedium,134,481);
        wallWidthMedium.setLocation(63,417);
        WallWidthMedium wallWidthMedium2 = new WallWidthMedium();
        addObject(wallWidthMedium2,527,415);
        wallWidthMedium2.setLocation(539,416);
        WallWidthMedium wallWidthMedium3 = new WallWidthMedium();
        addObject(wallWidthMedium3,152,239);
        wallWidthMedium3.setLocation(123,241);
        WallWidthMedium wallWidthMedium4 = new WallWidthMedium();
        addObject(wallWidthMedium4,82,114);
        wallWidthMedium4.setLocation(66,122);
        WallWidthLong wallWidthLong = new WallWidthLong();
        addObject(wallWidthLong,443,544);
        wallWidthLong.setLocation(546,532);
        wallWidthLong.setLocation(453,536);
        wallWidthLong.setLocation(509,535);
        WallWidthLong wallWidthLong2 = new WallWidthLong();
        addObject(wallWidthLong2,156,475);
        wallWidthLong2.setLocation(239,477);
        wallWidthLong2.setLocation(271,475);
        wallWidthLong2.setLocation(242,475);
        wallWidthLong2.setLocation(211,474);
        WallWidthLong wallWidthLong3 = new WallWidthLong();
        addObject(wallWidthLong3,152,362);
        wallWidthLong3.setLocation(154,357);
        WallWidthLong wallWidthLong4 = new WallWidthLong();
        addObject(wallWidthLong4,204,294);
        wallWidthLong4.setLocation(233,299);
        wallWidthLong4.setLocation(283,301);
        wallWidthLong4.setLocation(241,299);
        wallWidthLong4.setLocation(212,299);
        WallWidthLong wallWidthLong5 = new WallWidthLong();
        addObject(wallWidthLong5,446,304);
        wallWidthLong5.setLocation(451,300);
        wallWidthLong5.setLocation(434,303);
        wallWidthLong5.setLocation(447,300);
        WallWidthLong wallWidthLong6 = new WallWidthLong();
        addObject(wallWidthLong6,222,180);
        wallWidthLong6.setLocation(213,182);
        WallWidthLong wallWidthLong7 = new WallWidthLong();
        addObject(wallWidthLong7,395,64);
        wallWidthLong7.setLocation(389,64);
        WallWidthLong wallWidthLong8 = new WallWidthLong();
        addObject(wallWidthLong8,347,126);
        wallWidthLong8.setLocation(330,119);
        wallWidthLong8.setLocation(351,124);
        wallWidthLong8.setLocation(348,124);
        wallWidthLong8.setLocation(330,125);
        wallWidthSmall10.setLocation(98,63);
        wallWidthSmall10.setLocation(97,63);
        wallWidthSmall10.setLocation(96,64);
        WallWidthSmall wallWidthSmall11 = new WallWidthSmall();
        addObject(wallWidthSmall11,87,476);
        wallWidthSmall11.setLocation(102,476);
        wallWidthLong2.setLocation(150,474);
        wallWidthLong2.setLocation(205,474);
        wallWidthLong2.setLocation(204,478);
        wallWidthLong2.setLocation(209,477);
        wallWidthSmall11.setLocation(91,478);
        wallWidthSmall11.setLocation(93,477);
        WallHeightSmall wallHeightSmall = new WallHeightSmall();
        addObject(wallHeightSmall,65,509);
        wallHeightSmall.setLocation(65,506);
        WallHeightSmall wallHeightSmall2 = new WallHeightSmall();
        addObject(wallHeightSmall2,122,570);
        wallHeightSmall2.setLocation(125,564);
        WallHeightSmall wallHeightSmall3 = new WallHeightSmall();
        addObject(wallHeightSmall3,243,563);
        wallHeightSmall3.setLocation(241,565);
        WallHeightSmall wallHeightSmall4 = new WallHeightSmall();
        addObject(wallHeightSmall4,241,386);
        WallHeightSmall wallHeightSmall5 = new WallHeightSmall();
        addObject(wallHeightSmall5,64,327);
        WallHeightSmall wallHeightSmall6 = new WallHeightSmall();
        addObject(wallHeightSmall6,183,264);
        WallHeightSmall wallHeightSmall7 = new WallHeightSmall();
        addObject(wallHeightSmall7,243,209);
        wallHeightSmall7.setLocation(243,213);
        wallHeightSmall6.setLocation(181,273);
        WallHeightSmall wallHeightSmall8 = new WallHeightSmall();
        addObject(wallHeightSmall8,302,271);
        wallHeightSmall8.setLocation(299,271);
        WallHeightSmall wallHeightSmall9 = new WallHeightSmall();
        addObject(wallHeightSmall9,125,93);
        wallHeightSmall9.setLocation(123,93);
        WallHeightSmall wallHeightSmall10 = new WallHeightSmall();
        addObject(wallHeightSmall10,245,96);
        wallHeightSmall10.setLocation(241,94);
        WallHeightSmall wallHeightSmall11 = new WallHeightSmall();
        addObject(wallHeightSmall11,360,155);
        wallHeightSmall11.setLocation(360,155);
        WallHeightMedium wallHeightMedium = new WallHeightMedium();
        addObject(wallHeightMedium,107,193);
        wallHeightMedium.setLocation(61,185);
        WallHeightMedium wallHeightMedium2 = new WallHeightMedium();
        addObject(wallHeightMedium2,359,531);
        wallWidthMedium2.setLocation(479,416);
        WallHeightMedium wallHeightMedium3 = new WallHeightMedium();
        addObject(wallHeightMedium3,479,416);
        WallHeightSmall wallHeightSmall12 = new WallHeightSmall();
        addObject(wallHeightSmall12,360,327);
        wallHeightSmall12.setLocation(357,330);
        wallHeightSmall12.setLocation(361,333);
        WallHeightLong wallHeightLong = new WallHeightLong();
        addObject(wallHeightLong,302,446);
        WallHeightLong wallHeightLong2 = new WallHeightLong();
        addObject(wallHeightLong2,419,224);
        wallHeightLong2.setLocation(418,215);
        WallHeightLong wallHeightLong3 = new WallHeightLong();
        addObject(wallHeightLong3,476,89);
        wallHeightLong3.setLocation(477,95);
        WallHeightLong wallHeightLong4 = new WallHeightLong();
        addObject(wallHeightLong4,536,154);
        WallHeightMedium wallHeightMedium4 = new WallHeightMedium();
        addObject(wallHeightMedium4,418,469);
        wallHeightMedium4.setLocation(417,475);
        wallWidthLong5.setLocation(535,300);
        WallHeightMedium wallHeightMedium5 = new WallHeightMedium();
        addObject(wallHeightMedium5,535,300);
        WallHeightLong wallHeightLong5 = new WallHeightLong();
        addObject(wallHeightLong5,183,82);
        wallHeightLong5.setLocation(183,88);
        wallHeightLong5.setLocation(183,91);
        WallHeightSmall wallHeightSmall13 = new WallHeightSmall();
        addObject(wallHeightSmall13,418,326);
        wallHeightSmall13.setLocation(421,336);
        wallHeightSmall13.setLocation(418,326);
        WallHeightLong wallHeightLong6 = new WallHeightLong();
        addObject(wallHeightLong6,583,197);
        wallHeightLong6.setLocation(597,237);
        wallHeightLong6.setLocation(597,220);
        wallHeightLong6.setLocation(600,203);
        wallHeightLong6.setLocation(597,200);
        wallHeightLong6.setLocation(595,210);
        WallHeightMedium wallHeightMedium6 = new WallHeightMedium();
        addObject(wallHeightMedium6,593,67);
        wallHeightMedium6.setLocation(595,61);
        WallHeightLong wallHeightLong7 = new WallHeightLong();
        addObject(wallHeightLong7,587,453);
        wallHeightLong7.setLocation(596,446);
        WallHeightSmall wallHeightSmall14 = new WallHeightSmall();
        addObject(wallHeightSmall14,593,565);
        wallHeightSmall14.setLocation(596,565);
        WallHeightLong wallHeightLong8 = new WallHeightLong();
        addObject(wallHeightLong8,11,160);
        wallHeightLong8.setLocation(7,208);
        WallHeightMedium wallHeightMedium7 = new WallHeightMedium();
        addObject(wallHeightMedium7,8,53);
        wallHeightMedium7.setLocation(6,63);
        WallHeightLong wallHeightLong9 = new WallHeightLong();
        addObject(wallHeightLong9,6,481);
        wallHeightLong9.setLocation(8,445);
        WallHeightSmall wallHeightSmall15 = new WallHeightSmall();
        addObject(wallHeightSmall15,5,329);
        wallHeightSmall15.setLocation(8,328);
        WallWidthLongest wallWidthLongest = new WallWidthLongest();
        addObject(wallWidthLongest,276,590);
        wallWidthLongest.setLocation(301,595);
        WallWidthLongest wallWidthLongest2 = new WallWidthLongest();
        addObject(wallWidthLongest2,308,7);
        wallWidthLongest2.setLocation(300,4);
        Mouse mouse = new Mouse();
        addObject(mouse,43,562);
        mouse.setLocation(40,566);
        wallWidthMedium2.setLocation(584,416);
        wallWidthLong5.setLocation(378,302);
        wallWidthLong5.setLocation(446,301);
        wallWidthMedium2.setLocation(496,419);
        wallWidthMedium2.setLocation(539,416);
        wallHeightLong9.setLocation(6,445);
        wallHeightLong9.setLocation(3,427);
        wallHeightLong9.setLocation(3,446);
        wallHeightSmall15.setLocation(3,341);
        wallHeightSmall15.setLocation(3,316);
        wallHeightSmall15.setLocation(5,332);
        wallHeightSmall15.setLocation(3,329);
        wallHeightLong8.setLocation(3,282);
        wallHeightLong8.setLocation(3,215);
        wallHeightMedium7.setLocation(6,93);
        wallHeightMedium7.setLocation(2,67);
        wallWidthLongest.setLocation(190,596);
        wallWidthLongest.setLocation(300,597);
        wallHeightMedium2.setLocation(361,569);
        wallHeightMedium2.setLocation(362,513);
        wallHeightMedium2.setLocation(363,538);
        wallHeightMedium4.setLocation(423,498);
        wallHeightMedium4.setLocation(422,473);
        wallWidthSmall3.setLocation(414,417);
        wallWidthSmall3.setLocation(391,416);
        wallWidthLong5.setLocation(379,301);
        wallWidthLong5.setLocation(448,300);
        wallHeightLong4.setLocation(536,220);
        wallHeightLong4.setLocation(535,153);
        wallWidthLong8.setLocation(391,122);
        wallWidthLong8.setLocation(332,122);
        wallHeightSmall10.setLocation(247,104);
        wallHeightSmall10.setLocation(245,92);
        wallHeightSmall9.setLocation(123,98);
        wallHeightSmall9.setLocation(120,79);
        wallHeightSmall9.setLocation(122,91);
        wallHeightSmall6.setLocation(177,260);
        wallHeightSmall6.setLocation(179,270);
        wallHeightSmall5.setLocation(66,339);
        wallHeightSmall5.setLocation(63,325);
        wallWidthLong3.setLocation(79,355);
        wallWidthLong3.setLocation(155,356);
        wallHeightSmall5.setLocation(61,337);
        wallHeightSmall5.setLocation(63,330);
        wallWidthSmall6.setLocation(217,417);
        wallWidthSmall6.setLocation(215,418);
        wallHeightSmall12.setLocation(360,346);
        wallHeightSmall12.setLocation(361,322);
        wallHeightSmall12.setLocation(361,332);
        wallHeightSmall12.setLocation(361,332);
        wallHeightMedium6.setLocation(596,111);
        wallHeightMedium6.setLocation(598,45);
        wallHeightMedium6.setLocation(597,64);
        wallHeightMedium6.setLocation(597,64);
        wallHeightLong6.setLocation(595,142);
        wallHeightLong6.setLocation(595,113);
        wallHeightLong6.setLocation(597,80);
        wallHeightLong6.setLocation(560,228);
        wallHeightMedium6.setLocation(596,105);
        wallHeightMedium6.setLocation(595,68);
        wallHeightMedium6.setLocation(596,68);
        wallHeightLong6.setLocation(597,151);
        wallHeightLong6.setLocation(596,217);
        wallHeightLong6.setLocation(598,274);
        wallHeightLong6.setLocation(597,212);
        wallHeightLong6.setLocation(596,205);
        wallWidthLongest2.setLocation(576,5);
        wallWidthLongest2.setLocation(300,1);
        wallHeightMedium6.setLocation(594,36);
        wallHeightMedium6.setLocation(596,60);
        wallHeightMedium7.setLocation(7,61);
        wallHeightMedium7.setLocation(2,65);
        wallWidthSmall2.setLocation(157,536);
        wallWidthSmall2.setLocation(152,536);
        wallWidthSmall11.setLocation(83,478);
        wallWidthSmall11.setLocation(92,477);
        wallWidthSmall8.setLocation(320,239);
        wallWidthSmall8.setLocation(326,243);
        wallWidthSmall7.setLocation(332,358);
        wallWidthSmall7.setLocation(329,358);

        Pizza pizza = new Pizza();
        addObject(pizza,33,500);
        Pizza pizza2 = new Pizza();
        addObject(pizza2,511,443);
        Pizza pizza3 = new Pizza();
        addObject(pizza3,439,29);
        Pizza pizza4 = new Pizza();
        addObject(pizza4,91,92);
        Pizza pizza5 = new Pizza();
        addObject(pizza5,31,150);
        Pizza pizza6 = new Pizza();
        addObject(pizza6,555,565);

        Teleporter teleporter = new Teleporter();
        addObject(teleporter,157,566);
        Teleporter teleporter2 = new Teleporter();
        addObject(teleporter2,32,327);
        Teleporter teleporter3 = new Teleporter();
        addObject(teleporter3,390,153);

        Snake snake1 = new Snake();
        addObject(snake1,446,92);
        Snake snake2 = new Snake();
        addObject(snake2,336,388);
    }
}
