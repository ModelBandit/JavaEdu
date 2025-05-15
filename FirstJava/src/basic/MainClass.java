package basic;

//import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Member firstPerson = new Member("SHKIM", "010-9999-7777", "컴퓨터", 2, "shkim@gmail.com", "2000-10-11", "서울");
		firstPerson.print();
		
		System.out.println("----------------------");
		
		Member secondPerson = new Member("JJKIM", "010-1111-3333", "컴퓨터", 2, "jjkim@gmail.com");
		secondPerson.print();
	}

}
