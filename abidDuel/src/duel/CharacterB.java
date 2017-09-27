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
    private boolean loaded;
    public CharacterB()
    {
        name = "Johnny Reid";
        loaded = false;
    } 
    public void taunt()
    {
        if(Math.random() > .5)
        {
            System.out.println("we");
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
        if(caller instanceof Duel) 
        {
        	if(loaded == false)
        	{	
        		loaded = true;
        		return Duel.LOADING;	
        	}
        	else
        	{
        		if(HP > 70)
        		{
        			loaded = false;
        			return Duel.SHOOTING;
        		}
        		else if(HP < 70 && HP > 50)
        		{
        			loaded = false;
        			return Duel.GUARDING;
        		}
        		if(HP <= 50)
        		{
        			loaded = false;
        			return Duel.SHOOTING;
        		}
        		if(HP <= 10)
        		{
        			loaded = false;
        			System.out.println("AAAAAAHH");
        			return Duel.GUARDING;
        		}
        	}
        }
        else
        {
        	return Duel.GUARDING;
        }
		return Duel.GUARDING;
    }
    public void hit(Object caller)
    {
        HP -= 10;
    }
}
   
