package Dinghowa;

public class MainStore {
	
	protected void Jajang() {
		System.out.println("짜장면 - 8000원");
	}
	protected void JamBong() {
		System.out.println("짬뽕 - 8000원");
	}
	protected void tangsuc() {
		System.out.println("탕수육 - 12000원");
	}
	protected void gunmandu() {
		System.out.println("군만두 - 3000원");
	}
	protected void airBab() {
		System.out.println("공기밥 - 1000원");
	}
	
	public void print() {
		System.out.println("본점");
		printMenu();
	}
	
	protected void printMenu() {
		Jajang();
		JamBong();
		tangsuc();
		gunmandu();
		airBab();
		System.out.println("===============================");
	}

}
