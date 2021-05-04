package mustafakus_hafta3_odev2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instructor[] instructor= {
				new Instructor(1, "enginDemirog", "Engin Demiro�", "Halk BAnk")
				,new Instructor(2, "mustafaKus", "Mustafa KU�", "CISCO,Oryantring")
			};
		Course[] course=new Course[100];
		CourseManager courseManager=new CourseManager();
		int courseId=courseManager.createNewCourse(course,"React + Java",instructor[0]);
		courseManager.addLesson(course[courseId], "1. G�n 21 Nisan 2021"
				,new LessonProgram[] {
						new LessonProgram("Ders Program�","JAVA ile nesne y�nelimli programlamada uzmanla�ma 1\n At�lye �al��malar� (Workshop)\n �devlerin verilmesi\n Quiz sistemine y�nlendirme",true)
						,new LessonProgram("1.G�n Sonu Kay�t","Ders Yoklama",false)
						,new LessonProgram("�dev1","�dev bilgileri",false)
						,new LessonProgram("�dev2","�dev bilgileri",false)
						
				}
		);
		courseManager.addLesson(course[courseId], "2. G�n"
				,new LessonProgram[] {
						new LessonProgram("Ders Program�","JAVA ile nesne y�nelimli programlamada uzmanla�ma 1\n At�lye �al��malar� (Workshop)\n �devlerin verilmesi\n Quiz sistemine y�nlendirme",true)
						,new LessonProgram("2.G�n Sonu Kay�t","Ders Yoklama",false)
						,new LessonProgram("�dev2","�dev bilgileri",false)
						,new LessonProgram("�dev2","�dev bilgileri",false)
						
				}
		);

		 courseId=courseManager.createNewCourse(course,"c# + Angular",instructor[1]);
		courseManager.addLesson(course[courseId], "1. G�n 12 Aral�k 2020"
				,new LessonProgram[] {
						new LessonProgram("Ders Program�","c#temelleri",true)
						,new LessonProgram("1.G�n Sonu Kay�t","Ders Yoklama",false)
						,new LessonProgram("�dev1","�dev bilgileri",false)
						,new LessonProgram("�dev2","�dev bilgileri",false)
						
				}
		);
		courseManager.addLesson(course[courseId], "2. G�n"
				,new LessonProgram[] {
						new LessonProgram("Ders Program�","Angular nedir?",true)
						,new LessonProgram("2.G�n Sonu Kay�t","Ders Yoklama",false)
						,new LessonProgram("�dev2","�dev bilgileri",false)
						,new LessonProgram("�dev2","�dev bilgileri",false)
						
				}
		);

		
		Student[] students= {
				new Student(3,"WEbCoder","Emrah Bayram","Computer Systems Teacher")
				,new Student(4,"kayserili38","Halil �brahim Baykoca","Electric and Electronic Tecknolgys Teacher")
				,new Student(5,"MesutOzer","Mesut K�rl�","Gazi �niversitesi Mezunu")
				,new Student(6,"Ahmet14","Ahmet �zdemir","Personel Sports Trainer")
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
