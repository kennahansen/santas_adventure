import java.util.Scanner;

public class SantasAdventure {

	private static boolean goToMansion = true;
	private static boolean goToApartment = true;
	private static boolean goToHouse = true;
	public static Santa santa = new Santa();
	public static Reindeer reindeer = new Reindeer();

	/**
	 * value for how much a decrement is.
	 */
	public static int DECREMENT = 1;

	/**
	 * value for how much an increment is.
	 */
	public static int INCREMENT = 1;

	// Scanner
	public static Scanner sc = new Scanner(System.in);

	/**
	 * main method..... do i need a comment?? who knows.
	 */
	public static void main(String[] args) {
		System.out.println("/'Twas the night before Christmas, and all through the house");
		System.out.println("not a creature was stirring, not even a mouse...");
		System.out.println("Press any key to begin...");

		System.out.println("As dry leaves that before the wild hurricane fly,");
		System.out.println("When they meet with an obstacle, mount to the sky;");
		System.out.println("So up to the house-top the coursers they flew,");
		System.out.println("With the sleigh full of Toys - and St. Nicholas too");
		goOutdoors();
		sc.close();
	}

	/**
	 * Main outdoors prompt. Funnels user to one of the house, or loops back to
	 * goOutdoors()
	 */
	public static void goOutdoors() {
		System.out.println("You are outside, would you like to [1] Visit the mansion "
				+ "[2] Visit the apartment [3] Visit the house  or [4] Do a trick?");

		
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("Please enter a number!");
		}
		int outdoorMainInt = sc.nextInt();

		santa.decrementWarmth();

