package diagram;

public class MainClass {
	public static void main(String[] args) {
		Course course1 = new Course("SoftwareEngineering");
		System.out.println(course1.getName());
		Course course2 = new Course("DesignPattern");
		System.out.println(course2.getName());

		Student student1 = new Student("홍길동");
		System.out.println(student1.getName());
		Student student2 = new Student("홍길서");
		System.out.println(student2.getName());
		Student student3 = new Student("홍길남");
		System.out.println(student3.getName());
		
		Transcript transcript1 = new Transcript(student1, course1);
		transcript1.setGrade("A+");
		System.out.printf("%s %s %s\n",
				transcript1.getStudent().getName(),
				transcript1.getCourse().getName(),
				transcript1.getGrade());
		
		Transcript transcript2 = new Transcript(student2, course2);
		transcript2.setGrade("C+");
		System.out.printf("%s %s %s\n",
				transcript2.getStudent().getName(),
				transcript2.getCourse().getName(),
				transcript2.getGrade());
		
		Transcript transcript3 = new Transcript(student3, course2);
		transcript3.setGrade("A+");
		System.out.printf("%s %s %s\n",
				transcript3.getStudent().getName(),
				transcript3.getCourse().getName(),
				transcript3.getGrade());
	}
}
