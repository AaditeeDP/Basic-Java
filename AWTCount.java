import java.awt.*;
import java.awt.event.*;

public class AWTCount extends Frame implements ActionListener
{
	private Label lcount;
	private TextField tcount;
	private Button bcount;
	private int count = 0;
	
	public AWTCount() 
	{
		setLayout(new FlowLayout());
		lcount = new Label("The number of times you pressed the button");
		add(lcount);
		tcount = new TextField(count + "" + 10);
		tcount.setEditable(false);
		add(tcount);
		bcount = new Button("Click Me");
		add(bcount);
		bcount.addActionListener(this);
		setTitle("Counter");
		setSize(500,500);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent evt)
	{
		++count;
		tcount.setText(count+ "");
	}

	public static void main(String args[])
	{
		new AWTCount();
	}
}