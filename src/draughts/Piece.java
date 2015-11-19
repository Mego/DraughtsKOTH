package draughts;

public class Piece {

	public final Color color;
	private boolean isKing;
	
	public Piece(Color color) {
		this.color = color;
		this.isKing = false;
	}
	
	public boolean isKing() {
		return this.isKing;
	}
	
	public void makeKing() {
		this.isKing = true;
	}
	
}
