package chapter01;

import java.util.Scanner;
//자바 밑에 lang관련된 거는 import가 없어도 괜찮은 부분

public class FirstClass {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("아무 글자나 입력: ");
		
		String s = in.nextLine();
		
		System.out.printf("it's %s", s);
		System.out.println();
		System.out.printf("it's %s", s);
		in.close();
		
		// SL4J
	}

}
