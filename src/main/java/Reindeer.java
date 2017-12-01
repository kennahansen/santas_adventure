/**
 * Reindeer object.
 */
public class Reindeer {

    /**
     * amount to increment.
     */
    private static int INCREMENT = 10;

    /**
     * amount to decrement.
     */
    private static int DECREMENT = 10;

    /**
     * default health value.
     */
    private static int DEFAULT_HEALTH = 100;

    /**
     * instance variable for health.
     */
    private int health;

    /**
     * constructor for Reindeer.
     */
    public Reindeer() {
        this.health = DEFAULT_HEALTH;
    }
    
    /**
     * prints reindeer health to command line for user to monitor.
     */
    public void printStats() {
    		System.out.println("Your reideer\'s health is: " + this.health + "!");
    }

    /**
     * getter for health.
     * @return int health
     */
    public int getHealth() {
        return this.health;
    }

    /**
     * setter for health.
     * @param setHealth int
     */
    public void setHealth(final int setHealth) {
        this.health = setHealth;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    /**
     * incrementing reindeer health function.
     */
    public void incrementHealth() {
        this.health += INCREMENT;
    }

    /**
     * decrementing reindeer health function.
     */
    public void decrementHealth() {
        this.health -= DECREMENT;
        if (this.health < 0) {
            this.health = 0;
        }
    }

}
