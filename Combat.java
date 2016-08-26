import java.util.Random;

public class Combat
{
	protected Being a, b;
	protected Weapon x, y;
	private Random rand = new Random();
	
	public Combat(Being a, Weapon x, Being b, Weapon y)
	{
		this.a = a;
		this.b = b;
		this.x = x;
		this.y = y;
	}
	
	public void battle()
	{
		if(a.getVit() <= 0)
		{
			System.out.println(a.getName() + " has no more health!");
			return;
		}
		if(b.getVit() <= 0)
		{
			System.out.println(b.getName() + " has no more health!");
			return;
		}
		int damage = 0;
		double random = 0;
		double crit = 0;
		if(a.getSpd() > b.getSpd())
		{
			System.out.println(a.getName() + " attacks first!");
			random = (double)rand.nextInt(10)+1;
			crit = ((double)a.getDex()/10)+1;
			damage = a.getStr() + x.getAtk();
			if(random*crit > 9)
			{
				System.out.println(a.getName() + " scored a critical hit!");
				damage = damage*2;
			}
			System.out.println(a.getName() + " dealt " + damage + " damage with his " + x.getName() + "!");
			b.setVit(b.getVit()-damage);
			if(b.getVit() <= 0)
			{
				System.out.println(b.getName() + " has been defeated!");
				return;
			}
			System.out.println(b.getName() + " follows up!");
			random = (double)rand.nextInt(10)+1;
			crit = ((double)b.getDex()/10)+1;
			damage = b.getStr() + y.getAtk();
			if(random*crit > 9)
			{
				System.out.println(b.getName() + " scored a critical hit!");
				damage = damage*2;
			}
			System.out.println(b.getName() + " dealt " + damage + " damage with his " + y.getName() + "!");
			a.setVit(a.getVit()-damage);
			if(a.getVit() <= 0)
			{
				System.out.println(a.getName() + " has been defeated!");
				return;
			}
		}
		else if(b.getSpd() > a.getSpd())
		{
			System.out.println(b.getName() + " attacks first!");
			random = (double)rand.nextInt(10)+1;
			crit = ((double)b.getDex()/10)+1;
			damage = b.getStr() + y.getAtk();
			if(random*crit > 9)
			{
				System.out.println(b.getName() + " scored a critical hit!");
				damage = damage*2;
			}
			System.out.println(b.getName() + " dealt " + damage + " damage with his " + y.getName() + "!");
			a.setVit(a.getVit()-damage);
			if(a.getVit() <= 0)
			{
				System.out.println(a.getName() + " has been defeated!");
				return;
			}
			System.out.println(a.getName() + " follows up!");
			random = (double)rand.nextInt(10)+1;
			crit = ((double)a.getDex()/10)+1;
			damage = a.getStr() + x.getAtk();
			if(random*crit > 9)
			{
				System.out.println(a.getName() + " scored a critical hit!");
				damage = damage*2;
			}
			System.out.println(a.getName() + " dealt " + damage + " damage with his " + x.getName() + "!");
			b.setVit(b.getVit()-damage);
			if(b.getVit() <= 0)
			{
				System.out.println(b.getName() + " has been defeated!");
				return;
			}
		}
		else
		{
			int damage2 = 0;
			System.out.println(a.getName() + " and " + b.getName() + " are matched for speed!");
			random = (double)rand.nextInt(10)+1;
			crit = ((double)a.getDex()/10)+1;
			damage = a.getStr() + x.getAtk();
			if(random*crit > 9)
			{
				System.out.println(a.getName() + " scored a critical hit!");
				damage = damage*2;
			}
			b.setVit(b.getVit()-damage);
			random = (double)rand.nextInt(10)+1;
			crit = ((double)b.getDex()/10)+1;
			damage2 = b.getStr() + y.getAtk();
			if(random*crit > 9)
			{
				System.out.println(b.getName() + " scored a critical hit!");
				damage2 = damage2*2;
			}
			System.out.println(a.getName() + " dealt " + damage + " damage with his " + x.getName() + "!");
			System.out.println(b.getName() + " dealt " + damage2 + " damage with his " + y.getName() + "!");
			a.setVit(a.getVit()-damage2);
			if(a.getVit() <= 0 && b.getVit() <= 0)
			{
				System.out.println(a.getName() + " and " + b.getName() + " ran each other through at the same time!");
				return;
			}
			else if(b.getVit() <= 0)
			{
				System.out.println(b.getName() + " has been defeated!");
				return;
			}
			else if(a.getVit() <= 0)
			{
				System.out.println(a.getName() + " has been defeated!");
				return;
			}
		}
	}
}
