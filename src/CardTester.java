
public class CardTester {
	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		Card test = new Card("eight", "hearts", 8);
		
		Card test2 = new Card("eight", "hearts", 8);
		
		Card test3 = new Card("king", "clovers", 13);
		
		System.out.println(test.toString());
		
		System.out.println(test.matches(test2));
		
		System.out.println(test.matches(test3));
		
		
		
	}
}
