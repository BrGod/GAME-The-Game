public class Weapon extends Item
{
	protected int atk;
	
	public Weapon(String name, double wt, double val, int space, int atk)
	{
		super(name, wt, val, space);
		this.atk = atk;
	}
	
	public Weapon(String name, double wt, double val, int space, int stack, int atk)
	{
		super(name, wt, val, space, stack);
		this.atk = atk;
	}
	
	public int getAtk()
	{
		return atk;
	}
}
