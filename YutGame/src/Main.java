import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("윷놀이 게임입니다.");
		System.out.println("<윷놀이 게임의 규칙>");
		System.out.println("- Player1과 Player2로 팀을 나눕니다.");
		System.out.println("- 2개씩 윷을 던져, 먼저 던질 선을 정합니다.");
		System.out.println("- 선이 먼저 4개의 윷을 던지고 그 이후 번갈아 가면서 한번씩 윷을 던집니다.");
		System.out.println("- 윷의 결과는 각각, '도'( 1칸 진행), '개'( 2칸 진행), '걸'( 3칸 진행), '윷'( 4칸 진행), '모'( 5칸 진행)");
		System.out.println("- '빽도'( 3개가 엎어졌지만 열린 1개가 색칠된 윷일때) 1칸 뒤로");
		System.out.println("- 윷, 모인 경우 윷을 한번 더 던질 수 있다.");
		System.out.println("- Player들은 각각 4개의 말을 가지고 있고, 먼저 4개의 말이 모두 골인하게 되면 이기게 됩니다.");
		System.out.println("※ 상대 말을 죽이는 경우와 대각선으로 진행하는 경우는 구현하지 않습니다.");
	
		
//		(SYSO) “게임을 시작하시려면 엔터를 치세요”
		System.out.println();
		System.out.print("게임을 시작하시려면 엔터를 치세요");
//		(SCAN)
		Scanner sc = new Scanner(System.in);
		int gameStart = sc.nextInt();
//				if(gameStart == "")
//					method
//					);		
//		

//		
//		(SCAN) 플레이어 이름 입력
//		(SYSO)“Player1 or Player2의 이름을 입력후 Enter를 쳐주세요”
//		
//		(메서드) 게임 조건 확인
//		
//		(메서드) 말 위치 알려줌
//		(SYSO) “X1~X4, Y1~Y4 위치”
//		
//		(SYSO) “OO님, 엔터를 눌러 윷을 던지세요
//		(SCAN)
//		
//		(메서드) 윷 던지기
//		
//		(메서드) 윷 결과
//		(SYSO) “OO님, (도개걸윷모백도  中 1) 입니다”
//		
//		(SYSO) “어떤 말을 이동하시겠습니까?”
//		(SCAN) (X1~X4, Y1~Y4 中 1)
//				
//		(메서드) 말 위치 알려줌
//		(SYSO) “X1~X4, Y1~Y4 위치”
//		
//		(array) 말 위치
//		malLocation[8][25]
				
		
		
		
	}

}
