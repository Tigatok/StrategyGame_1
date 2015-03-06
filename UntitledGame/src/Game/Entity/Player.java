package Game.Entity;

import Game.location.Location;

/**
 * Created by Tyler on 2/28/2015.
 */
public class Player implements Entity {
    public int x;
    public int y;
    public int z;
    public int dir;
    public double health = 0;
    public boolean isWalking;

    public Player(Location locationToSpawn) {
        System.out.println("[debug] Creating new Player");
        health = 20.0; //Assign basic health value to player.
        this.x = locationToSpawn.getX();
        this.y = locationToSpawn.getY();
        this.z = locationToSpawn.getZ();
        this.dir = locationToSpawn.getDir();
        this.isWalking = true;
    }

    public int getX() {

        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public boolean isWalking() {
        return isWalking;
    }

    public void setWalking(boolean isWalking) {
        this.isWalking = isWalking;
    }

    @Override
    public Location getLocation() {
        return new Location(x, y, z, dir);
    }

    @Override
    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
}
