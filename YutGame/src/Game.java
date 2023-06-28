import java.util.Scanner;

public class Game {

	String player1NameGame = "";
	String player2NameGame = "";
	String yutResult = "";
	String pressEnter = "";
	int yutNum = 0;
	int tempNum = 0;
	
	Scanner sc = new Scanner(System.in);
	
	// <윷 던지기 (첫판) 및 결과>
	void throwingYutFirst(Player player) {
		System.out.println("엔터를 눌러 윷을 던져주세요");
		pressEnter = sc.nextLine();
		System.out.println(player.getPlayer1Name() + "님, 윷을 던졌습니다");
		yutNum = (int) (Math.random() * 5 + 1);
		switch (yutNum) {
		case 1:
			yutResult = "도";
			break;
		case 2:
			yutResult = "개";
			break;
		case 3:
			yutResult = "걸";
			break;
		case 4:
			yutResult = "윷";
			break;
		case 5:
			yutResult = "모";
			break;
		}
		int tempNum = player.getMal1() + yutNum;
		player.setMal1(tempNum);
		if (yutNum == 4 || yutNum == 5) {
			System.out.println(yutResult + " 입니다");
			System.out.println("윷을 한번 더 던집니다");
			throwingYut(player);
		} else {
			System.out.println(yutResult + " 입니다");
		}
		System.out.println();
	}
	
	// <윷 던지기 및 결과>
	void throwingYut(Player player) {
		System.out.println("엔터를 눌러 윷을 던져주세요");
		pressEnter = sc.nextLine();
		System.out.println(player.getPlayer1Name() + "님, 윷을 던졌습니다");
		yutNum = (int) (Math.random() * 6 + 1);
		switch (yutNum) {
		case 1:
			yutResult = "도";
			break;
		case 2:
			yutResult = "개";
			break;
		case 3:
			yutResult = "걸";
			break;
		case 4:
			yutResult = "윷";
			break;
		case 5:
			yutResult = "모";
		case 6:
			this.yutNum = -1;
			yutResult = "백도";
			break;
		}
		int tempNum = player.getMal1() + yutNum;
		player.setMal1(tempNum);
		if (yutNum == 4 || yutNum == 5) {
			System.out.println(yutResult + " 입니다");
			System.out.println("윷을 한번 더 던집니다");
			throwingYut(player);
		} else {
			System.out.println(yutResult + " 입니다");
		}
		System.out.println();
	}

}