		switch (outdoorMainInt) {
		case 1:
			if (goToMansion) {
				goMansion();
				break;
			} else {
				System.out.println("You already went there! Please chose another option:");
				goOutdoors();
				break;
			}
		case 2:
			if (goToApartment) {
				goApartment();
				break;
			} else {
				System.out.println("You already went there! Please chose another option:");
				goOutdoors();
				break;
			}
		case 3:
			if (goToHouse) {
				goHouse();
				break;
			} else {
				System.out.println("You already went there! Please chose another option:");
				goOutdoors();
				break;
			}
		case 4:
			goTricks();
			break;
		default:
			System.out.println("That's not a valid input !");
			goOutdoors();
			break;
		}
	}

	/**
	 * Method for doing tricks. returns user back to outdoor methods.
	 */
	public static void goTricks() {
		System.out.println("Would you like to [1] Do a flip? [2] Laugh merrily" + " or [3] Spread good cheer?");

		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("Please enter a number!");
		}
		int tricksInt = sc.nextInt();

		switch (tricksInt) {
		case 1:
			System.out.println("\"Weeeeeeeeeee\"");
			reindeer.decrementHealth();
			santa.incrementHolidaySpirit();
			System.out.println("Now your reindeer's HEALTH is: " + reindeer.getHealth());
			System.out.println("Now your HOLIDAY SPIRIT is: " + santa.getHolidaySpirit());
			goOutdoors();
			break;
		case 2:
			System.out.println("\"HO! HO! HO!\"");
			reindeer.decrementHealth();
			santa.incrementHolidaySpirit();
			System.out.println("Now your reindeer's HEALTH is: " + reindeer.getHealth());
			System.out.println("Now your HOLIDAY SPIRIT is: " + santa.getHolidaySpirit());
			goOutdoors();
			break;
		case 3:
			System.out.println("\"Merry Christmas to all, and to all a good night!\"");
			reindeer.decrementHealth();
			santa.incrementHolidaySpirit();
			System.out.println("Now your reindeer's HEALTH is: " + reindeer.getHealth());
			System.out.println("Now your HOLIDAY SPIRIT is: " + santa.getHolidaySpirit());
			goOutdoors();
			break;
		default:
			System.out.println("That's not a valid input!");
			goTricks();
		}
	}

	/**
	 * main method for exploring the house.
	 */
	public static void goHouse() {
		
	}

	public static void goApartment() {
		goToApartment = false;
		System.out.println("Welcome to the apartment! Oh my, there is no chimney!");
		System.out.println("Would you like to:");
		System.out.println("[1] Crawl down the fire escape?");
		System.out.println("[2] Enter through the door?");

		int enterNum = sc.nextInt();

		switch (enterNum) {
		case 1:
			System.out.println("You spot two windows! Do you:");
			System.out.println("[1] Enter in window 1" + "\n" + "[2] Enter in window 2");
			int windowNum = sc.nextInt();

			switch (windowNum) {
			case 1:
				System.out.println("You have walked into the kitchen!" + "\n" + "There are cookies on the table" + "\n"
						+ "Do you:" + "\n");
				System.out.println("[1] Eat them");
				System.out.println("[2] Leave them be");
				int cookieNum = sc.nextInt();

				switch (cookieNum) {
				case 1:
					System.out.println("Blech! They were gluten free!");
					System.out.println("You have lost CHEER and HOLIDAY SPIRIT");
					santa.decrementCheer();
					santa.decrementHolidaySpirit();
					System.out.println("You're CHEER is now: " + santa.getCheer());
					System.out.println("Your HOLIDAY SPIRIT is now: " + santa.getHolidaySpirit());

				case 2:
					System.out.println("Cool as ice! Let's go deliver those presents");
				}
			}

		case 2:
			System.out.println("You have crawled into the kitchen!" + "\n" + "There are cookies on the table." + "\n"
					+ "Do you:" + "\n");
			System.out.println("[1] Eat them");
			System.out.println("[2] Leave them be and find the tree");
		}
	}

	public static void goMansion() {
		goToMansion = false;
		System.out.println("Welcome to the mansion! What a maze! Would you like to:");
		System.out.println("[1] Go left");
		System.out.println("[2] Go right");

		int mansionNum = sc.nextInt();

		switch (mansionNum) {
		case 1:
			System.out.println("Oh deer! You've hit a dead end!");
			System.out.println("[1] Go left");
			System.out.println("[2] Go right");
			int hallwayNum = sc.nextInt();

		case 2:
			System.out.println("Should you go down the hallway with a light or the one that's dark?");
			System.out.println("[1] Light hallway");
			System.out.println("[2] Dark hallway");
			hallwayNum = sc.nextInt();

			switch (hallwayNum) {
			case 1:
				System.out.println("You found the tree!");
				System.out.println("You see a plate of cookies, do you:");
				System.out.println("[1] Eat the cookies");
				System.out.println("[2] Leave them be and deliever the presents");
				int treeNum = sc.nextInt();

				switch (treeNum) {
				case 1:
					System.out.println("Yum Yum Yum! You increased your cheer!");
					santa.incrementCheer();
					System.out.println("Now your CHEER is: " + santa.getCheer());
					System.out.println("Let's deliver the presents and go outside!");
					goOutdoors();
					break;

				case 2:
					System.out.println("Let's deliever the presents and go outside!");
					goOutdoors();
					break;
				}

			case 2:
				System.out.println("You found a Tree Rex! The household dog eats Santas like you for dinner!");
				System.out.println("Do you:");
				System.out.println("[1] Hide?");
				System.out.println("[2] Run?");
				int treeNum2 = sc.nextInt();

				switch (treeNum2) {
				case 1:
					System.out.println("You've found the tree!");
					System.out.println("Let's deliever the presents and get to the next house!");
					goOutdoors();
					break;

				case 2:
					System.out.println("Oh no! All that rucus woke up the kids!");
					System.out.println("Sorry Santa, no time to deliever presents. "
							+ "You need to get out of the mansion before the kids see you.");
					santa.decrementCheer();
					santa.decrementHolidaySpirit();
					System.out.println("Now your CHEER is: " + santa.getCheer());
					System.out.println("Now your HOLIDAY SPIRIT is: " + santa.getHolidaySpirit());
					goOutdoors();
					break;
				}
			}
		}
	}

}
