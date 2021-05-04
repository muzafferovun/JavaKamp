package mustafakus_hafta3_odev2;

public class Course {
	private int id;
	private String courseName;
	private Instructor instructor;
	private Lesson[] lesson;
	Course(int id, String courseName,Instructor instructor,Lesson[] lesson) {
		
		this.id = id;
		this.courseName = courseName;
		this.instructor=instructor;
		this.lesson=lesson;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public Lesson[] getLesson() {
		return lesson;
	}
	public void setLesson(Lesson[] lesson) {
		this.lesson = lesson;
	}
	
}
