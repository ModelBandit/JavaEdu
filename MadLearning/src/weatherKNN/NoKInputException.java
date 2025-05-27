package weatherKNN;

public class NoKInputException extends Exception {
	public NoKInputException() {
		super("마 씨 K값 씨");
	}
	public NoKInputException(String message) {
		super(message);
	}
}
