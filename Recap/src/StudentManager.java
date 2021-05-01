
public class StudentManager extends UserManager{
	@Override
	public void add(User user)
	{
		System.out.println("Added Student"+ user.getEmail());
	}
	
	public void getMyCourse(Student student)
	{
		System.out.println("My courses");
		for(Course course :student.getTakenCourses())
		{
			System.out.println(course.getCourseName());
		}
	}
	
	public void setMyCourse(Student student,Course[] courses)
	{
		student.setTakenCourses(courses);
	}

	public void doHomeWork()
	{
		System.out.println("Homework done!");
	}
}
