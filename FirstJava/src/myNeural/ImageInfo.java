package myNeural;

public class ImageInfo {
	byte[] pixelPosition;

	public ImageInfo(int picSize) {
		pixelPosition = new byte[picSize*picSize];
	}
}
