
public class Main {

	public static void main(String[] args) {

		Rule rule = new Rule();
		Player player = new Player();
		Mal mal = new Mal();
		MalBoard malBoard = new MalBoard();
		Game game = new Game();
		
//		<게임 규칙 설명>
		rule.yutGameRule();

//		<게임 시작 결정>
		rule.yutGameStart();
//
//		<플레이어 이름 입력>		
		rule.playerNameSet();

//		<윷 던지기 (첫판) 및 결과>
		game.throwingYutFirst();
		
//		<말 위치 설명>		
//		mal.malLocation();
		
//		<말 이동>
//		malBoard.malMove();
		
//		<말 위치 설명>		
//		mal.malLocation();
		
//		<윷 던지기 (첫판) 및 결과>
		game.throwingYutFirst();
		
//		<말 위치 설명>		
//		mal.malLocation();
		
//		<말 이동>
//		malBoard.malMove();
		
//		<말 위치 설명>		
//		mal.malLocation();
		
		
//		--------------<게임 반복>		조건 - 반복문--------------------------------------
//		<게임 조건 확인>
		rule.checkYutGameCondition();

//		<말 위치 설명>		
//		mal.malLocation();
		
//		<말 이동>
//		mal.malMove();

//		<말 위치 설명>		
//		mal.malLocation();

//		<게임 조건 확인>
		rule.checkYutGameCondition();

//		<말 위치 설명>		
//		mal.malLocation();

//		<말 이동>
//		mal.malMove();

//		<말 위치 설명>		
//		mal.malLocation();

		


	}

}
