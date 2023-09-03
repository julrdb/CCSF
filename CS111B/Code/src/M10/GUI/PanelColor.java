package M10.GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PanelColor extends JFrame implements ActionListener
{
	public static final int WIDTH=600;
	public static final int HEIGHT=500;

	private JPanel BluePanel;
	private JPanel WhitePanel;
	private JPanel GrayPanel;

	public static void main(String[] args)
	{
		PanelColor pc=new PanelColor();
		pc.setVisible(true);
	}

	public PanelColor()
	{
		super("Color Panels");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		JPanel BigPanel=new JPanel();
		BigPanel.setLayout(new GridLayout(1,3));

		BluePanel=new JPanel();
		BluePanel.setBackground(Color.LIGHT_GRAY);
		BigPanel.add(BluePanel);

		WhitePanel=new JPanel();
		WhitePanel.setBackground(Color.LIGHT_GRAY);
		BigPanel.add(WhitePanel);

		GrayPanel=new JPanel();
		GrayPanel.setBackground(Color.LIGHT_GRAY);
		BigPanel.add(GrayPanel);

		add(BigPanel,BorderLayout.CENTER);

		JPanel ButtonPanel=new JPanel();
		ButtonPanel.setLayout(new FlowLayout());

		JButton blueButton=new JButton("Blue");
		blueButton.setBackground(Color.BLUE);
		blueButton.addActionListener(this);
		ButtonPanel.add(blueButton);

		JButton whiteButton=new JButton("White");
		whiteButton.setBackground(Color.WHITE);
		whiteButton.addActionListener(this);
		ButtonPanel.add(whiteButton);

		JButton grayButton=new JButton("Gray");
		grayButton.setBackground(Color.LIGHT_GRAY);
		grayButton.addActionListener(this);
		ButtonPanel.add(grayButton);

		add(ButtonPanel,BorderLayout.SOUTH);

	}

	public void actionPerformed(ActionEvent e)
	{
		String buttonString=e.getActionCommand();

		switch (buttonString) {
			case "Blue" -> BluePanel.setBackground(Color.BLUE);
			case "White" -> WhitePanel.setBackground(Color.WHITE);
			case "Gray" -> GrayPanel.setBackground(Color.GRAY);
			default -> System.out.println("Error");
		}

	}
}
