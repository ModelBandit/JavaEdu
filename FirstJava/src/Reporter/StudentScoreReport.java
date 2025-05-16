package Reporter;

public class StudentScoreReport {
	private Student[] students;

	public static void main(String[] args) {
		StudentScoreReport reporter = new StudentScoreReport();
		
		//진짜로 배열 공간만 잡아주고 각 배열은 생성되지 않음
		reporter.students = new Student[10];
		//그래서 이건 에러남
		//Student s = new Student();
		//int[] arr = new int[100]; // 이 경우에는 바로 값을 넣어도 문제가 되지 않음

		reporter.ReportInsert();
		reporter.PrintAll();
	}

	private void ReportInsert() {
		students[0] = new Student(100,70,80);
		students[1] = new Student(70,80,60);
		students[2] = new Student(80,70,70);
		students[3] = new Student(60,80,80);
		students[4] = new Student(50,60,70);
		students[5] = new Student(70,50,60);
		students[6] = new Student(90,90,50);
		students[7] = new Student(90,80,90);
		students[8] = new Student(80,70,90);
		students[9] = new Student(100,80,90);
	}

	private void PrintAll() {
		System.out.println("국어  영어\t수학\t|\t총합\t평균");
		System.out.println("--------------------------------------------------------");
		for (int i = 0; i < students.length; ++i) {
			System.out.printf("%-3d %-3d %-3d |\t%d\t%d\n", students[i].getKorScore(), students[i].getEngScore(), students[i].getMathScore(), students[i].getSum(), students[i].getAvg());
		}
	}
}
