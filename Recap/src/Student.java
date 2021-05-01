
public class Student extends User{
	private Course[] takenCourses;
	private String[] courseProgress;
	
	public Student(int id, String firstName, String lastName, String email, String password,Course[] takenCourses) {
		super(id, firstName, lastName, email, password);
		
	}

	public Course[] getTakenCourses() {
		return takenCourses;
	}

	public void setTakenCourses(Course[] takenCourses) {
		this.takenCourses = takenCourses;
	}

	public String[] getCourseProgress() {
		return courseProgress;
	}

}
