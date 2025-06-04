package diagram;

import java.util.Vector;

public class Course {
	private String name;
	private Vector<Transcript> vTranscript;
	
	public Course(String name) {
		this.name = name;
		vTranscript = new Vector<Transcript>();
	}
	
	public void addTranscript(Transcript transcript) {
		vTranscript.add(transcript);
	}
	
	public String getName() {
		return name;
	}
	
	public Vector<Student> getStudents() {//혹시나
		Vector<Student> vStudent = new Vector<Student>();
		
		for(int i = 0; i < vTranscript.size(); ++i) {
			vStudent.add(vTranscript.get(i).getStudent());
		}
		
		return vStudent;
	}
}
