package chapter02;

public class Chowchow extends Dog {
	
	@Override
	public void print(){
		m_kind = "차우차우";
		super.print();
		System.out.println(m_kind);
	}

}
