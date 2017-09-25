/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duel;

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
    public void taunt()
    {
        if(Math.random() > .5)
        {
            System.out.println("Jesus Christ");
        }
        else
        {
            System.out.println("Banzai");
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
        return 1;
    }
    public void hit(Object caller)
    {
        HP -= 10;
    }
}
   
