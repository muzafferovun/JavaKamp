package mustafakus_hafta3_odev2;

public class LessonManager {
	public Lesson[] createLessons() {
		Lesson[] lessons=new Lesson[100];
		int i=0;
		for(i=0;i<100;i++) {
			lessons[i]=new Lesson();
			
		}
		return lessons;
	}
}
