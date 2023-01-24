package javagame.game;

import java.util.Scanner;

public class Deongeon {

	boolean Gomain;
	
	Monster[] monster = {
		new Monster("토끼", 200, 30),
		new Monster("호랑이", 500, 100),
		new Monster("곰", 1000, 300)
	};
	
	public Deongeon() {}
	
	public void battle(GameUser user) {
		System.out.println("던전에 입장했습니다.");
		System.out.println("===================");
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 토끼 사냥\n2. 호랑이 사냥\n3. 곰사냥\n4. 메인메뉴로 이동");
			System.out.print("사냥하실 몬스터를 선택하세요 : ");
			int sm = sc.nextInt();
			
			switch(sm) {
			case 1 : System.out.println("토끼를 사냥합니다.");
			break;
			case 2 : System.out.println("호랑이를 사냥합니다." );
			break;
			case 3 : System.out.println("곰을 사냥합니다.");
			break;
			case 4 : System.out.println("메인메뉴로 이동");
			Gomain = true;
			} 
			
			if(Gomain) {
				break;
			}
			
			int monsterhp = monster[sm - 1].getMonsterHp();
			for(int i = monster[sm - 1].getMonsterHp(); i > 0; i -= user.getUserAD()) {
				System.out.println(monster[sm - 1].getMonsterName() + "을 공격했습니다.");
				monsterhp -= user.getUserAD();
				if(monsterhp <= 0)
					break;
				System.out.println("남은체력" + monsterhp);
			}
			
			System.out.println(monster[sm - 1].getMonsterName() + "를 잡았습니다. 경험치를" + monster[sm - 1].getMonsterExp() + " 만큼 획득했습니다.");
			user.setUserExp(user.getUserExp() + monster[sm - 1].getMonsterExp());
			user.LevelUp();
		}
		
		
		
	}
	
}
