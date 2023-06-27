
public class Game {
	
	Rule rule = new Rule();
	
	String add1 = rule.player1NameRule;
	String add2 = rule.player2NameRule;
			
	void check() {
		System.out.println(add1);
		System.out.println(add2);
	}
	
//	// <윷 던지기 (첫판) 및 결과>
//	void throwingYutFirst() {
//		System.out.println(name1 + "님, 윷을 던졌습니다");
//		this.yutNum = (int) (Math.random() * 5 + 1);
//		switch (yutNum) {
//		case 1:
//			yutResult = "도";
//			break;
//		case 2:
//			yutResult = "개";
//			break;
//		case 3:
//			yutResult = "걸";
//			break;
//		case 4:
//			yutResult = "윷";
//			break;
//		case 5:
//			yutResult = "모";
//			break;
//		}
//		if (yutNum == 4 || yutNum == 5) {
//			System.out.println(yutResult + " 입니다");
//			System.out.println("윷을 한번 더 던집니다");
//			throwingYut();
//		} else {
//			System.out.println(yutResult + " 입니다");
//		}
//		System.out.println();
//	}
//	
//
//	
//
//	// <윷 던지기 및 결과>
//	void throwingYut() {
//		System.out.println(name1 + "님, 윷을 던졌습니다");
//		this.yutNum = (int) (Math.random() * 6 + 1);
//
//		switch (yutNum) {
//		case 1:
//			yutResult = "도";
//			break;
//		case 2:
//			yutResult = "개";
//			break;
//		case 3:
//			yutResult = "걸";
//			break;
//		case 4:
//			yutResult = "윷";
//			break;
//		case 5:
//			yutResult = "모";
//		case 6:
//			yutNum = -1;
//			yutResult = "백도";
//			break;
//		}
//		if (yutNum == 4 || yutNum == 5) {
//			System.out.println(yutResult + " 입니다");
//			System.out.println("윷을 한번 더 던집니다");
//			throwingYut();
//		} else {
//			System.out.println(yutResult + " 입니다");
//		}
//	System.out.println();	
//	}

}
