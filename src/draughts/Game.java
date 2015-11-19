package draughts;

import java.util.Random;

public class Game {
	
	private final Bot white, red;
	private static Random rand = new Random();
	private final Board board;
	
	private Game(Bot white, Bot red) {
		this.white = white;
		this.red = red;
		this.board = new Board();
	}
	
	public Color getColor(Bot b) {
		if(b == white)
			return Color.WHITE;
		if(b == red)
			return Color.RED;
		return Color.NONE;
	}
	
	private Bot doGame() {
		int turnsSinceLastCapture = 0;
		Bot winner = null;
		boolean whiteTurn = true;
		
		return winner;
	}

}
