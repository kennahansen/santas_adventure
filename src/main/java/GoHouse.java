import java.util.Scanner;

public class GoHouse {
	
	public static Santa santa = new Santa();
	public static Reindeer reindeer = new Reindeer();
	
	public static void main(String[] args) {
		 System.out.println("The children were nestled all snug in their beds,"); 
		 System.out.println("While visions of sugar-plums danced in their heads.");
		 System.out.println("But then ! unexpectedly, you hear the sound of a child waking up !!!!!");
		 System.out.println("Do you: [1] Hide [2] Stuff stockings quickly! even though it's messy "
		 		+ "[3] speak with the child");
		 Scanner houseMainSc = new Scanner(System.in);
	     int houseMainInt = houseMainSc.nextInt();
	     houseMainSc.close();
	     switch (houseMainInt) {
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
	     	Scanner houseCookieSc = new Scanner(System.in);
		    int houseCookieInt = houseCookieSc.nextInt();
		    houseCookieSc.close();
		    switch (houseCookieInt) {
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
		    	System.out.println("end of function");
		    }
	     }
	}
}
