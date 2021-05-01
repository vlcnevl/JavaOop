
public class Main {

	public static void main(String[] args) {
		
		Course cCourse = new Course(1,"C# course");
		Course javaCourse = new Course(2,"Java course");
		
		 Course[] courses = {cCourse, javaCourse};
		
		 Student student = new Student(1,"Veli","Can","veli@gmail.com","123",courses);
		 Instructor instructor = new Instructor(1,"Yiğit","bozkurt","yigit@gmail.com","123","Explanation",courses);
		 
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.login(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.login(instructor);
		
		studentManager.setMyCourse(student,courses);
		
		studentManager.getMyCourse(student);
		
	}

}
