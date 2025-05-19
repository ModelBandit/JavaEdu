package FractalTree;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JFrame;


public class FractalTreePractice extends JFrame{
	
	private Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	private final int screenWidth = dimension.width;
	private final int screenHeight = dimension.height;
	
	private final int centerWidth;
	private final int centerHeight;
	
	private Random random = new Random();
	
	public FractalTreePractice(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 700);
		this.setTitle("프랙탈트리");
		
		centerWidth = (screenWidth - this.getWidth())/2;
		centerHeight = (screenHeight - this.getHeight())/2;
		this.setLocation(centerWidth, centerHeight);

		
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		
		int x1 = this.getWidth()/2;
		int y1 = this.getHeight()-50;
		int x2 = x1;
		int y2 = y1-150;
		
		drawTreeLines(g, x1, y1, x2, y2, 6);
	}
	
	public void drawTreeLines(Graphics g, int x1, int y1, int x2, int y2, int level){
		Graphics2D g2 = (Graphics2D)g;
		
		if(level==1){
			Color color = (random.nextBoolean()) ? Color.GREEN : Color.RED;
			g2.setColor(color);
			g2.setStroke(new BasicStroke(15));
			g2.drawLine(x1, y1, x1, y1);
			return;
		} else {
			g2.setStroke(new BasicStroke(level+1));
			g2.setColor(new Color(123,74,18));
			g2.drawLine(x1, y1, x2, y2);
			int ratioLeftX = random.nextInt(90);
			drawTreeLines(g, x2, y2, x2-ratioLeftX, y2/2+ratioLeftX, level-1);
			int ratioRightX = random.nextInt(90);
			drawTreeLines(g, x2, y2, x2+ratioRightX, y2/2+ratioRightX, level-1);
		}
	}
	
	public static void main(String[] args) {
		FractalTreePractice tree = new FractalTreePractice();
	}

}
