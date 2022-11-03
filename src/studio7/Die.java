package studio7;

public class Die {

	//initialize variable with die size
	
	private int size;
	
	/** Initialize with default die sides
	 * @param none
	 * @return void
	 **/ 
	public Die() {
		size = 1;
	}
	
	/**
	 * Initialize with parameters
	 * @param numSides = input from main
	 * @return void
	 */
	public Die(int numSides) {
		size = numSides;
	}
	
	//method that finds random value
	/**
	 * Random value from roll
	 * @param none
	 * @return random roll
	 */
	public int randomRoll() {
		int random = (int)(Math.random() * size + 1);
		return random;
	}
	
	/**
	 * Creates a string of calculated values
	 * @param none
	 * @returns string
	 */
	public String toString() {
		return "sides: " + size + "\nroll result: " + randomRoll();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die rollOne = new Die(20);
		Die rollTwo = new Die(5);
		Die rollThree = new Die(12);
		System.out.println(rollOne.toString());
		System.out.println(rollTwo.toString());
		System.out.println(rollThree.toString());

	}
}
