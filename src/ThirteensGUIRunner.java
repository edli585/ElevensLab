
public class ThirteensGUIRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new ThirteensBoard();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}

}
