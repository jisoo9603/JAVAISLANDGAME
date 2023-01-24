package javagame.game;

import java.util.Scanner;

public class GameMain {
	
	
	/* 스타트 화면에서 넘어와서 메인메뉴가 노출 된다.
	 * 사냥터 입장 메뉴
	 * 게임종료 메뉴
	 * 게임유저상태보기 메뉴*/
	
	
	
//	스타트화면 > 메인화면
//	메인화면 노출 됨
//	메인화면 메뉴
	public GameMain() {}
	
	public void mainstart(GameUser user) {
		System.out.println("자바아일랜드에 오신것을 환영합니다.");
		System.out.println("===========================");
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 내캐릭터정보\n2. 사냥터이동\n3. 게임종료");
		System.out.print("메뉴를 선택해주세요 : ");
		int chmain = sc.nextInt();
		user.getUserName();
		
		switch(chmain) {
		case 1 : user.getInformation();
		break;
		case 2 : Deongeon godeongeon = new Deongeon();
				 godeongeon.battle(user);
		break;	
		case 3 : System.out.println("게임이 종료되었습니다.");	
		return;
		}
		
		}
		
	}
	
}
