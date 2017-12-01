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

    public static void main(String[] args) {
        System.out.println("/'Twas the night before Christmas, and all through the house");
        System.out.println("not a creature was stirring, not even a mouse...");
        System.out.println("You are santa");
    }

    /**
     * Main outdoors prompt. Funnels user to one of the house, or loops back to goOutdoors()
     */
    public final void goOutdoors() {
        Scanner outdoorMainSc = new Scanner(System.in);
        int outdoorMainInt = outdoorMainSc.nextInt();
        outdoorMainSc.close();
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

    public final void goTricks() {
        System.out.println("Would you like to:");
        System.out.println("1. Do a flip")
        System.out.println("2. Laugh merrily")
        System.out.println("3. Spread good cheer")
        Scanner tricksSc = new Scanner(System.in);
        int tricksInt = tricksSc.nextInt();
        tricksSc.close();
        switch (tricksInt) {
            case 1: System.out.println("\"Weeeeeeeeeee\"");
                    Reindeer.health -= DECREMENT;
                    Santa.success += INCREMENT;
                    goOutdoors();
                    break;
            case 2: System.out.println("\"HO! HO! HO!\"");
                    Reindeer.health -= DECREMENT;
                    Santa.success += INCREMENT;
                    goOutdoors();
                    break;
            case 3: System.out.println("\"Merry Christmas to all, and to all a good night!\"");
                    Reindeer.health -= DECREMENT;
                    Santa.success += INCREMENT;
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
    public void goTricks() {
    }

}
