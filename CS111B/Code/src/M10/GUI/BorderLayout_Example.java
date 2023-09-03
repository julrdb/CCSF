package M10.GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class BorderLayout_Example extends JFrame
{
	public static final int WIDTH=500;
	public static final int HEIGHT=600;

	public BorderLayout_Example()
	{
		super("Border layout example");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(10,30));

		/* Components are added to North, South, Center, East
		and West directions 
		The space is divided between regions as follows: Regions 
		are allocated space in the order first north and south, 
		second east and west, and last center. So, in particular, 
		if there is nothing in the north region, then the east and 
		west regions will extend to the top of the space.*/

		JLabel Label1=new JLabel("Label North");
		add(Label1,BorderLayout.NORTH);

		JLabel Label2=new JLabel("Label South");
		add(Label2,BorderLayout.SOUTH);

		JLabel Label3=new JLabel("Label Center");
		add(Label3,BorderLayout.CENTER);

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