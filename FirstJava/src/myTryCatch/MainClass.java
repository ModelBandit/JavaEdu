package myTryCatch;

public class MainClass {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		
		System.out.println("예금액" + account.getBalance());

		try {
			account.withdraw(30000);
		}
		catch(BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			
		}
		
	}
	
	public static void sub(String[] args) {

		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값 수 부족");
			System.out.println("java MainClass num1 num2");
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}
		catch(NumberFormatException e){
			System.out.println("숫자로 변환 불가");
		}
		finally {
			System.out.println("다시 실행하시오.");
		}
	}
}
