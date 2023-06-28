import java.util.Scanner;

public class Game {

	String player1NameGame = "";
	String player2NameGame = "";
	String yutResult = "";
	String pressEnter = "";
	int yutNum = 0;
	int tempNum = 0;
	int yutArrayIndex = 0;
	int[] yutArray = { -1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 5 };

	Scanner sc = new Scanner(System.in);

//	<게임(P1첫판) 및 결과>
	void throwingYutFirstP1(Player player) {
		System.out.println("'" + player.getPlayer1Name() + "' 님, 엔터를 눌러 윷을 던져주세요");
		pressEnter = sc.nextLine();
		System.out.println("'" + player.getPlayer1Name() + "' 님, 윷을 던졌습니다");
		yutArrayIndex = (int) (Math.random() * 15 + 1);
		yutNum = yutArray[yutArrayIndex];
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
			System.out.println("'" + yutResult + "' 입니다");
			System.out.println("윷을 한번 더 던집니다");
			throwingYutP1(player);
		} else {
			System.out.println("'" + yutResult + "' 입니다");
		}
		System.out.println();
	}

//	<게임(P2첫판) 및 결과>
	void throwingYutFirstP2(Player player) {
		System.out.println("'" + player.getPlayer2Name() + "' 님, 엔터를 눌러 윷을 던져주세요");
		pressEnter = sc.nextLine();
		System.out.println("'" + player.getPlayer2Name() + "' 님, 윷을 던졌습니다");
		yutArrayIndex = (int) (Math.random() * 15 + 1);
		yutNum = yutArray[yutArrayIndex];
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
		int tempNum = player.getMal2() + yutNum;
		player.setMal2(tempNum);
		if (yutNum == 4 || yutNum == 5) {
			System.out.println("'" + yutResult + "' 입니다");
			System.out.println("윷을 한번 더 던집니다");
			throwingYutP2(player);
		} else {
			System.out.println("'" + yutResult + "' 입니다");
		}
		System.out.println();
	}

//	<게임(P1) 및 결과>
	void throwingYutP1(Player player) {
		System.out.println("'" + player.getPlayer1Name() + "' 님, 엔터를 눌러 윷을 던져주세요");
		pressEnter = sc.nextLine();
		System.out.println("'" + player.getPlayer1Name() + "' 님, 윷을 던졌습니다");
		yutArrayIndex = (int) (Math.random() * 16);
		yutNum = yutArray[yutArrayIndex];
		switch (yutNum) {
		case -1:
			yutResult = "백도";
			break;
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
			System.out.println("'" + yutResult + "' 입니다");
			System.out.println("윷을 한번 더 던집니다");
			throwingYutP1(player);
		} else {
			System.out.println("'" + yutResult + "' 입니다");
		}
		System.out.println();
	}

//	<게임(P2) 및 결과>
	void throwingYutP2(Player player) {
		System.out.println("'" + player.getPlayer2Name() + "' 님, 엔터를 눌러 윷을 던져주세요");
		pressEnter = sc.nextLine();
		System.out.println("'" + player.getPlayer2Name() + "' 님, 윷을 던졌습니다");
		yutArrayIndex = (int) (Math.random() * 16);
		yutNum = yutArray[yutArrayIndex];
		switch (yutNum) {
		case -1:
			yutResult = "백도";
			break;
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
		int tempNum = player.getMal2() + yutNum;
		player.setMal2(tempNum);
		if (yutNum == 4 || yutNum == 5) {
			System.out.println("'" + yutResult + "' 입니다");
			System.out.println("윷을 한번 더 던집니다");
			throwingYutP2(player);
		} else {
			System.out.println("'" + yutResult + "' 입니다");
		}
		System.out.println();
	}

}
