package Cafeteria;

public abstract class LunchMenu {
	public int rice = Price.rice;
	public int bulgogi = Price.bulgogi;
	public int banana = Price.banana;
	public int milk = Price.milk;
	public int almond = Price.almond;
	
	public LunchMenu(int rice, int bulgogi, int banana, int milk, int almond) {
		
	}

	public int getBill() {
		int sumPrice = Price.rice+Price.bulgogi;
		return sumPrice;
	}
}
