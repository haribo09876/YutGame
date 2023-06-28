
public class MalBoard {

	Mal mal = new Mal();
	
	int mal1Loc = 0;
	int mal2Loc = 0;
		
		void malBoardStatus(Player player) {
		System.out.println("현재 말의 위치 입니다");
		System.out.println();
		System.out.println("10		" + "		9		" + "		8		" + "		7		" + "		6		" + "		5");
		System.out.println();
		System.out.println("11										" + "										4");
		System.out.println();
		System.out.println("12										" + "										3");
		System.out.println();
		System.out.println("13										" + "										2");
		System.out.println();
		System.out.println("14										" + "										1");
		System.out.println();
		System.out.println("15		" + "		16		" + "		17		" + "		18		" + "		19		" + "		20");
		System.out.println();
		System.out.println("말1의 위치 : " + player.getMal1());
		System.out.println("말2의 위치 : "  + player.getMal2());
	}

}
