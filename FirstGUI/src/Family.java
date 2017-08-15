import java.awt.*;
import javax.swing.*;

public class Family extends JFrame {

	public Family()
	{
		Container cont=getContentPane();
		cont.add(new JLabel("asasa"));
		cont.add(new JLabel("asasa23"));
		cont.add(new JLabel("asasa45"));
		cont.add(new JLabel("asasa78"));
		
		cont.setLayout(new FlowLayout());
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Family fam=new Family();
		fam.setVisible(true);
	}

}
