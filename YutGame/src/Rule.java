import java.util.Scanner;

public class Rule {
	
	Game game = new Game();
	
	String player1Name = "";
	String player2Name = "";

	Scanner sc = new Scanner(System.in);
	
//	<게임 규칙 설명>
	void yutGameRule() {
		System.out.println("\t윷놀이 게임의 규칙");
		System.out.println("- Player1과 Player2로 팀을 나눕니다.");
		System.out.println("- 2개씩 윷을 던져, 먼저 던질 선을 정합니다.");
		System.out.println("- 선이 먼저 4개의 윷을 던지고 그 이후 번갈아 가면서 한번씩 윷을 던집니다.");
		System.out.println("- 윷의 결과는 각각, '도'( 1칸 진행), '개'( 2칸 진행), '걸'( 3칸 진행), '윷'( 4칸 진행), '모'( 5칸 진행)");
		System.out.println("- '빽도'( 3개가 엎어졌지만 열린 1개가 색칠된 윷일때) 1칸 뒤로");
		System.out.println("- 윷, 모인 경우 윷을 한번 더 던질 수 있다.");
		System.out.println("- Player들은 각각 4개의 말을 가지고 있고, 모든 말이 먼저 도착하는 사람이 승리합니다.");
		System.out.println("※ 말은 각각 한 개씩, '상대 말을 잡는 경우'와 '대각선으로 진행하는 경우'는 구현하지 않습니다.");
		System.out.println();
	}

//	<게임 시작 결정>
	void yutGameStart() {
		System.out.println("게임을 시작하시려면 '시작'을 입력해주세요");
		String start = sc.nextLine();
		if (start.equals("시작")) {
			System.out.println("게임을 시작합니다");
		} else {
			System.out.println("게임을 종료합니다");
		}
		System.out.println();
	}
	
//	<플레이어 이름 설정>
	void playerNameSetting(Player player) {
		System.out.print("Player1의 이름 ? ");
		this.player1Name = sc.nextLine();
		player.setPlayer1Name(player1Name);		
		
		System.out.print("Player2의 이름 ? ");
		this.player2Name = sc.nextLine();
		player.setPlayer2Name(player2Name);		
	}

//	<게임 조건 확인>
	
	void checkYutGameCondition(Player player) {
		for (int i = 0; i < 100; i++) {
			if(player.getMal1() < 21 && player.getMal2() < 21) {
//				game.throwingYut(player1);
//				말1조정 or 조정된 값
				if(player.getMal1() > 21) {
					System.out.println("승자는 " + player.getPlayer1Name() + "님 입니다");
					i = 100;
				} else {
//				game.throwingYut(player2);
//				말2조정 or 조정된 값
					if(player.getMal2() > 21) {
						System.out.println("승자는 " + player.getPlayer2Name() + "님 입니다");
						i = 100;
					}
				}
			}
		} System.out.println("게임 종료");
	}
	
}
