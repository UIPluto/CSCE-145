/*
 * Written by: Thomas Higgins
 */
public class Bicycle 
{
	private String make;
	private Wheel frontwheel;
	private Wheel backwheel;
	private Frame frame;
	public Bicycle() //Default Constructor
	{
		this.make = "none";
		this.frontwheel = new Wheel();
		this.backwheel = new Wheel();
		this.frame = new Frame();
	}
	public Bicycle(String m, Wheel fw, Wheel bw, Frame f) //Constructor with Parameters
	{
		this.setMake(m);
		this.setFrontWheel(fw);
		this.setBackWheel(bw);
		this.setFrame(f);
	}
	public String getMake()
	{
		return this.make;
	}
	public Wheel getFrontWheel()
	{
		return this.frontwheel;
	}
	public Wheel getBackWheel()
	{
		return this.backwheel;
	}
	public Frame getFrame()
	{
		return this.frame;
	}
	public void setMake(String m)
	{
		if(m == null) //In case the make is null
		{
			this.make = "none";
		} else
		{
			this.make = m;
		}
	}
	public void setFrontWheel(Wheel fw)
	{
		if(fw != null)
		{
			this.frontwheel = fw;
		} else
		{
			this.frontwheel = new Wheel(); //Defaults to the default wheel constructor in case of invalid values
		}
	}
	public void setBackWheel(Wheel bw)
	{
		if(bw != null)
		{
			this.backwheel = bw;
		} else
		{
			this.backwheel = new Wheel();
		}
	}
	public void setFrame(Frame f)
	{
		if(f != null)
		{
			this.frame = f;
		} else
		{
			this.frame = new Frame();
		}
	}
	public String toString()
	{
		return "Make: " + make + " Front Wheel: " + frontwheel + " Back Wheel: " + backwheel + " Frame: " + frame;
	}
	public boolean equals(Bicycle b) //Supposed to prove different memory and properties but does not.
	{
		return b != null && this.make.equalsIgnoreCase(b.getMake()) && this.frontwheel == b.getFrontWheel() && this.backwheel == b.getBackWheel() && this.frame == b.getFrame();
	}
}
