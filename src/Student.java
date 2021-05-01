
public class Student extends User {
	

	private String coursesTaken;
	private String CoursesFinished;
	
	
	
	public Student() {
		super();
		
	}



	public Student(String name, String lastName, String phoneNumber, String email, String coursesTaken,
			String coursesFinished) {
		super(name, lastName, phoneNumber, email);
		this.coursesTaken = coursesTaken;
		this.CoursesFinished = coursesFinished;
	}



	public String getCoursesTaken() {
		return coursesTaken;
	}



	public void setCoursesTaken(String coursesTaken) {
		this.coursesTaken = coursesTaken;
	}



	public String getCoursesFinished() {
		return CoursesFinished;
	}



	public void setCoursesFinished(String coursesFinished) {
		CoursesFinished = coursesFinished;
	}
	
}
