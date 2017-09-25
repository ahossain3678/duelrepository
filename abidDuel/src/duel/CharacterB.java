/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        name = "Johnny Reid";
    }
    public void Taunt()
    {
        if(Math.random() > .5)
        {
            System.out.println("");
        }
        else
        {
            System.out.println("");
        }
    }
    public String getName()
    {
        return name;
    }
    public void setStartingHP(int HP)
    {
        this.HP = HP;
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

    /**
     *
     * @param caller
     * @return
     */
    public int getAction(Object caller)
    {
        
    }
    public void hit(Object caller)
    {
        caller.setStartingHP(getHP()-10);
    }
}
   
