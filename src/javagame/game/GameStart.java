package javagame.game;

import java.util.Scanner;

public class GameStart {
	
	public static void main(String[] args) {
		
		GameUser user = new GameUser();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===========JAVAISLAND===========");
		System.out.println();
		System.out.print("사용자명을 입력해주세요 : ");
		String username = sc.nextLine();
		user.setUserName(username);
		GameMain gomain = new GameMain();
		gomain.mainstart(user);
		
		
	}
	
}

	
	

