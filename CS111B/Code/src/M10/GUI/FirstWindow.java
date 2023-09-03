package M10.GUI;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FirstWindow extends JFrame
{
	public static final int WIDTH=400;
	public static final int HEIGHT=500;

	public FirstWindow()
	{
		super();
		setSize(WIDTH,HEIGHT);
		setTitle("My First Window");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		JLabel Label1=new JLabel("It is a sunny day");
		JLabel Label2=new JLabel("Day for a nice picnic");
		JButton ButtonEnd=new JButton("Click to end the program");
		ButtonEnd.addActionListener(new EndingListener());
		add(ButtonEnd);
		add(Label1);
		add(Label2);

	}
}

