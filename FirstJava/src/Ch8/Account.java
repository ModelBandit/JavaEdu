package Ch8;
import java.util.Scanner;

public class Account {
	String name;
	int no;
	int balance;
	
	public Account(String name, int no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
		
		//System.out.printf("계좌 기본 정보:{%s,%d,%d\n}",name, no, balance);
	}
	
	public String getName() {
		return name;
	}
	public int getNo() {
		return no;
	}
	public int getBalance() {
		return balance;
	}
	public void deposit() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("출금액: ");
		int num = scanner.nextInt();
		balance -= num;
		//System.out.printf("잔금은 %d입니다", balance);
		scanner.close();
	}
}
