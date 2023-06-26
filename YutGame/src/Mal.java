
public class Mal {

	Player player1 = new Player();
	Player player2 = new Player();
	Game game = new Game();

//	<말 위치 설명>	
	void malLocation() {

		String[][] malArray = new String[8][26];


		int i = 0;
		int oneOne = player1.getMal1() + game.yutNum;
		int oneTwo = player1.getMal2();
		int oneThree = player1.getMal3();
		int oneFour = player1.getMal4();
		int twoOne = player2.getMal1();
		int twoTwo = player2.getMal2();
		int twoThree = player2.getMal3();
		int twoFour = player2.getMal4();
		
		malArray[0][oneOne] = "P1 말1";
		malArray[1][oneTwo] = "P1 말2";
		malArray[2][oneThree] = "P1 말3";
		malArray[3][oneFour] = "P1 말4";
		malArray[4][twoOne] = "P2 말1";
		malArray[5][twoTwo] = "P2 말2";
		malArray[6][twoThree] = "P2 말3";
		malArray[7][twoFour] = "P2 말4";
		
		for (int j = 0; j < 8; j++) {
			for (int k = 0; k < 25; k++) {
				System.out.print(malArray[j][k] + " ");
			}
			System.out.println();
		}
		
		
//		p2Mal3 = 
//		for (int i = 0; i < malArray.length; i++) {
//			for (int j = 0; j < malArray.length; j++) {
//				malArray[i][j];
//			}
//		}

		

//
//		int p1Mal1Loc = player1.getMal1() + game.yutNum;
//
//		System.out.println(p1Mal1Loc);

	}



}
