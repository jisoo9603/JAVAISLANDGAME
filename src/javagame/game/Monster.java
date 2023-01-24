package javagame.game;

public class Monster {
	
	private int MonsterExp;
	private int MonsterHp;
	private String MonsterName;
	private boolean MonsterLive = true;
	
	public Monster() {}
	
	public Monster(String MonsterName, int MonsterHp, int MonsterExp) {
		this.MonsterName = MonsterName;
		this.MonsterExp = MonsterExp;
		this.MonsterHp = MonsterHp;
	}
		
	public void MonsterDie() {
		MonsterLive = false;
	}

	public int getMonsterExp() {
		return MonsterExp;
	}

	public int getMonsterHp() {
		return MonsterHp;
	}

	public String getMonsterName() {
		return MonsterName;
	}

	public boolean isMonsterLive() {
		return MonsterLive;
	}

	public void setMonsterExp(int monsterExp) {
		MonsterExp = monsterExp;
	}

	public void setMonsterHp(int monsterHp) {
		MonsterHp = monsterHp;
	}

	public void setMonsterName(String monsterName) {
		MonsterName = monsterName;
	}

	public void setMonsterLive(boolean monsterLive) {
		MonsterLive = monsterLive;
	}
	
	public void getInformation() {
		System.out.println();
	}
	
}
