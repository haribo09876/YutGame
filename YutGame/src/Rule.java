
public class Rule {

//	<게임 규칙 설명>
	public static void yutGameRule() {
		System.out.println("윷놀이 게임입니다.");
		System.out.println();
		System.out.println("<윷놀이 게임의 규칙>");
		System.out.println("- Player1과 Player2로 팀을 나눕니다.");
		System.out.println("- 2개씩 윷을 던져, 먼저 던질 선을 정합니다.");
		System.out.println("- 선이 먼저 4개의 윷을 던지고 그 이후 번갈아 가면서 한번씩 윷을 던집니다.");
		System.out.println("- 윷의 결과는 각각, '도'( 1칸 진행), '개'( 2칸 진행), '걸'( 3칸 진행), '윷'( 4칸 진행), '모'( 5칸 진행)");
		System.out.println("- '빽도'( 3개가 엎어졌지만 열린 1개가 색칠된 윷일때) 1칸 뒤로");
		System.out.println("- 윷, 모인 경우 윷을 한번 더 던질 수 있다.");
		System.out.println("- Player들은 각각 4개의 말을 가지고 있고, 모든 말이 먼저 도착하는 사람이 승리합니다.");
		System.out.println("※ 상대 말을 죽이는 경우와 대각선으로 진행하는 경우는 구현하지 않습니다.");
	}
	
	
//	<게임 조건 확인>
	public static void checkYutGameCondition() {
//		if() {
//			
//		} else {
//			System.out.println("게임을 종료합니다"); 
//		}
	}
	
	
}
