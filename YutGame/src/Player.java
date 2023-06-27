
public class Player {

	private String playerName = "";
	private int mal = 0;
	
	public Player() {
		super();
	}

	public Player(String playerName, int mal) {
		super();
		this.playerName = playerName;
		this.mal = mal;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getMal() {
		return mal;
	}

	public void setMal(int mal) {
		this.mal = mal;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", mal=" + mal + "]";
	}
	
}
