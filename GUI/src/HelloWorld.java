import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
public class HelloWorld extends JFrame {
	private JFrame frame,frame2;
	private static String NL=System.getProperty("line.separator");
	public String relatives()
	{
		String rude="parinti " + ": tata " + "mama "+NL;
		rude+="unchi:"+"Onica"+"Vladi"+"Viorel"+NL;
		return rude;
	}
	public void setLineSeparator(String requieredSeparator)
	{
		NL=requieredSeparator;
	}
	public HelloWorld()
	{
		JLabel lable= new JLabel(relatives());
		JLabel lable2= new JLabel("bine ati venit cu noi");
		frame2 = new JFrame("Fruits basket");
		frame2.setTitle("start");
		frame2.setVisible(true);
		Container container= frame2.getContentPane();
        container.add(lable2);
        frame2.pack();
        frame = new JFrame("Fruits basket");
        frame.setSize(100, 200);
        frame.setVisible(true);
        Container container1= frame.getContentPane();
        container1.add(lable);
        frame.pack();
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld window=new HelloWorld();
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
     
	}

}
