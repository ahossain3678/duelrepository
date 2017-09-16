
package dueler;

/**
 *
 * @author nasir
 */
public class CharacterB implements Dueler 
{
    private int HP;
    private String name;
    public CharacterB()
    {
        name = "Billy";
    }
    public void Taunt()
    {
        if(Math.random() > .5)
        {
            System.out.println("YOu can neva defeat me B");
        }
        else
        {
            System.out.println("Weakling");
        }
    }
    public String getName()
    {
        return name;
    }
    public void setStartingHP(int hp)
    {
        int HP = 20;
    }
    public int getHP()
    {
        return HP;
    }
    public boolean determineIfOpponentIsFair(Dueler d, int target)
    {
        if(d.getHP() == target)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}
   
