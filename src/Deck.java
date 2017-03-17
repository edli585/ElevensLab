import java.util.ArrayList;
public class Deck 
{
	private int[] values;
	private String[] suits;
	private String[] ranks;
	
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	private Card[] used = {};
	
	public Deck(String[] rank, String[] suit, int[] val)
	{
		for(int i = 0; i < suit.length; i++)
		{
			for(int j = 0; j < val.length; j++)
			{
				deck.add(new Card(rank[j], suit[i], val[j]));
			}
		}
		values = val;
		suits = suit;
		ranks = rank;
	}
	
	public boolean isEmpty()
	{
		if(suits.length <= 0)
		{
			return true;
		}
		return false;
	}
	
	public int size()
	{
		return suits.length * values.length;
	}
	
	public Card deal()
	{
		int num = (int)(Math.random() * 52);
		used.add()
		
	}
}
