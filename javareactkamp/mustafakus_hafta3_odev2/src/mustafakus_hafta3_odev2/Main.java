package mustafakus_hafta3_odev2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instructor[] instructor= {
				new Instructor(1, "enginDemirog", "Engin Demiroð", "Halk BAnk")
				,new Instructor(2, "mustafaKus", "Mustafa KUÞ", "CISCO,Oryantring")
			};
		Course[] course=new Course[100];
		CourseManager courseManager=new CourseManager();
		int courseId=courseManager.createNewCourse(course,"React + Java",instructor[0]);
		courseManager.addLesson(course[courseId], "1. Gün 21 Nisan 2021"
				,new LessonProgram[] {
						new LessonProgram("Ders Programý","JAVA ile nesne yönelimli programlamada uzmanlaþma 1\n Atölye çalýþmalarý (Workshop)\n Ödevlerin verilmesi\n Quiz sistemine yönlendirme",true)
						,new LessonProgram("1.Gün Sonu Kayýt","Ders Yoklama",false)
						,new LessonProgram("Ödev1","Ödev bilgileri",false)
						,new LessonProgram("Ödev2","ödev bilgileri",false)
						
				}
		);
		courseManager.addLesson(course[courseId], "2. Gün"
				,new LessonProgram[] {
						new LessonProgram("Ders Programý","JAVA ile nesne yönelimli programlamada uzmanlaþma 1\n Atölye çalýþmalarý (Workshop)\n Ödevlerin verilmesi\n Quiz sistemine yönlendirme",true)
						,new LessonProgram("2.Gün Sonu Kayýt","Ders Yoklama",false)
						,new LessonProgram("Ödev2","Ödev bilgileri",false)
						,new LessonProgram("Ödev2","ödev bilgileri",false)
						
				}
		);

		 courseId=courseManager.createNewCourse(course,"c# + Angular",instructor[1]);
		courseManager.addLesson(course[courseId], "1. Gün 12 Aralýk 2020"
				,new LessonProgram[] {
						new LessonProgram("Ders Programý","c#temelleri",true)
						,new LessonProgram("1.Gün Sonu Kayýt","Ders Yoklama",false)
						,new LessonProgram("Ödev1","Ödev bilgileri",false)
						,new LessonProgram("Ödev2","ödev bilgileri",false)
						
				}
		);
		courseManager.addLesson(course[courseId], "2. Gün"
				,new LessonProgram[] {
						new LessonProgram("Ders Programý","Angular nedir?",true)
						,new LessonProgram("2.Gün Sonu Kayýt","Ders Yoklama",false)
						,new LessonProgram("Ödev2","Ödev bilgileri",false)
						,new LessonProgram("Ödev2","ödev bilgileri",false)
						
				}
		);

		
		Student[] students= {
				new Student(3,"WEbCoder","Emrah Bayram","Computer Systems Teacher")
				,new Student(4,"kayserili38","Halil Ýbrahim Baykoca","Electric and Electronic Tecknolgys Teacher")
				,new Student(5,"MesutOzer","Mesut Kýrlý","Gazi Üniversitesi Mezunu")
				,new Student(6,"Ahmet14","Ahmet Özdemir","Personel Sports Trainer")
		};
		CourseStudent[] courseStudent=new CourseStudent[10000];
		CourseStudentManager courseStudentManager=new CourseStudentManager();
		courseStudentManager.addCourseStudent(courseStudent, course,1, students,4);
		courseStudentManager.addCourseStudent(courseStudent, course,1, students,3);
		courseStudentManager.addCourseStudent(courseStudent, course,1, students,6);
		courseStudentManager.addCourseStudent(courseStudent, course,2, students,4);
		courseStudentManager.addCourseStudent(courseStudent, course,2, students,5);
		StudentManager studentManager=new StudentManager();
		courseManager.listCourses(course);
		studentManager.listStudents(students);
		courseManager.courseProgramShow(course[courseId]);
		courseStudentManager.listStudents(courseStudent, 1);
		
	}

}
