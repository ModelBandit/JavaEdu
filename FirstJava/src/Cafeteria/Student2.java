package Cafeteria;

public class Student2 extends LunchMenu {

	public Student2(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);
	}
	
	@Override
	public int getBill() {
		int sumPrice = Price.rice+Price.bulgogi+Price.milk+Price.almond;
		return sumPrice;
	}

}
