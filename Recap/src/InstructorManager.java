
public class InstructorManager extends UserManager {
	@Override
	public void add(User user) {
		super.add(user);
		System.out.println("Added Instructor!");
	}
	public void addCourse(Instructor instructor, Course course) {
		System.out.println("Added Course " +instructor.getEmail() + " " + course.getCourseName() );
	}
	public void addMultipleCourse(Instructor instructor, Course[] courses) {
		for (Course course : courses) {
			addCourse(instructor, course);
		}
	}
	public void deleteCourse(Instructor instructor, Course course) {
		System.out.println("Deleted Course  "+instructor.getEmail()+" "+course.getCourseName());
	}

}
