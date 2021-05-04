package mustafakus_hafta3_odev2;
import static java.util.Objects.isNull;
public class CourseManager {
	public int newCourseNumber(Course[] course) {
		int lastCourseNumber=0;
		int i;
		for(i=0;i<course.length;i++) {
			if(isNull(course[i])) {
				lastCourseNumber=i;
				break;
			}
		}
		return lastCourseNumber;
	}
	public int createNewCourse(Course[] course,String courseName,Instructor instructor) {
		int lastCourseNumber=newCourseNumber(course);
		LessonManager lessonManager=new LessonManager();
		Lesson[] lesson=lessonManager.createLessons();
		course[lastCourseNumber]=new Course(lastCourseNumber,courseName,instructor,lesson);
		return lastCourseNumber;
	}
	public void addLesson(Course course,String lessonName,LessonProgram[] lessonProgram) {
		int lastLessonNumber=0;
		int i;
		for(i=0;i<course.getLesson().length;i++) {
			if(course.getLesson()[i].getName()=="") {
				lastLessonNumber=i;
				break;
			}
		}
		course.getLesson()[lastLessonNumber].setId(lastLessonNumber);
		course.getLesson()[lastLessonNumber].setName(lessonName);
		for(i=0;i<lessonProgram.length;i++) {
			course.getLesson()[lastLessonNumber].getLessonPrograms()[i].setName(lessonProgram[i].getName());
			course.getLesson()[lastLessonNumber].getLessonPrograms()[i].setContent(lessonProgram[i].getContent());
		}
		
	}
	public void courseProgramShow(Course course) {
		System.out.println(course.getCourseName());
		int i,j;
		for(i=0;i<course.getLesson().length;i++) {
			if(course.getLesson()[i].getName()=="") {
				
			}
			else {
				System.out.println("  "+course.getLesson()[i].getName());
				for(j=0;j<course.getLesson()[i].getLessonPrograms().length;j++) {
					if(course.getLesson()[i].getLessonPrograms()[j].getName()=="") {
						
					}
					else {
						System.out.println("       "+course.getLesson()[i].getLessonPrograms()[j].getName());
						
					}
				}
				
			}
		}
		
	}
	public void listCourses(Course[] course) {
		int i;
		boolean courseKontrol=false;
		for(i=0;i<course.length;i++) {
			if(isNull(course[i])) {
				break;
			}
			else {
				if(courseKontrol==false) {
					System.out.println(" Kurs Listesi");
					courseKontrol=true;
				}
				System.out.println("   "+course[i].getCourseName()+" ( "+course[i].getInstructor().getName()+" ) ");
			}
		}
		
	}
	
}
