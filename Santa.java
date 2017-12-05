/**
 * Santa object.
 */
public class Santa {
	
	/**
	 * increment value.
	 */
	private static int INCREMENT = 10;
	
	/**
	 * decrement value.
	 */
	private static int DECREMENT = 10;
	
	/**
	 * default value for instance variables.
	 */
	private static int DEFAULT_VALUE = 100;
	
	/**
	 * measure of happiness.
	 */
	private int cheer;
	
	/**
	 * measure of health.
	 */
	private int warmth;
	
	/**
	 * measure of success of santa's actions
	 */
	private int holidaySpirit;
	
	/**
	 * name of santa.
	 */
	private String name;
	
	/**
	 * default constructor.
	 */
	public Santa() {
		this.cheer = DEFAULT_VALUE;
		this.warmth = DEFAULT_VALUE;
		this.holidaySpirit = DEFAULT_VALUE;
	}
	
	/**
	 * constructor for Santa.
	 * @param newName String
	 */
	public Santa(final String newName) {
		this.cheer = DEFAULT_VALUE;
		this.warmth = DEFAULT_VALUE;
		this.holidaySpirit = DEFAULT_VALUE;
		this.name = newName;
	}
	
	/**
	 * laughs heartily.
	 */
	public static void laughHeartily() {
		System.out.println("\"HO! HO! HO!\"");
	}
	
	/**
	 * prints cheer, warmth and holiday spirit to command line for user to monitor.
	 */
	public void printStats() {
		System.out.print("Santa\'s cheer value is: " + this.cheer + "!");
		System.out.println("Santa\'s warmth value is: " + this.warmth + "!");
		System.out.println("Santa\'s holiday spirit value is: " + this.holidaySpirit + "!");
		laughHeartily();
	}
	
	/**
	 * getter for cheer.
	 * @return int cheer
	 */
	public int getCheer() {
		return this.cheer;
	}
	
	/**
	 * setter for cheer.
	 * @param newCheer int
	 */
	public void setCheer(int newCheer) {
		this.cheer = newCheer;
		if (this.cheer < 0) {
			this.cheer = 0;
		}
	}
	
	/**
	 * increments cheer.
	 */
	public void incrementCheer() {
		this.setCheer(this.getCheer() + INCREMENT);
	}
	
	/**
	 * decrements cheer.
	 */
	public void decrementCheer() {
		this.setCheer(this.getCheer() - DECREMENT);
	}
	
	/**
	 * getter for warmth.
	 * @return int warmth
	 */
	public int getWarmth() {
		return this.warmth;
	}
	
	/**
	 * setter for warmth.
	 * @param newWarmth int
	 */
	public void setWarmth(int newWarmth) {
		this.cheer = newWarmth;
		if (this.warmth < 0) {
			this.warmth = 0;
		}
	}
	
	/**
	 * increments warmth.
	 */
	public void incrementWarmth() {
		this.setWarmth(this.getWarmth() + INCREMENT);
	}
	
	/**
	 * decrements warmth.
	 */
	public void decrementWarmth() {
		this.setWarmth(this.getWarmth() - DECREMENT);
	}
	
	/**
	 * getter for holidaySpirit.
	 * @return int holidaySpirit
	 */
	public int getHolidaySpirit() {
		return this.holidaySpirit;
	}
	
	/**
	 * setter for holidaySpirit.
	 * @param newHolidaySpirit int
	 */
	public void setHolidaySpirit(int newHolidaySpirit) {
		this.holidaySpirit = newHolidaySpirit;
		if (this.holidaySpirit < 0) {
			this.holidaySpirit = 0;
		}
	}
	
	/**
	 * increments holidaySpirit.
	 */
	public void incrementHolidaySpirit() {
		this.setHolidaySpirit(this.getHolidaySpirit() + INCREMENT);
	}
	
	/**
	 * decrements holidaySpirit.
	 */
	public void decrementHolidaySpirit() {
		this.setHolidaySpirit(this.getHolidaySpirit() - DECREMENT);
	}
	
	/**
	 * getter for name.
	 * @return String name
	 */
	public String getName() {
		return this.name;
	}
}
