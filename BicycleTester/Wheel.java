/*
 * Written by: Thomas Higgins
 */
public class Wheel 
{
	private double diameter;
	private double width;
	public Wheel()
	{
		this.diameter = 16;
		this.width = 1;
	}
	public Wheel(double d, double w)
	{
		this.setDiameter(d);
		this.setWidth(w);
	}
	public double getDiameter()
	{
		return this.diameter;
	}
	public double getWidth()
	{
		return this.width;
	}
	public void setDiameter(double d)
	{
		if(d >= 16 && d <= 55)
		{
			this.diameter = d;
		} else
		{
			this.diameter = 16;
		}
	}
	public void setWidth(double w)
	{
		if(w >= 1 && w <= 2.5)
		{
			this.width = w;
		} else
		{
			this.width = 1;
		}
	}
	public String toString()
	{
		return "Diameter: " + diameter + " Width: " + width;
	}
	public boolean equals(Wheel w)
	{
		return w != null && this.diameter == w.getDiameter() && this.width == w.getWidth();
	}
}
