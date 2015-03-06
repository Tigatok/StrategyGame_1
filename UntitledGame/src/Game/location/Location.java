package Game.location;

/**
 * Created by Tyler on 2/28/2015.
 */
public class Location {

    private int x;
    private int y;
    private int z;
    private int dir;

    /**
     * Creates a new Location with X, Y, Z coordinates
     *
     * @param x
     * @param y
     * @param z
     */
    public Location(int x, int y, int z, int dir) {
        System.out.println("[Debug]New Location. X: " + x + " Y:" + y + " Z: " + z + " dir: " + dir);
        this.x = x;
        this.y = y;
        this.z = z;
        this.dir = dir;
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


}
