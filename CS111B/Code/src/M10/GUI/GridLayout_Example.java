package M10.GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*;

public class GridLayout_Example extends JFrame
{
	public static final int WIDTH=500;
	public static final int HEIGHT=600;

	public GridLayout_Example()
	{
		super("Grid layout example");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,2,20,30));
		/*sets grid to 3 rows and 2 columns */
		
		/* When using a GridLayout manager, each component
		 is stretched so that it completely fills its grid 
		 position.*/
		JLabel Label1=new JLabel("Row1-Col1");
		add(Label1);

		JLabel Label2=new JLabel("Row1-Col2");
		add(Label2);

		JLabel Label3=new JLabel("Row2-Col1");
		add(Label3);

		JLabel Label4=new JLabel("Row2-Col2");
		add(Label4);
		
		JLabel Label5=new JLabel("Row3-Col1");
		add(Label5);

		JLabel Label6=new JLabel("Row3-Col2");
		add(Label6);
		
		/*If you add seven or eight items, a third column
		 is automatically added, and so forth. If you add 
		 fewer than six components, there will be two rows 
		 and a reduced number of columns.
	
		JLabel Label7=new JLabel("Row-Col-not known");
		add(Label7);

		*/
		
	}

}