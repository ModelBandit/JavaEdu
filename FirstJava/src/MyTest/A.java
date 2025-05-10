package MyTest;

public class A {
	public class B {
		public void Func() {};
	};
	
	public static void Func1(){
		A a = new A();
		B b = a.new B();
		b.Func();
		
	}
	public void Func2(){
		
	}
}
