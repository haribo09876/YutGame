
public class Game {

	String player1NameGame = "";
	String player2NameGame = "";
	int yutNum = 0;
	int yutFirstNum = 0;
	int yutBonusNum = 0;
	int yutTotalNum = 0;
	String yutResult = "";
	String yutFirstResult = "";
	String yutBonusResult = "";

	// <윷 던지기 및 결과>
	void throwingYut(Player player) {
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
			yutNum = -1;
			yutResult = "백도";
			break;
		}
		if (yutNum == 4 || yutNum == 5) {
			System.out.println(yutResult + " 입니다");
			System.out.println("윷을 한번 더 던집니다");
			throwingYutBouns(player);
			yutTotalNum = yutNum + yutBonusNum;
		} else {
			System.out.println(yutResult + " 입니다");
			yutTotalNum = yutNum;
		}
		System.out.println();
	}

	// <윷 던지기 (첫판) 및 결과>
	void throwingYutFirst(Player player) {
		System.out.println(player.getPlayer1Name() + "님, 윷을 던졌습니다");
		yutFirstNum = (int) (Math.random() * 5 + 1);
		switch (yutFirstNum) {
		case 1:
			yutFirstResult = "도";
			break;
		case 2:
			yutFirstResult = "개";
			break;
		case 3:
			yutFirstResult = "걸";
			break;
		case 4:
			yutFirstResult = "윷";
			break;
		case 5:
			yutFirstResult = "모";
			break;
		}
		if (yutFirstNum == 4 || yutFirstNum == 5) {
			System.out.println(yutFirstResult + " 입니다");
			System.out.println("윷을 한번 더 던집니다");
			throwingYutBouns(player);
			yutTotalNum = yutFirstNum + yutBonusNum;
		} else {
			System.out.println(yutFirstResult + " 입니다");
			yutTotalNum = yutFirstNum;
		}
		System.out.println();
	}

	// <윷 던지기 및 결과>
	void throwingYutBouns(Player player) {
		System.out.println(player.getPlayer1Name() + "님, 윷을 던졌습니다");
		yutBonusNum = (int) (Math.random() * 6 + 1);
		switch (yutBonusNum) {
		case 1:
			yutBonusResult = "도";
			break;
		case 2:
			yutBonusResult = "개";
			break;
		case 3:
			yutBonusResult = "걸";
			break;
		case 4:
			yutBonusResult = "윷";
			break;
		case 5:
			yutBonusResult = "모";
		case 6:
			yutBonusNum = -1;
			yutBonusResult = "백도";
			break;
		}
		yutTotalNum = yutBonusNum;
		System.out.println(yutBonusResult + " 입니다");
		System.out.println();
	}

//	void check() {
//		System.out.println("결과 : " +  yutFirstNum);
//	}

}
