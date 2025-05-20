package myNeural;

public class Perceptron {
	byte[] weight;
	byte bias;
	public Perceptron(int picSize) {
		weight = new byte[picSize*picSize];
		bias = 1;
	}
}
