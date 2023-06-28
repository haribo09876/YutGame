
public class MalBoard {

	int mal1Loc = 0;
	int mal2Loc = 0;
		
		void malBoardStatus(Player player) {

		String[] malArray = new String[26];

		for (int i = 0; i < malArray.length; i++) {
			if(player.getMal1() == i)
			malArray[i] = player.getPlayer1Name();
		}
		
		System.out.println("\t\t\t\t\t\t\t<말판>");
		System.out.println();
		System.out.println("10 " + malArray[10] +"\t\t9 " +malArray[9] + "\t\t8 " + malArray[8] + "\t\t7 " + malArray[7] + "\t\t6 " + malArray[6]+ "\t\t5 " + malArray[5]);
		System.out.println();
		System.out.println("11 " + malArray[11] +  "\t\t\t\t\t\t\t\t\t\t\t\t\t\t4 " + malArray[4]);
		System.out.println();
		System.out.println("12 " + malArray[12] + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t3 " + malArray[3]);
		System.out.println();
		System.out.println("13 " + malArray[13] + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t2 " + malArray[2]);
		System.out.println();
		System.out.println("14 " + malArray[14] + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t1 " + malArray[1]);
		System.out.println();
		System.out.println("15 " + malArray[15] +"\t\t16 " +malArray[16] + "\t\t17 " + malArray[17] + "\t\t18 " + malArray[18] + "\t\t19 " + malArray[19]+ "\t\t20 " + malArray[20]);
		System.out.println();

	}

}
