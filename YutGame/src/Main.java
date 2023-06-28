
public class Main {

	public static void main(String[] args) {

		Rule rule = new Rule();
		Player player = new Player();
		Mal mal = new Mal();
		MalBoard malBoard = new MalBoard();
		Game game = new Game();

//		<게임 규칙 설명>
		rule.yutGameRule();

//		<플레이어 이름 설정>		
		rule.playerNameSetting(player);

//		<윷 던지기 (첫판) 및 결과>
		game.throwingYutFirst(player);
		
//		<말 위치 화면>
		malBoard.malBoardStatus(player);

//		<말 이동>
//		mal.malMove(player, game);
		
//		<말 위치 설명>		
		mal.malLocation(player);

//		<윷 던지기 (첫판) 및 결과>
		game.throwingYutFirst(player);
		
//		<말 위치 화면>
		malBoard.malBoardStatus(player);

//		<말 이동>
//		mal.malMove(player, game);
		
//		<말 위치 설명>		
		mal.malLocation(player);

////		--------------<게임 반복>		조건 - 반복문--------------------------------------
////		<게임 조건 확인>
		rule.checkYutGameCondition(player);

//		<말 위치 화면>
		malBoard.malBoardStatus(player);

//		<말 이동>
//		mal.malMove(player, game);
		
//		<말 위치 설명>		
		mal.malLocation(player);

////		<말 이동>
//		mal.malMove(player, game);
//
////		<말 위치 설명>		
//		mal.malLocation(player);
//
////		<게임 조건 확인>
//		rule.checkYutGameCondition(player);
//
////		<말 위치 설명>		
//		mal.malLocation(player);
//
////		<말 이동>
//		mal.malMove(player, game);
//
////		<말 위치 설명>		
//		mal.malLocation(player);

	}

}
