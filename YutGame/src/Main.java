
public class Main {

	public static void main(String[] args) {

		Rule rule = new Rule();
		Game game = new Game();
		Player player = new Player();
		Mal mal = new Mal();
		MalBoard malBoard = new MalBoard();

//		<게임 규칙 설명>
		rule.yutGameRule();
		
//		<게임 시작>
		game.yutGameStart();
		
//		<플레이어 이름 설정>		
		player.playerNameSet();
		
//		<말 위치 설명>
		mal.malLocation();

//		<게임 조건 확인>
		rule.checkYutGameCondition();
		
//		<윷 던지기 (첫판) 및 결과>
		game.throwingYutFirst();
		
//		<말 위치 설명>		
		mal.malLocation();
		
//		<말 이동>
		malBoard.malMove();
		
//		<말 위치 설명>		
		mal.malLocation();		
			
//		<게임 조건 확인>
		rule.checkYutGameCondition();
		
//		<윷 던지기 및 결과>
		game.throwingYut();
		
//		<말 위치 설명>		
		mal.malLocation();		

//		<말 이동>
		malBoard.malMove();

//		<말 위치 설명>		
		mal.malLocation();	

//		<게임 조건 확인>
		rule.checkYutGameCondition();
	
//		<게임 반복>
//			조건 - 반복문으로 반복 진행~~~
		
	}

}
