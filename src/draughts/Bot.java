package draughts;

public abstract class Bot {
	
	public final String name;
	protected final Game game;
	
	public Bot(String name, Game game) {
		this.name = name;
		this.game = game;
	}

	public abstract Action takeTurn();
	
}
