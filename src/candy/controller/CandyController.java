package candy.controller;
import candy.model.MarshmallowCreature;
import javax.swing.JOptionPane;

public class CandyController
{
	private MarshmallowCreature myCreature;
	String name = "ShmellowMan";
	int arms = 4;
	int legs = 6;
	int eyes = 3;
	boolean button = false;
	String tButton;
	
	public CandyController()
	{
		
	}
	
	public void start()
	{
		promptForInfo();
		makeMonster();
	}
	
	private void promptForInfo()
	{
		JOptionPane.showMessageDialog(null, "We're going to make a Marshmallow Creature!!");
		name = JOptionPane.showInputDialog(null, "What should we name it?");
		arms = Integer.parseInt(JOptionPane.showInputDialog(null, "How many arms should it have?"));
		legs = Integer.parseInt(JOptionPane.showInputDialog(null, "How many legs should it have?"));
		eyes = Integer.parseInt(JOptionPane.showInputDialog(null, "How many eyes should it have?"));
		tButton = JOptionPane.showInputDialog(null, "Should it have a button?");
		
		if (tButton.equalsIgnoreCase("yes"))
			button = true;
		else
			button = false;
		
	}
	
	private void makeMonster()
	{
		myCreature = new MarshmallowCreature(name, arms, legs, eyes, button);
		if (button == true)
			JOptionPane.showMessageDialog(null, "Creatures name: " + name + ". \n" + "Has " + arms + "arms. \n Has " + legs + "legs. \n Has " + eyes + "eyes. \n And has a button." );
		else
			JOptionPane.showMessageDialog(null, "Creatures name: " + name + ". \n" + "Has " + arms + "arms. \n Has " + legs + "legs. \n Has " + eyes + "eyes. \n And does not have a button." );
	}
}
