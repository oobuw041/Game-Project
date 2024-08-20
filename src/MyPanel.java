import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.*;


import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{
  final int WIDTH  = 500;
  final int HEIGHT = 500;
  
  Image enemy;
  Image backgroundImage;
  Timer timer;
  
  int xVelocity;
  int yVelocity;
  int x = 0;
  int y = 0;
  
  
	public MyPanel() {
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));	
		enemy = new ImageIcon("enemy.png").getImage();
		backgroundImage = new ImageIcon("sky.jpg").getImage();
		timer = new Timer(1,this);
		timer.start();
	}
	
	
	 public void paint (Graphics g) {
		  super.paint(g);
		  Graphics2D graphics = (Graphics2D)g;
		  graphics.drawImage(backgroundImage,0, 0, null);
		  graphics.drawImage(enemy, x, y, null);
	  }

	 
	@Override
	public void actionPerformed(ActionEvent e) {
		if(x>= WIDTH - enemy.getWidth(null)) {
			xVelocity = xVelocity * - 1;
		
			
		}
		
		x +=xVelocity;
		repaint();
		
		
		if(y>= WIDTH - enemy.getWidth(null)) {
			yVelocity = yVelocity * - 1;
		
			
		}
		
		y +=yVelocity;
		repaint();
		
	}

	

}
