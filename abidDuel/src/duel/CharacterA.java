package duel;

public class CharacterA implements Dueler{
	private String name;
	private int HP;
	private boolean loaded;
	
	public CharacterA() {
		name = "Riley Sins";
		loaded = false;
	}
	public void taunt() {
		if(Math.random() <= .5){
			System.out.println("Come at me amigo");
		}else{
			System.out.println("You're gonna git it now");
		}
	} 
	public String getName() {
		return name;
	}
	public void setStartingHP(int hp) {
		HP = hp;	
	}
	public int getHP() {
		return HP;
	}
	public boolean determineIfOpponentIsFair(Dueler d, int hp){
		if(d.getHP() == hp){
			return true;
		}else{
			return false;
		}
	}
	public int getAction(Object caller) {
		if(Math.random() <= .5){
			return 0;
		}else{
			return 1;
		}
	}
	public void hit(Object caller) {
		HP -= 10;
	}
}
