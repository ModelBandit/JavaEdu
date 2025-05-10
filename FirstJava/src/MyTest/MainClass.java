package MyTest;

public class MainClass {

	public static void main(String[] args) {
		// TODO 
		A a = null;
		a.Func1(); /*돌아감*/
		
		try {
			a.Func2(); /*안돌아감*/
			System.out.println("정상");
		}
		catch(NullPointerException e) {
			System.out.println("비정상");
			System.out.println(e);
		}
	}
	
	public static void Func1(){
		A a = new A();
		A.B b = a.new B();
		a.Func1();
	}

}
