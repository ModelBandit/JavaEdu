package myNeural;

import java.io.*;
import java.io.IOException;
//import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class ImageLoader {
	private final int picSize = 32;
	
	//TODO option change png -> jpg
	private String path = "C:\\Users\\user\\Desktop\\DataSet\\images.cv_xqgnlklwdd2ww4duo9yd\\data\\test\\animal animal_faces dog dog_face\\gray-0DNDDGXUY2WT.jpg";
	private int[] image = new int[picSize * picSize];
		
	public void Read() {
		File fp = new File(path);
		System.out.println(fp.getPath());
		System.out.println(fp.exists());
		System.out.println(fp.canRead());
		System.out.println(fp.isAbsolute());
		System.out.println(fp.getAbsolutePath());
		
		try {
			BufferedImage img = ImageIO.read(fp);
			
			int rgb = 0;
			for(int i=0;i<picSize;++i) {
				for(int j = 0;j<picSize;++j) { 
					rgb = img.getRGB(i,j) & 0xff;//흑백이니 그냥 뽑아버리기
					if(rgb > 0)
						image[i*picSize+j] = rgb ;
					else
						image[i*picSize+j] = rgb;
					
					System.out.print(image[i*picSize+j] + " ");
				}
				System.out.println();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
