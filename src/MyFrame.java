import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class MyFrame extends JFrame{

	public MyFrame() {
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		this.pack();
		this.setVisible(true);
	}

}
