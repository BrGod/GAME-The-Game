public class Item
{
	protected String name;
	protected double wt, val;
	protected boolean stackable;
	protected int space, stack;
	
	public Item(String name, double wt, double val, int space)
	{
		this.name = name;
		this.wt = wt;
		this.val = val;
		this.space = space;
		stackable = false;
		stack = 1;
	}
	
	public Item(String name, double wt, double val, int space, int stack)
	{
		this.name = name;
		this.wt = wt;
		this.val = val;
		this.space = space;
		stackable = true;
		this.stack = stack;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getWt()
	{
		return wt;
	}
	
	public double getVal()
	{
		return val;
	}
	
	public int getSpace()
	{
		return space;
	}
	
	public boolean isStackable()
	{
		return stackable;
	}
	
	public int getStack()
	{
		return stack;
	}
}
