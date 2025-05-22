package Dinghowa;

public class ChainStore3 extends MainStore {
	@Override
	protected void Jajang() {
		System.out.println("짜장면 - 7000원");
	}
	@Override
	protected void JamBong() {
		System.out.println("짬뽕 - 7000원");
	}
	
	@Override
	public void print() {
		System.out.println("3호점 가격표");
		printMenu();
	}
}
