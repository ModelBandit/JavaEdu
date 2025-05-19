package FirstJava.Graphic.com;

import java.awt.*;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawLine(0,0,100,100);
	}
}
