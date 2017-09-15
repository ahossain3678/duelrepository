package duel;

public class CharacterA extends Duel implements Dueler{
	private String name;
	private int HP;
	public CharacterA() {
		 name = "vic";
		 HP = 10;
	}
	public String getName() {
		return name;
	}
	public int getHP() {
		return HP;
	}
}
