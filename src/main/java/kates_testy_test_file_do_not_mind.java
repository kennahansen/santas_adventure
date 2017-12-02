import java.util.Scanner;

public class kates_testy_test_file_do_not_mind {
	public static void main(String[] args) {
        Santa santa = new Santa();
        Reindeer reindeer = new Reindeer();
        SantasAdventure adventure = new SantasAdventure();
		
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
}
