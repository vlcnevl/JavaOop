
public class Instructor extends User{

	private String about;
	private Course[] courses;
	
	public Instructor(int id, String firstName, String lastName, String email, String password, String about,
			Course[] courses) {
		super(id, firstName, lastName, email, password);
		this.about = about;
		this.courses = courses;
	}
	
	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	
}
