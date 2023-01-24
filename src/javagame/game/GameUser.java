package javagame.game;

public class GameUser {

	private int UserAD;
	private String Attack;
	private String UserName;
	private int UserExp;
	private int Level = 1;
	
	private int LevelUpExp = 100;
	
	public GameUser() {
		this.UserAD = 10;
	}

	public int getUserAD() {
		return UserAD;
	}

	public String getAttack() {
		return Attack;
	}

	public String getUserName() {
		return UserName;
	}
	
	public int getUserExp() {
		return UserExp;
	}
	
	public int getLevel() {
		return Level;
	}

	public void setUserAD(int userAD) {
		UserAD = userAD;
	}

	public void setAttack(String attack) {
		Attack = attack;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}
	

	public void setUserExp(int userExp) {
		this.UserExp = userExp;
	}
	
	public void setLevel(int level) {
		this.Level = level;
	}
	
	public void LevelUp() {
		while(UserExp >= LevelUpExp) {
			System.out.println("레벨이 올랐습니다.");
			Level++;
			UserExp -= LevelUpExp;
			LevelUpExp += 100;
			UserAD += 4;
		}
	}
	
	
	public void getInformation() {
		System.out.println("유저이름 : " + UserName + " 유저공격력 : " + UserAD + " 유저경험치 : " + UserExp + " 캐릭터레벨 : " + Level);
	}

	
	}

