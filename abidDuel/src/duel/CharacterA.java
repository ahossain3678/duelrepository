package duel;

<<<<<<< Upstream, based on 1ee76262e2dea31d4832c7f41c23805b28c8380b
public class CharacterA implements Dueler{
=======
public class CharacterA implements Dueler {
>>>>>>> da296af CharacterA update
	private String name;
	private int HP;
	public CharacterA() {
		name = "Riley Sins";
	}
	public void taunt() {
		
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
	public boolean determineOpponentIsFair(Dueler d, int hp){
		if(d.getHP() == hp){
		return true;
		}else{
			return false;
		}
	}
	public int getAction(Object caller) {
		
	}
	public void hit(Object caller) {
		HP -= 10;
	}
}
