package duel;

public class CharacterA extends Duel implements Dueler{
	private String name;
	private int HP;
	public CharacterA() {
		 name = "Vic";
	}
	public String getName() {
		return name;
	}
	public int getHP() {
		return HP;
	}
	public void setStartingHP(int HP) {
		HP = 10;
	}
	public void taunt() {
		
	}
}
