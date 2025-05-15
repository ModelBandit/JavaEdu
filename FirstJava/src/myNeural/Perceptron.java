package myNeural;

import java.io.*;
import java.io.IOException;
//import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Perceptron {
	private final int picSize = 100;
	private String path = "C:\\Users\\user\\Desktop\\100100dog.png";
	private float[] image = new float[picSize * picSize];
		
	public void Read() {
		File fp = new File(path);
		
		try {
			BufferedImage img = ImageIO.read(fp);
			
			int rgba = 0;
			int a = 0;
			for(int i=0;i<picSize;++i) {
				for(int j = 0;j<picSize;++j) { 
					rgba = img.getRGB(i,j);
					//Color c = new Color(rgba);
					//System.out.printf("%d ", c.getAlpha());
					a = (rgba >> 24) & 0xff;
					if(a > 0)
						image[i*picSize+j] = a;
					else
						image[i*picSize+j] = a;
					
					//System.out.print(image[i*picSize+j] + " ");
				}
				System.out.println();
			}
		}
		catch(IOException e) {
			
		}
	}
	
	
}
