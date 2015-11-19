package draughts;

import java.util.Arrays;

public class Board {

	private Piece[] board;
	
	public Board() {
		this.board = new Piece[32];
		Arrays.fill(board, Color.NONE);
		for(int i = 0; i < 12; i++) {
			board[i] = new Piece(Color.WHITE);
			board[32-i-1] = new Piece(Color.RED);
		}
	}
	
	public Piece getPiece(int pos) {
		return board[pos];
	}
	
	public boolean isValidMove(int start, int end, Color color, boolean isKing) {
		if(Math.abs(start-end) < 3)
			return false;
		if(color == Color.RED && !isKing && start <= end || color == Color.WHITE && !isKing && start >= end)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		String res = "";
		for(Piece p: board) {
			String piece = "";
			switch(p.color) {
				case WHITE:
					piece = "w";
					break;
				case RED:
					piece = "r";
					break;
				default:
					piece = ".";
			}
			if(p.isKing())
				piece = piece.toUpperCase();
			res += piece;
		}
		return res;
	}
	
}
