package diagram;


public class Transcript {
	private Student student;
	private Course course;
	private String date;
	private String grade;
	
	public Transcript(Student student, Course course) {
		
		this.student = student;
		this.course = course;
		student.addTranscript(this);
		course.addTranscript(this);
	}
	
	public Student getStudent() {
		return student;
	}
	
	public Course getCourse() {
		return course;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
