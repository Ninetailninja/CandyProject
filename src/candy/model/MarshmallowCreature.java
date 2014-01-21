package candy.model;

public class MarshmallowCreature
{
	private String name;
	private int arms;
	private int legs;
	private int eyes;
	private boolean button;
	
	public MarshmallowCreature()
	{
		name = "Creature";
		arms = 0;
		legs = 0;
		eyes = 0;
		button = true;
		
	}
	
	/**
	 * Create a MarshamllowCreature with the specified values.
	 * @param name The name of the creature.
	 * @param arms How many arms the creature has.
	 * @param legs How many legs the creature has.
	 * @param eyes How many eyes the creature has.
	 * @param button Whether or not the creature has a button.
	 */
	public MarshmallowCreature(String name, int arms, int legs, int eyes, boolean button)
	{
		this.name = name;
		this.arms = arms;
		this.legs = legs;
		this.eyes = eyes;
		this.button = button;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setArms(int arms)
	{
		this.arms = arms;
	}
	public void setLegs(int legs)
	{
		this.legs = legs;
	}
	public void setEyes(int eyes)
	{
		this.eyes = eyes;
	}
	public void setButton(boolean button)
	{
		this.button = button;
	}
	
	public String getName()
	{
		return name;
	}
	public int getArms()
	{
		return arms;
	}
	public int getLegs()
	{
		return legs;
	}
	public int getEyes()
	{
		return eyes;
	}
	public boolean getButton()
	{
		return button;
	}
}
