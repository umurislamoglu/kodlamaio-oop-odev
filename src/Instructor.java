
public class Instructor extends User {
	private String coursesGiven;

	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Instructor(String name, String lastName, String phoneNumber, String email, String coursesGiven) {
		super(name, lastName, phoneNumber, email);
		this.coursesGiven = coursesGiven;
	}

	public String getCoursesGiven() {
		return coursesGiven;
	}

	public void setCoursesGiven(String coursesGiven) {
		this.coursesGiven = coursesGiven;
	}
}
