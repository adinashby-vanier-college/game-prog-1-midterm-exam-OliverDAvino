// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Snake snake =  new  Snake();
        addObject(snake, 571, 20);
        Pig pig =  new  Pig();
        addObject(pig, 299, 202);
        Burger burger =  new  Burger();
        addObject(burger, 88, 64);
        Burger burger2 =  new  Burger();
        addObject(burger2, 536, 189);
        Burger burger3 =  new  Burger();
        addObject(burger3, 196, 299);
        Burger burger4 =  new  Burger();
        addObject(burger4, 395, 76);
        Burger burger5 =  new  Burger();
        addObject(burger5, 393, 339);
        Burger burger6 =  new  Burger();
        addObject(burger6, 51, 243);
        Burger burger7 =  new  Burger();
        addObject(burger7, 257, 127);
        Burger burger8 =  new  Burger();
        addObject(burger8, 109, 345);
        Burger burger9 =  new  Burger();
        addObject(burger9, 564, 330);
    }
}
