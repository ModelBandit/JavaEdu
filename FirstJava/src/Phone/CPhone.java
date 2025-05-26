package Phone;

public class CPhone implements IFunction {
	boolean needCalling;
	String connectSpeed;
	boolean needRC;
	
	CPhone(boolean needCalling, String connectSpeed, boolean needRC){
		this.needCalling = needCalling;
		this.connectSpeed = connectSpeed;
		this.needRC = needRC;
	}
	
	@Override
	public boolean canCalling() {
		return needCalling;
	}
	
	@Override
	public String connectStyle() {
		return connectSpeed;
	}
	
	@Override
	public boolean canRC() {
		return needRC;
	}
}
