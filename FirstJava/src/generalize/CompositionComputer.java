package generalize;

public class CompositionComputer {
	private MainBoard mainBoard;
	private CPU cpu;
	private Memory memory;
	private PowerSupply powerSupply;
	
	public CompositionComputer() {
		mainBoard = new MainBoard();
		cpu = new CPU();
		memory = new Memory();
		powerSupply = new PowerSupply();
	}
}
