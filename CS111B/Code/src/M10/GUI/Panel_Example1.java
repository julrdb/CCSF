package M10.GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.JPanel;

public class Panel_Example1 extends JFrame
{
	public static final int WIDTH=500;
	public static final int HEIGHT=600;

	public Panel_Example1()
	{
		super("Border layout example");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		

		/* Components are Panel based on layout*/
		JPanel PanelNorth=new JPanel(new GridLayout());
		JLabel Label1North=new JLabel("Label1 North");
		PanelNorth.add(Label1North);
		JLabel Label2North=new JLabel("Label2 North");
		PanelNorth.add(Label2North);
		PanelNorth.setBackground(Color.PINK);
		add(PanelNorth,BorderLayout.NORTH);

		JPanel PanelSouth=new JPanel(new FlowLayout(FlowLayout.CENTER,20,30));
		
		JLabel Label1South=new JLabel("Label1 South");
		PanelSouth.add(Label1South);
		PanelSouth.setBackground(Color.PINK);

		JLabel Label2South=new JLabel("Label2 South");
		PanelSouth.add(Label2South);

		add(PanelSouth,BorderLayout.SOUTH);



		JLabel Label4=new JLabel("Label East");
		add(Label4,BorderLayout.EAST);

		JLabel Label5=new JLabel("Label West");
		add(Label5,BorderLayout.WEST);

		/* Later we will learn that using Panels we can 
		group items so that more than one item can  be 
		placed in each region.

		*/


	}

}