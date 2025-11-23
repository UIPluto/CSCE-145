/*
 * Written by: Thomas Higgins
 */
public class Frame 
{
	private double size;
	private String type;
	public Frame()
	{
		this.size = 18.5;
		this.type = "Diamond";
	}
	public Frame(double s, String t)
	{
		this.setSize(s);
		this.setType(t);
	}
	public double getSize()
	{
		return this.size;
	}
	public String getType()
	{
		return this.type;
	}
	public void setSize(double s)
	{
		if(s >= 18.5 && s <= 60.0)
		{
			this.size = s;
		} else
		{
			this.size = 18.5;
		}
	}
	public void setType(String t)
	{
		if(t.equalsIgnoreCase("Diamond") || t.equalsIgnoreCase("Step-Through") || t.equalsIgnoreCase("Truss") || t.equalsIgnoreCase("Penny-Farthing")) //Checks to see if the type is a valid type
		{
			this.type = t;
		} else
		{
			this.type = "Diamond";
		}
	}
	public String toString()
	{
		return "Size: " + size + " Type: " + type;
	}
	public boolean equals(Frame f)
	{
		return f != null && this.size == f.getSize() && this.type.equalsIgnoreCase(f.getType());
	}
}
