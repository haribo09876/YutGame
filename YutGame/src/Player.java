import java.util.Scanner;

public class Player {

//	<플레이어 이름 설정>
	public static void playerNameSet() {
		System.out.print("Player1의 이름을 입력해주세요");
		System.out.println();
		Scanner scnameP1 = new Scanner(System.in);
		String nameP1 = scnameP1.nextLine();

		System.out.print("Player2의 이름을 입력해주세요");
		System.out.println();
		Scanner scnameP2 = new Scanner(System.in);
		String nameP2 = scnameP2.nextLine();

		System.out.println(nameP1 + "님, " + nameP2 + "님 반갑습니다");
		System.out.println();
	}

}
