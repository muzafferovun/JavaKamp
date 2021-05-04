package mustafakus_hafta3_odev2;

import static java.util.Objects.isNull;

public class CourseStudentManager {
	public void addCourseStudent(CourseStudent[] courseStudent, Course[] course,int courseId,Student[] student,int studentId) {
		int lastCourseStudentNumber=0;
		int i;
		int courseIdNumber=0;
		int studentIdNumber=0;
		for(i=0;i<course.length;i++) {
			if(isNull(course[i])) {
				break;
			}
			else {
				if(course[i].getId()==courseId) {
					courseIdNumber=i;
				}
			}
		}
		for(i=0;i<student.length;i++) {
			if(isNull(student[i].getName())) {
				break;
			}
			else {
				if(student[i].getId()==studentId) {
					studentIdNumber=i;
				}
			}
		}
		
		
		for(i=0;i<courseStudent.length;i++) {
			if(isNull(courseStudent[i])) {
				lastCourseStudentNumber=i;
				break;
			}
			else {
				
			}
		}
		
			courseStudent[lastCourseStudentNumber]=new CourseStudent(course[courseIdNumber],student[studentIdNumber],courseId,studentId);
		
	
		
		
	}
	public void listStudents(CourseStudent[] courseStudent,int courseid) {
		int i;
		int courseIdNumber=-1;
		boolean studentKontrol=false;
		for(i=0;i<courseStudent.length;i++) {
			if(isNull(courseStudent[i])) {
				break;
			}
			else {
				if(courseStudent[i].getCourseId()==courseid) {
					if(studentKontrol==false) {
						System.out.println(courseStudent[i].getCourse().getCourseName()+" Katılımcı Listesi");
						studentKontrol=true;
					}
					System.out.println("         "+courseStudent[i].getStudent().getName()+" ( "+courseStudent[i].getStudent().getProfile()+" )");
				}
			}
		}
	}
}
