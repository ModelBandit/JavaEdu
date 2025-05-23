package Cafeteria;

public class MainClass {
	public static void main(String[] args) {
		LunchMenu lm = new Student1(Price.rice, Price.bulgogi, Price.banana, Price.milk, Price.almond);
		System.out.printf("Student1 식비는 %d원 입니다.\n", lm.getBill());
		
		lm = new Student2(Price.rice, Price.bulgogi, Price.banana, Price.milk, Price.almond);
		System.out.printf("Student2 식비는 %d원 입니다.\n", lm.getBill());
	}
}
