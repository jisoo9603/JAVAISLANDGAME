package javagame.game;

public class Bear extends Monster{
	
	public Bear() {
		super("곰", 1000, 300);
		}
	
	
	@Override
	public void MonsterDie() {
		this.setMonsterLive(false);
		System.out.println("곰을 해치웠습니다.");
	}
	
	
}
