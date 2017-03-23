/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call to
	 * each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;

	/**
	 * The number of values to shuffle.
	 */
	private static final int VALUE_COUNT = 4;

	/**
	 * Tests shuffling methods.
	 * 
	 * @param args
	 *            is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT + " consecutive perfect shuffles:");
		int[] values1 = new int[VALUE_COUNT];
		for (int i = 0; i < values1.length; i++) {
			values1[i] = i;
		}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT + " consecutive efficient selection shuffles:");
		int[] values2 = new int[VALUE_COUNT];
		for (int i = 0; i < values2.length; i++) {
			values2[i] = i;
		}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * Apply a "perfect shuffle" to the argument. The perfect shuffle algorithm
	 * splits the deck in half, then interleaves the cards in one half with the
	 * cards in the other.
	 * 
	 * @param values
	 *            is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[] card = values;
		int[] shuffled = new int[52];
		int k = 0;
		for (int j = 0; j <= (card.length + 1) / 2; j++) {
			shuffled[k] = card[j];
			k = k + 2;
		}
		k = 1;
		for (int j = ((card.length + 1) / 2) + 1; j <= (card.length - 1); j++) {
			shuffled[k] = card[j];
			k = k + 2;
		}
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument. The selection
	 * shuffle algorithm conceptually maintains two sequences of cards: the
	 * selected cards (initially empty) and the not-yet-selected cards
	 * (initially the entire deck). It repeatedly does the following until all
	 * cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards. An efficient version of this
	 * algorithm makes use of arrays to avoid searching for an as-yet-unselected
	 * card.
	 * 
	 * @param values
	 *            is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[] card = values;

		int[] shuffled = new int[52];
		//
		// for(int k = 0; k <= 51; k++)
		// {
		// int j = (int)(Math.random() * card.length);
		// shuffled[k] = card[j];
		// }

		// efficient selection shuffle BELOW//

		// for (int k = 51; k >= 1; k--)
		// {
		// int j = (int)(Math.random() * card.length);
		// int x = shuffled[k];
		// shuffled[k] = card[j];
		// card[j] = x;
		// }
		
		for (int k = 51; k >= 1; k--)
		{
			int r = 0;
			for (int c = 0; c > card.length - 1; c++)
			{
				r = Math.max(card[c], card[c + 1]);
			}
			int x = shuffled[k];
			shuffled[k] = card[r];
			card[r] = x;
		}

	}
}
