package M10.GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class FlowLayout_Example extends JFrame {

    public static final int WIDTH=500;
    public static final int HEIGHT=600;
    public FlowLayout_Example() {
        super("Flow layout example");
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.RIGHT,20,30));/*sets alignment for layout to right (or center/left),horizontal gap, vertical gap */
        JLabel Label1=new JLabel("Label1");
        add(Label1);
        JLabel Label2=new JLabel("Label2");
        add(Label2);JLabel Label3=new JLabel("Label3");
        add(Label3);
    }
}
