import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * In my world, there will be an adventurer, who has arrived on a new planet
 * on which infinite fruits fall from the sky, and also ...
 * 
 * @author Sergio
 * @version alfa 1
 */
public class FruitPlanet extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public FruitPlanet()
    {    
 // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        //create an instance of class Player
        Player babyAdventurer = new Player();

        //Add the player object to our world
        addObject(babyAdventurer, 0, 0);

        //Creo una fila de abejas separadas la misma distancia
        int numObjetos = 5;
        int separacion = getWidth() / (numObjetos + 1);

        for (int i = 1; i <= numObjetos; i++)
        {
            addObject(new Bee(), separacion * i, 200);
        }
        
        }
    }

