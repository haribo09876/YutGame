
public class Main {

	public static void main(String[] args) {

		Player player = new Player();
		Rule rule = new Rule();
		Game game = new Game();
		Mal mal = new Mal();
		MalBoard malBoard = new MalBoard();

//		<게임 규칙 설명>
		rule.yutGameRule();

//		<플레이어 이름 설정>
		rule.playerNameSetting(player);

//		<게임(P1첫판) 및 결과>
		game.throwingYutFirstP1(player);
		
//		<말판 확인>
		malBoard.malBoardStatus(player);

//		<말 위치 확인>
		mal.malLocation(player);

//		<게임(P2첫판) 및 결과>
		game.throwingYutFirstP2(player);
		
//		<말판 확인>
		malBoard.malBoardStatus(player);
		
//		<말 위치 확인>
		mal.malLocation(player);

//		<게임 조건 확인 및 게임 반복>
		rule.checkYutGameCondition(player);
	}

}
