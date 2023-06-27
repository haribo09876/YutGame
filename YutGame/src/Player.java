
public class Player {

	String playerName = "";
	int mal1 = 0;
	int mal2 = 0;
	int mal3 = 0;
	int mal4 = 0;

	public Player() {
		super();
	}

	public Player(String playerName, int mal1, int mal2, int mal3, int mal4) {
		super();
		this.playerName = playerName;
		this.mal1 = mal1;
		this.mal2 = mal2;
		this.mal3 = mal3;
		this.mal4 = mal4;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getMal1() {
		return mal1;
	}

	public void setMal1(int mal1) {
		this.mal1 = mal1;
	}

	public int getMal2() {
		return mal2;
	}

	public void setMal2(int mal2) {
		this.mal2 = mal2;
	}

	public int getMal3() {
		return mal3;
	}

	public void setMal3(int mal3) {
		this.mal3 = mal3;
	}

	public int getMal4() {
		return mal4;
	}

	public void setMal4(int mal4) {
		this.mal4 = mal4;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", mal1=" + mal1 + ", mal2=" + mal2 + ", mal3=" + mal3 + ", mal4="
				+ mal4 + "]";
	}

}
