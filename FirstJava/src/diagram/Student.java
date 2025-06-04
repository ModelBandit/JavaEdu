package diagram;

import java.util.Vector;

public class Student {
	private String name;
	private Vector<Transcript> vTranscript;
	
	public Student(String name) {
		this.name = name;
		vTranscript = new Vector<Transcript>();
	}
	
	public void addTranscript(Transcript transcript) {
		vTranscript.add(transcript);
	}
	
	public Vector<Course> getCourses(){//
		Vector<Course> vCourse = new Vector<Course>();
		
		for(int i = 0; i < vTranscript.size(); ++i) {
			vCourse.add(vTranscript.get(i).getCourse());
		}
		
		return vCourse;
	}
	
	public String getName() {
		return name;
	}
}
