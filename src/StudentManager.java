
public class StudentManager extends UserManager {
	public void takeCourse(Student student) {
		System.out.println("Course taken :"+student.getCoursesTaken());
	}
	public void finishedCourse(Student student) {
		System.out.println("Course taken :"+student.getCoursesFinished());
	}
}
