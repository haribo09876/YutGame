
public class Mal {

	int mal1Loc = 0;
	int mal2Loc = 0;

//	<말 위치 확인>
	void malLocation(Player player) {
		this.mal1Loc = player.getMal1();
		this.mal2Loc = player.getMal2();
		System.out.println("현재 말1의 위치는 '" + mal1Loc + "' 입니다");
		System.out.println("현재 말2의 위치는 '" + mal2Loc + "' 입니다");
		System.out.println();
	}

}
