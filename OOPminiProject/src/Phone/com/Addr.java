package Phone.com;

public class Addr {
	private String name;
	private String phone;
	private String email;
	private String address;
	private String group;
	
	public Addr(String name, String phone, String email, String address, String group) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.group = group;
	}
	
	public void printInfo() {
		System.out.printf("이름: %s\n", name);
		System.out.printf("전화번호: %s\n", phone);
		System.out.printf("이메일: %s\n", email);
		System.out.printf("주소: %s\n", address);
		System.out.printf("그룹(친구/가족): %s\n", group);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
}
