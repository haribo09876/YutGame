import java.util.Scanner;

public class Mal {

	Scanner sc = new Scanner(System.in);

	int mal1Loc = 0;
	int mal2Loc = 0;
	int malToMove = 0;
	int plusLocNum = 0;

	int[][] malArray = new int[2][26];

//	<말 위치>	
	void malLocation(Player player) {
		mal1Loc = player.getMal1();
		mal2Loc = player.getMal2();
		System.out.println("말1의 위치는 " + mal1Loc + "입니다");
		System.out.println("말2의 위치는 " + mal2Loc + "입니다");
		System.out.println();
	}

//	<말 이동>	
	void malMove(Player player) {
		plusLocNum = game.yutNum;
		System.out.println("말 '1'번과 '2'번 중 이동시킬 말을 입력해주세요");
		this.malToMove = sc.nextInt();
		System.out.println();
		if (malToMove == 1) {
			this.mal1Loc = mal1Loc + plusLocNum;
		} else if (malToMove == 2) {
			this.mal2Loc = mal2Loc + plusLocNum;
		}
		

	
	}

}
