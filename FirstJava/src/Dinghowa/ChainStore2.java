package Dinghowa;

public class ChainStore2 extends MainStore {
	@Override
	protected void Jajang() {
		System.out.println("짜장면 - 5000원");
	}
	@Override
	protected void JamBong() {
		System.out.println("짬뽕 - 5000원");
	}
	@Override
	protected void tangsuc() {
		System.out.println("탕수육 - 10000원");
	}
	@Override
	protected void airBab() {
		System.out.println("공기밥 - 무료");
	}
	
	@Override
	public void print() {
		System.out.println("2호점 가격표");
		printMenu();
	}
}
