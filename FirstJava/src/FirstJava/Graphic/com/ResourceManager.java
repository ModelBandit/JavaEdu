package FirstJava.Graphic.com;

public class ResourceManager {
	private static ResourceManager mInstance = new ResourceManager();
	
	private ResourceManager(){
		
	}
	
	public static ResourceManager getInstance() {
		return mInstance;
	}
}
