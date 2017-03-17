/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		String[] rank = {"Ace", "2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] suit = {"Diamonds","Clovers","Hearts","Spades"};
		int[] value = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck standard = new Deck(rank,suit,value);
		
		System.out.println(standard.isEmpty());
		
		System.out.println(standard.size());
		
		System.out.println(standard.deal());
		
		String[] rank2 = {"Ace", "2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] suit2 = {"Diamonds","Clovers","Hearts","Spades"};
		int[] value2 = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck standard2 = new Deck(rank2,suit2,value2);
		
		System.out.println(standard2.isEmpty());
		
		System.out.println(standard2.size());
		
		System.out.println(standard2.deal());
		
		String[] rank3 = {"Ace", "2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] suit3 = {"Diamonds","Clovers","Hearts","Spades"};
		int[] value3 = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck standard3 = new Deck(rank3,suit3,value3);
		
		System.out.println(standard3.isEmpty());
		
		System.out.println(standard3.size());
		
		System.out.println(standard3.deal());
	}
}
