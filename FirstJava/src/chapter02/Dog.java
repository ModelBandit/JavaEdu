package chapter02;

public class Dog {
	protected String m_kind;
	public Dog() {
		m_kind = "개";
	}
	
	@Override
	public void finalize(){
		System.out.println("소멸자");
	}
	public void print() {
		System.out.println("개");
	}
}
