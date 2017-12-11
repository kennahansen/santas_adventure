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
		System.out.println("\n" + "You are outside, would you like to [1] Visit the mansion "
				+ "[2] Visit the apartment [3] Visit the house  or [4] Do a trick?");

		while (!sc.hasNextInt()) {
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

		while (!sc.hasNextInt()) {
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
		goToHouse = false;
		
        System.out.println("The children were nestled all snug in their beds,");
        System.out.println("While visions of sugar-plums danced in their heads.");
        System.out.println("But then ! unexpectedly, you hear the sound of a child waking up !!!!!");
        System.out.println("Do you: [1] Hide [2] Stuff stockings quickly! even though it's messy "
                           + "[3] speak with the child");
        int houseOneNum = sc.nextInt();
        switch (houseOneNum) {
            case 1: System.out.println("\"You are santa and hiding!! this is pathetic\"");
                santa.decrementHolidaySpirit();
            case 2: System.out.println("\"Wow you really shouldn't have done that so messily!"
                                       + "I though Santa was supposed to be detail oriented...\"");
                santa.decrementHolidaySpirit();
            case 3: System.out.println("You say to the child: \" You can hear on the roof" +
                                       "The prancing and pawing of each little hoof.");
                System.out.println("I'll speak not a word, but go straight to my work,\n" +
                                   "And fill all these stockings, and turn with a jerk.\n" +
                                   "And laying my finger aside of my nose,\n" +
                                   "And giving a nod, up the chimney I gooooooooooooo\"");
                santa.incrementHolidaySpirit();
            default:
                System.out.println("Mamma in her ‘kerchief, and Pappa in his cap,\n" +
                                   "Had just settled their brains for a long winter’s nap.");
                System.out.println("but luckily, they left some cookies and carrots for you and your reindeers!!!");
                System.out.println("Would you like to [1] take the cookies [2] leave the cookies");
                int houseTwoNum = sc.nextInt();
                switch (houseTwoNum) {
                    case 1: System.out.println("yummmmmmmm good choice !!!");
                        santa.incrementHolidaySpirit();
                        santa.incrementWarmth();
                        santa.incrementCheer();
                        reindeer.incrementHealth();
                    case 2: System.out.println("whyyyyyyyyyyyy");
                        santa.decrementHolidaySpirit();
                        santa.decrementWarmth();
                        santa.decrementCheer();
                        reindeer.decrementHealth();
                    default:
                }
                System.out.println("You're CHEER is now: " + santa.getCheer());
                System.out.println("Your HOLIDAY SPIRIT is now: " + santa.getHolidaySpirit());
        }
	}

	/**
	 * This is the apartment method. Returns nothing but happiness and joy
	 */

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
				System.out.println("You're in a bathroom!");
				System.out.println("Do you: ");
				System.out.println("[1] Use the facilities");
				System.out.println("[2] Find the tree");
				int bathroom = sc.nextInt();
				switch (bathroom) {
				case 1:
					System.out.println("Congradulations! You increased your cheer!");
					santa.incrementCheer();
					System.out.println("Now your CHEER is " + santa.getCheer());
					System.out.println("Now let's look for the tree" + "\n" + "Do you: ");
					System.out.println("[1] Go to the left");
					System.out.println("[2] Go to the right");
					int next = sc.nextInt();
					
					switch (next) {
					case 1: 
						System.out.println("Congradulations! You found the tree!");
						System.out.println("Let's deliver the presents and go to the next house!");
						goOutdoors();
					case 2:
						System.out.println("Congradulations! You found the tree!");
						System.out.println("Let's deliver the presents and go to the next house!");
						goOutdoors();
					}
					
				case 2:
					System.out.println("Congradulations! You found the tree!");
					System.out.println("Let's deliver the presents and go to the next house!");
					goOutdoors();
				}
			
			case 2:
				System.out.println("You walked into the kitchen!");
				System.out.println("There are cookies on the table." + "\n" + "Do you: ");
				System.out.println("[1] Eat them");
				System.out.println("[2] Leave them be");
				int kitchen = sc.nextInt();
				
				switch (kitchen) {
				case 1:
					System.out.println("Blech! They were gluten free cookies!");
					santa.decrementCheer();
					santa.decrementHolidaySpirit();
					System.out.println("You lost CHEER and HOLIDAY SPIRIT." + "\n" + "Now your CHEER is: " + 
					santa.getCheer() + "\n" + "Now your HOLIDAY SPIRIT is: " + santa.getHolidaySpirit());
					System.out.println("Let's deliver the presents and leave this house.");
					goOutdoors();
					
				case 2:
					System.out.println("Congradulations! You found the tree!");
					System.out.println("Let's deliver the presents and go to the next house!");
					goOutdoors();
				}
			}
		
		case 2: 
			System.out.println("You walked into the kitchen!");
			System.out.println("There are cookies on the table." + "\n" + "Do you: ");
			System.out.println("[1] Eat them");
			System.out.println("[2] Leave them be");
			int kitchen = sc.nextInt();
			
			switch (kitchen) {
			case 1:
				System.out.println("Blech! They were gluten free cookies!");
				santa.decrementCheer();
				santa.decrementHolidaySpirit();
				System.out.println("You lost CHEER and HOLIDAY SPIRIT." + "\n" + "Now your CHEER is: " + 
				santa.getCheer() + "\n" + "Now your HOLIDAY SPIRIT is: " + santa.getHolidaySpirit());
				System.out.println("Let's deliver the presents and leave this house.");
				goOutdoors();
				
			case 2:
				System.out.println("Congradulations! You found the tree!");
				System.out.println("Let's deliver the presents and go to the next house!");
				goOutdoors();
			}
		}
	}
			
	

	/**
	 * This is the mansion method returns nothing, but lovely words.
	 */
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

