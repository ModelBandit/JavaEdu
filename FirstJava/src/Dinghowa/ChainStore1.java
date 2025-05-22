package Dinghowa;

public class ChainStore1 extends MainStore {
	@Override
	protected void Jajang() {
		System.out.println("짜장면 - 7000원");
	}
	@Override
	protected void gunmandu() {
		System.out.println("군만두 - 판매하지 않음");
	}
	
	@Override
	public void print() {
		System.out.println("1호점 가격표");
		printMenu();
	}
}
