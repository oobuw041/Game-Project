

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{
  final int WIDTH  = 600;
  final int HEIGHT = 600;
  
  Image enemy;
  Image backgroundImage;
  Timer timer;
  
  int xVelocity = 7;
  int yVelocity = 1;
  int x = 0;
  int y = 0;
  
  
	public MyPanel() {
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));	
		this.setBackground(Color.black);
		enemy = new ImageIcon("enemy.png").getImage();
		//backgroundImage = new ImageIcon("space.jpg").getImage();
		timer = new Timer(1,this);
		timer.start();
	}
	
	
	 public void paint (Graphics g) {
		  super.paint(g);
		  Graphics2D graphics = (Graphics2D)g;
		  graphics.drawImage(enemy, x, y, null);
		  graphics.drawImage(backgroundImage, 0, 0, null);
		 
	  }

	 
	 @Override
		public void actionPerformed(ActionEvent e) {
			if(x >= WIDTH - enemy.getWidth(null)|| x< 0) {
				 xVelocity = xVelocity * -1;
				repaint();
				
			}
			x = x + xVelocity;
			repaint();
			
	 }}	
			
		

	


	


