package Cafeteria;

public class Student1 extends LunchMenu {
	
	public Student1(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);
	}
	
	@Override
	public int getBill() {
		int sumPrice = Price.rice+Price.bulgogi+Price.banana;
		return sumPrice;
	}
}
