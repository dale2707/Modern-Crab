import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Worm worm = new Worm();
        addObject(worm, 395, 202);
        Worm worm2 = new Worm();
        addObject(worm2, 196, 49);
        Worm worm3 = new Worm();
        addObject(worm3, 86, 182);
        Worm worm4 = new Worm();
        addObject(worm4, 33, 457);
        Worm worm5 = new Worm();
        addObject(worm5, 154, 517);
        Worm worm6 = new Worm();
        addObject(worm6, 242, 515);
        Worm worm7 = new Worm();
        addObject(worm7, 450, 472);
        Worm worm8 = new Worm();
        addObject(worm8, 258, 324);
        Worm worm9 = new Worm();
        addObject(worm9, 187, 258);
        Worm worm10 = new Worm();
        addObject(worm10, 312, 117);
        Worm worm11 = new Worm();
        addObject(worm11, 499, 75);
        Worm worm12 = new Worm();
        addObject(worm12, 492, 290);
        Worm worm13 = new Worm();
        addObject(worm13, 470, 375);
        Worm worm14 = new Worm();
        addObject(worm14, 403, 359);
        Worm worm15 = new Worm();
        addObject(worm15, 292, 161);
        Worm worm16 = new Worm();
        addObject(worm16, 93, 65);
        Worm worm17 = new Worm();
        addObject(worm17, 72, 81);
        Worm worm18 = new Worm();
        addObject(worm18, 161, 374);
        Worm worm19 = new Worm();
        addObject(worm19, 245, 284);
        Worm worm20 = new Worm();
        addObject(worm20, 174, 281);
        Worm worm21 = new Worm();
        addObject(worm21, 179, 259);
        Worm worm22 = new Worm();
        addObject(worm22, 188, 254);
        Worm worm23 = new Worm();
        addObject(worm23, 308, 154);
        Worm worm24 = new Worm();
        addObject(worm24, 334, 107);
        Worm worm25 = new Worm();
        addObject(worm25, 169, 119);
        Worm worm26 = new Worm();
        addObject(worm26, 146, 193);
        Worm worm27 = new Worm();
        addObject(worm27, 97, 187);
        Crab crab = new Crab();
        addObject(crab, 228, 194);
        Lobster lobster = new Lobster();
        addObject(lobster, 128, 194);
        lobster.setLocation(34, 255);
        crab.setLocation(124, 260);
    }
}
