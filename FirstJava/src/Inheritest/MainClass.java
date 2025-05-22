package Inheritest;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent[] p = new Parent[3];

		p[0] = new Parent();
		p[1] = new Child();
		p[2] = new OtherChild();

		Child c;
		for (int i = 0; i < p.length; ++i) {
			p[i].print();
			if(p[i] instanceof Child) {
				c = (Child) p[i];
				c.print();
			}
		}
		

	}

}
