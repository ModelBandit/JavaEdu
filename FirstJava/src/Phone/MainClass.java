package Phone;

public class MainClass {
	public static void main(String[] args) {
		IFunction[] phones = new IFunction[3];

		phones[0] = new APhone(true, "3G", false);
		phones[1] = new BPhone(true, "5G", true);
		phones[2] = new CPhone(true, "4G", false);
		
		for(IFunction phone: phones) {
			printOut(phone);
		}
		
	}
	
	public static void printOut(IFunction phone) {
		
		boolean canCalling = phone.canCalling();
		System.out.print("전화 ");
		if(canCalling == true)
			System.out.println("가능합니다.");
		else 
			System.out.println("불가능합니다.");
		
		String connect = phone.connectStyle();
		if(connect == "3G")
			System.out.print("불가능합니다.");
		else
			System.out.print("가능합니다.");
		System.out.printf("%s입니다.\n", connect);
		
		boolean canRC = phone.canRC();
		if(canRC == false)
			System.out.print("미");
		System.out.println("탑재되어 있습니다.");
		System.out.println("------------------------------------------");
	}
}
