import java.awt.*;
class AWTFirst extends Frame
{
	AWTFirst()
	{
		Button b = new Button("click");
		b.setBounds(150,150,200,20);
		add(b);
		setSize(250,250);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String args[])
	{
		AWTFirst f = new AWTFirst();
	}
}	