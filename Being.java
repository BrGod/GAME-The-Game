import java.util.ArrayList;

public class Being
{
	String name;
	protected int vit, str, dex, spd, mag, iq, stam;
	protected double cap, space;
	protected ArrayList<Integer> skills;
	
	public Being(String name, int vit, int str, int dex, int spd, int mag, int iq, int stam, double cap, double space, ArrayList<Integer> skills)
	{
		this.name = name;
		this.vit = vit;
		this.str = str;
		this.dex = dex;
		this.spd = spd;
		this.mag = mag;
		this.iq = iq;
		this.stam = stam;
		this.cap = cap;
		this.space = space;
		this.skills = skills;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getVit()
	{
		return vit;
	}
	
	public void setVit(int vit)
	{
		this.vit = vit;
	}
	
	public int getStr()
	{
		return str;
	}
	
	public int getDex()
	{
		return dex;
	}
	
	public int getSpd()
	{
		return spd;
	}
	
	public int getMag()
	{
		return mag;
	}
	
	public int getIq()
	{
		return iq;
	}
	
	public int getStam()
	{
		return stam;
	}
	
	public double getCap()
	{
		return cap;
	}
	
	public double getSpace()
	{
		return space;
	}
	
	public ArrayList<Integer> getSkills()
	{
		return skills;
	}
}
