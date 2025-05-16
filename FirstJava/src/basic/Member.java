package basic;

//import java.util.Scanner;

public class Member {
	private String name;
	private String phoneNumber;
	private String major;
	private int grade;
	private String email;
	private String birthDate;
	private String address;
	
	public Member(String name, String phoneNumber, String major, int grade, String email, String birthDate, String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birthDate = birthDate;
		this.address = address;
	}
	
	public Member(String name, String phoneNumber, String major, int grade, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
	}
	
	public void print() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNumber);
		System.out.println("전공: " + major);
		System.out.println("학년: " + grade);
		System.out.println("이메일" + email);
		
		System.out.print("생일: ");
		if(birthDate == null)
			System.out.println("정보없음");
		else
			System.out.println(birthDate);
		
		System.out.print("주소: ");
		if(address == null)
			System.out.println("정보없음");
		else
			System.out.println(address);
	}
}
