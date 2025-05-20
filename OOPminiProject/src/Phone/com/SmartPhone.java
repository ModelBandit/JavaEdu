package Phone.com;

import java.util.Scanner;

public class SmartPhone {
	private Addr[] addrArr;
	private Scanner scanner;

	public SmartPhone() {
		addrArr = new Addr[10];
		scanner = new Scanner(System.in);
	}

	// 생성
	public Addr inputAddrData() {

		System.out.print("이름:");
		String name = scanner.nextLine();

		System.out.print("전화번호:");
		String phone = scanner.nextLine();

		System.out.print("이메일:");
		String email = scanner.nextLine();

		System.out.print("주소:");
		String address = scanner.nextLine();

		System.out.print("그룹(친구/가족):");
		String group = scanner.nextLine();

		return new Addr(name, phone, email, address, group);
	}

	// 저장
	public void addAddr(Addr addr) {
		int i = 0;
		for (; i < addrArr.length; ++i) {
			if (addrArr[i] == null) {
				addrArr[i] = addr;
				break;
			}
		}
		System.out.printf(">>> 데이터가 저장되었습니다.(%d)\n", i + 1);
	}

	// 리스트출력
	public void printAddr(Addr addr) {
		addr.printInfo();
	}

	public void printAllAddr() {
		for (int i = 0; i < addrArr.length; ++i) {
			if (addrArr[i] != null)
				break;
			
			printAddr(addrArr[i]);
		}
	}

	// 검색
	public void searchAddr(String name) {
		for (int i = 0; i < addrArr.length; ++i) {
			if (addrArr[i] != null && addrArr[i].getName().equals(name))
				addrArr[i].printInfo();
		}
	}

	// 삭제
	public void deleteAddr(String name) {
		int index = 0;
		for (int i = index; i < addrArr.length; ++i, ++index) {
			if (addrArr[i] != null && addrArr[i].getName().equals(name)) {
				addrArr[i] = null;
				break;
			}
		}

		for (int i = index; i < addrArr.length - 1; ++i) {
			addrArr[i] = addrArr[i + 1];
		}

	}

	// 수정
	public void editAddr(String name, Addr newAddr) {
		for (int i = 0; i < addrArr.length; ++i) {
			if (addrArr[i] != null && addrArr[i].getName().equals(name)) {
				addrArr[i] = newAddr;
			}
		}
	}

}
