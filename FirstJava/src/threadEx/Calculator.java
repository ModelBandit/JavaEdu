package threadEx;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println("error");
		}
		finally {
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}
}
