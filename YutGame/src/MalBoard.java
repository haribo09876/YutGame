
public class MalBoard {

	int mal1Loc = 0;
	int mal2Loc = 0;

//	<말판 확인>
	void malBoardStatus(Player player) {
		String[] mal1Array = new String[26];
		String[] mal2Array = new String[26];
		
		for (int i = 0; i < mal1Array.length; i++) {
			if(player.getMal1() == i)
			mal1Array[i] = player.getPlayer1Name();
		} for (int i = 0; i < mal2Array.length; i++) {
			if(player.getMal2() == i)
			mal2Array[i] = player.getPlayer2Name();
		}
		System.out.println("\t\t\t\t\t\t\t\t\t\t<말판>");
		System.out.println();
		System.out.print("10 (" + mal1Array[10] + " / " + mal2Array[10] + ")\t\t9 (" + mal1Array[9] + " / " + mal2Array[9]);
		System.out.print(")\t\t8 (" + mal1Array[8] + " / " + mal2Array[8] + ")\t\t7 (" + mal1Array[7] + " / " + mal2Array[7]);
		System.out.println(")\t\t6 (" + mal1Array[6] + " / " + mal2Array[6] + ")\t\t5 (" + mal1Array[5] + " / " + mal2Array[5] + ")");
		System.out.println();
		System.out.println("11 (" + mal1Array[11] + " / " + mal2Array[11] +  ")\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t4 (" + mal1Array[4] + " / " + mal2Array[4] + ")");
		System.out.println();
		System.out.println("12 (" + mal1Array[12] + " / " + mal2Array[12] +  ")\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t3 (" + mal1Array[3] + " / " + mal2Array[3] + ")");
		System.out.println();
		System.out.println("13 (" + mal1Array[13] + " / " + mal2Array[13] +  ")\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2 (" + mal1Array[2] + " / " + mal2Array[2] + ")");
		System.out.println();
		System.out.println("14 (" + mal1Array[14] + " / " + mal2Array[14] +  ")\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1 (" + mal1Array[1] + " / " + mal2Array[1] + ")");
		System.out.println();
		System.out.print("15 (" + mal1Array[15] + " / " + mal2Array[15] + ")\t\t16 (" + mal1Array[16] + " / " + mal2Array[16]);
		System.out.print(")\t\t17 (" + mal1Array[17] + " / " + mal2Array[17] + ")\t\t18 (" + mal1Array[18] + " / " + mal2Array[18]);
		System.out.println(")\t\t19 (" + mal1Array[19] + " / " + mal2Array[19] + ")\t\t20 (" + mal1Array[20] + " / " + mal2Array[20] + ")");
		System.out.println();
	}

}
