package mustafakus_hafta3_odev2;

public class CourseStudent {
	private Course course;
	private int courseId;
	private int studentId;
	private Student student;
	CourseStudent(Course course, Student student,int courseId,int studentId) {
		this.course = course;
		this.student = student;
		this.courseId=courseId;
		this.studentId=studentId;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
}
