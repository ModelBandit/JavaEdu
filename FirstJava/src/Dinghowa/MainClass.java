package Dinghowa;

public class MainClass {
	public static void main(String[] args) {
		MainStore ms = new ChainStore1();
		ms.print();
		
		ms = new ChainStore2();
		ms.print();
		
		ms = new ChainStore3();
		ms.print();
	}
}
