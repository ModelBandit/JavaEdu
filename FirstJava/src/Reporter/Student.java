package Reporter;

public class Student {
	private String name;
	private int korScore;
	private int engScore;
	private int mathScore;
	
	public Student(int korScore, int engScore, int mathScore) {
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	//name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//kor
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int score) {
		korScore = score;
	}
	
	//math
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int score) {
		mathScore = score;
	}
	
	//eng
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int score) {
		engScore = score;
	}
	
	public int getSum() {
		return korScore + mathScore + engScore;
	}
	
	public float getAvg() {
		return getSum() / 3f;
	}
}
