package Ch8;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("계좌 정보를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("계좌명의: ");
		String name = scanner.nextLine();
		
		System.out.print("계좌번호: ");
		int no = scanner.nextInt();
		
		System.out.print("잔고: ");
		int balance = scanner.nextInt();
		
		Account account = new Account(name, no, balance);
		
		System.out.printf("계좌 기본 정보:{%s,%d,%d}\n",account.getName(), account.getNo(), account.getBalance());
		
		
		account.deposit();
		System.out.printf("잔금은 %d입니다.", account.balance);
		
		scanner.close();
	}

}
