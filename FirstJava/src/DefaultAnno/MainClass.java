package DefaultAnno;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character c = new Warrior() {
			@Override
			public void func1() {
				System.out.println("annoymous");
			}
		};
		
		c.func1();
		c.func2();
	}

}
