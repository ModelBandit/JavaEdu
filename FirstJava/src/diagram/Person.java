package diagram;

public class Person {
	Phone homePhone;
	Phone officePhone;
	
	public Person() {
	}

	public void setHomePhone(Phone p) {
		homePhone = p;
	}

	public void setOfficePhone(Phone p) {
		officePhone = p;
	}
	
	public Phone getHomePhone() {
		return homePhone;
	}
	public Phone getOfficePhone() {
		return officePhone;
	}
}
