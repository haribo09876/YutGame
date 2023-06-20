import java.util.Scanner;

public class Game {

//		<게임 시작>
	public static void yutGameStart() {
		System.out.println();
		System.out.print("게임을 시작하시려면 '시작'을 입력해주세요");
		System.out.println();

		Scanner scStart = new Scanner(System.in);
		String start = scStart.nextLine();

		if(start.equals("시작")) {
			System.out.println("게임을 시작합니다");
		} else {
			System.out.println("게임을 종료합니다"); 
		}

	}
	
//	<윷 던지기 (첫판) 및 결과>
//	백도 없음 / 한번 더 / 확률 기능 구현 필요!!!
//	모	1 / 16		한번 더
//	윷	1 / 16		한번 더
//	걸	4 / 16
//	개	6 / 16
//	도	3 / 16
//	백도	1 / 16   제외!!!
	public static void throwingYutFirst() {
	System.out.println("님, 엔터를 눌러 윷을 던지세요");
//	(SCAN)
    int yootPlay = (int)(Math.random() * 5 + 1);
    String yootResult = "";
    switch (yootPlay) {
        case 1:  yootResult = "모";
                 break;
        case 2:  yootResult = "윷";
                 break;
        case 3:  yootResult = "걸";
                 break;
        case 4:  yootResult = "개";
                 break;
        case 5:  yootResult = "도";
                 break;
     }
    System.out.println(" 님, " + yootResult + " 입니다");
	}

	
//	<윷 던지기 및 결과>
//	백도 없음 / 한번 더 / 확률 기능 구현 필요!!!
//	한번 더 / 확률 기능 구현 필요!!!
//	모	1 / 16		한번 더
//	윷	1 / 16		한번 더
//	걸	4 / 16
//	개	6 / 16
//	도	3 / 16
//	백도	1 / 16
	public static void throwingYut() {
	System.out.println("님, 엔터를 눌러 윷을 던지세요");
//	(SCAN)
	int yootPlay = (int)(Math.random() * 6 + 1);
	String yootResult = "";
	switch (yootPlay) {
		case 1:  yootResult = "모";
				break;
		case 2:  yootResult = "윷";
               	break;
		case 3:  yootResult = "걸";
               	break;
		case 4:  yootResult = "개";
               	break;
		case 5:  yootResult = "도";
               	break;
		case 6:  yootResult = "(백)도";
               	break;
   }
  System.out.println(" 님, " + yootResult + " 입니다");
	}
	

	
	
}
