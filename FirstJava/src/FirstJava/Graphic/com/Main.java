package FirstJava.Graphic.com;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

import java.awt.event.*;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Window");
		
		Dimension dim = new Dimension(800,600);
		frame.setLocation(400,300);
		frame.setPreferredSize(dim);
		
//		button.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("프린트");
//			}
//		});
//		frame.add(button);
//		frame.setSize(800,600);
		
		DrawPanel panel = new DrawPanel();
		
		frame.add(panel);
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
