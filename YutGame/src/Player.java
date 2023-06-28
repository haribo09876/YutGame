
public class Player {

	private String player1Name = "";
	private String player2Name = "";
	private int mal1 = 0;
	private int mal2 = 0;

	public Player() {
		super();
	}

	public Player(String player1Name, String player2Name, int mal1, int mal2) {
		super();
		this.player1Name = player1Name;
		this.player2Name = player2Name;
		this.mal1 = mal1;
		this.mal2 = mal2;
	}

	public String getPlayer1Name() {
		return player1Name;
	}

	public void setPlayer1Name(String player1Name) {
		this.player1Name = player1Name;
	}

	public String getPlayer2Name() {
		return player2Name;
	}

	public void setPlayer2Name(String player2Name) {
		this.player2Name = player2Name;
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

}
