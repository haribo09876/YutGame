import java.util.Scanner;

public class Rule {

	Game game = new Game();
	Mal mal = new Mal();
	MalBoard malBoard = new MalBoard();

	String player1Name = "";
	String player2Name = "";

	Scanner sc = new Scanner(System.in);

//	<게임 규칙 설명>
	void yutGameRule() {
		System.out.println("\t<윷놀이 게임의 규칙>");
		System.out.println("- Player1과 Player2로 팀을 나눈다.");
		System.out.println("- Player1과 Player2이 번갈아 가면서 각각 4개의 윷을 던진다.");
		System.out.println("- 도(1칸), 개(2칸), 걸(3칸), 윷(4칸), 모(5칸), 백도(-1칸) 이동한다.");
		System.out.println("- 윷, 모인 경우 윷을 한번 더 던질 수 있다.");
		System.out.println("- Player들은 각각 한 개의 말을 가지고 있고, 말이 먼저 골인하는 Player가 이긴다.");
		System.out.println("※ 말은 각각 한 개씩, '상대 말을 잡는 경우'와 '대각선으로 진행하는 경우'는 구현하지 않습니다.");
		System.out.println();
	}

//	<플레이어 이름 설정>
	void playerNameSetting(Player player) {
		System.out.println("Player1의 이름을 입력해주세요");
		this.player1Name = sc.nextLine();
		player.setPlayer1Name(player1Name);

		System.out.println("Player2의 이름을 입력해주세요");
		this.player2Name = sc.nextLine();
		player.setPlayer2Name(player2Name);
		System.out.println();
	}

//	<게임 조건 확인 및 게임 반복>
	void checkYutGameCondition(Player player) {
		for (int i = 0; i < 100; i++) {
			if (player.getMal1() < 21 && player.getMal2() < 21) {
				game.throwingYutP1(player);
				malBoard.malBoardStatus(player);
				mal.malLocation(player);
				if (player.getMal1() >= 21) {
					System.out.println("승자는 '" + player.getPlayer1Name() + "' 님 입니다");
					break;
				} else {
					game.throwingYutP2(player);
					malBoard.malBoardStatus(player);
					mal.malLocation(player);
					if (player.getMal2() >= 21) {
						System.out.println("승자는 '" + player.getPlayer2Name() + "' 님 입니다");
						break;
					}
				}
			}
		}
		System.out.println("게임 종료");
	}

}
