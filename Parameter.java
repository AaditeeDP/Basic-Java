import java.applet.Applet;
import java.awt.*;

public class Parameter extends Applet
{
	Font f1,f2;
	String n,d,c;
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.setFont(f1);
		g.drawString("My second Applet",45,45);
		g.setFont(f2);
		g.setColor(Color.black);
		g.drawString("Name:"+n,150,150);
		g.drawString("College:"+c,190,190);
		g.drawString("Department:"+d,220,220);
	}
	public void init()
	{
		f1 = new Font("Elephant",Font.PLAIN,30);
		f2 = new Font("Arial",Font.PLAIN,30);
		n = getParameter("name");
		c = getParameter("college");
		d = getParameter("depart");
	}
}