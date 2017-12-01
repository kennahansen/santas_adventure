import java.util.Scanner;

public class SantasAdventure {

    /**
     * value for how much a decrement is.
     */
    public static int DECREMENT = 1;

    /**
     * value for how much an increment is.
     */
    public static int INCREMENT = 1;

    /**
     * main method..... do i need a comment?? who knows.
     */
    public static void main(String[] args) {
        System.out.println("/'Twas the night before Christmas, and all through the house");
        System.out.println("not a creature was stirring, not even a mouse...");
        System.out.println("Press any key to begin...");
        Santa santa = new Santa();
        Reindeer reindeer = new Reindeer();
        goOutdoors();
    }

    /**
     * Main outdoors prompt. Funnels user to one of the houses, or loops back to goOutdoors()
     */
    public final void goOutdoors() {
    		System.out.println("As dry leaves that before the wild hurricane fly,");
    		System.out.println("When they meet with an obstacle, mount to the sky;");
    		System.out.println("So up to the house-top the coursers they flew,");
    		System.out.println("With the sleigh full of Toys - and St. Nicholas too");
    		System.out.println("You are outside, would you like to [1] Visit the mansion "
    				+ "[2] Visit the apartment [3] Visit the house  or [4] Do a trick?");
        Scanner outdoorMainSc = new Scanner(System.in);
        int outdoorMainInt = outdoorMainSc.nextInt();
        outdoorMainSc.close();
        santa.decrementWarmth();
        switch (outdoorMainInt) {
            case 1: goMansion();
                    break;
            case 2: goApartment();
                    break;
            case 3: goHouse();
                    break;
            case 4: goTricks();
                    break;
           default: System.out.println("That's not a valid input !");
                    goOutdoors();
                    break;
        }
    }

    /**
     * Method for doing tricks. returns user back to outdoor methods.
     */
    public final void goTricks() {
        System.out.println("Would you like to [1] Do a flip? [2] Laugh merrily"
        		+ " or [3] Spread good cheer?");
        Scanner tricksSc = new Scanner(System.in);
        int tricksInt = tricksSc.nextInt();
        tricksSc.close();
        switch (tricksInt) {
            case 1: System.out.println("\"Weeeeeeeeeee\"");
                    reindeer.decrementHealth();
                    santa.incrementHolidaySpirit();
                    goOutdoors();
                    break;
            case 2: System.out.println("\"HO! HO! HO!\"");
		            reindeer.decrementHealth();
		            santa.incrementHolidaySpirit();
                    goOutdoors();
                    break;
            case 3: System.out.println("\"Merry Christmas to all, and to all a good night!\"");
		            reindeer.decrementHealth();
		            santa.incrementHolidaySpirit();
                    goOutdoors();
                    break;
        }
    }

    /**
     * main method for exploring the house.
     */
    public void goHouse() {
    }
    public void goApartment() {
    }
    public void goMansion() {
    }

}
