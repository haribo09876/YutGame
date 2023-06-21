
public class Mal {

	static int malX1Location = 0;
	static int malX2Location = 0;
	static int malX3Location = 0;
	static int malX4Location = 0;
	static int malY1Location = 0;
	static int malY2Location = 0;
	static int malY3Location = 0;
	static int malY4Location = 0;
	
	
//	<말 위치 설명>	
	public static void malLocation() {
		String[][] malArr = new String[8][26];
			malArr[0][0] = "X1";
			malArr[1][0] = "X2";
			malArr[2][0] = "X3";
			malArr[3][0] = "X4";
			malArr[4][0] = "Y1";
			malArr[5][0] = "Y2";
			malArr[6][0] = "Y3";
			malArr[7][0] = "Y4";

// 스위치 케이스???
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 26; j++) {
					if(malArr[i][j] == "X1") {
						malX1Location = j;
					} else if(malArr[i][j] == "X2") {
						malX2Location = j;
					} else if(malArr[i][j] == "X3") {
						malX3Location = j;
					} else if(malArr[i][j] == "X4") {
						malX4Location = j;
					} else if(malArr[i][j] == "Y1") {
						malY1Location = j;
					} else if(malArr[i][j] == "Y2") {
						malY2Location = j;
					} else if(malArr[i][j] == "Y3") {
						malY3Location = j;
					} else if(malArr[i][j] == "Y4") {
						malY4Location = j;
					} 
				} 
			}

		System.out.println("현재 말의 위치는");
		System.out.println("10		" + "		9		" + "		8		" + "		7		" + "		6		" + "		5");
		System.out.println("11										" + "										4");
		System.out.println("12										" + "										3");
		System.out.println("13										" + "										2");
		System.out.println("14										" + "										1");
		System.out.println("15		" + "		16		" + "		17		" + "		18		" + "		19		" + "		20");
		System.out.println();
		System.out.println("X1 (" + malX1Location + ") / X2 (" + malX2Location + ") / X3 (" + malX3Location + ") / X4 (" + malX4Location + ")");
		System.out.println("Y1 (" + malY1Location + ") / Y2 (" + malY2Location + ") / Y3 (" + malY3Location + ") / Y4 (" + malY4Location + ")");
	}
}
