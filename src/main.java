
public class main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("Umur");
		student1.setLastName("İslamoğlu");
		student1.setPhoneNumber("05424390000");
		student1.setEmail("umurislamoglu@gmail.com");
		student1.setCoursesTaken("java");
		student1.setCoursesFinished("-");
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.add(student1);
		studentManager.takeCourse(student1);
		
		
		Instructor instructor = new Instructor();
		instructor.setName("İde");
		instructor.setLastName("Tuğ");
		instructor.setPhoneNumber("05424390001");
		instructor.setEmail("idetug@gmail.com");
		instructor.setCoursesGiven("C#");
		
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.giveCourse(instructor);
		
	
		
	}

}
