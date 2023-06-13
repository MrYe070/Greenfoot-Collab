import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("space")) {
            Enemy1 enemy = (Enemy1) getOneIntersectingObject(Enemy1.class);
            if (enemy != null) {
                attack(enemy);
            }
        }
    }
    
    public void attack(Enemy1 enemy) {
        // TODO: Decrease enemy health;
    }
}
