package mustafakus_hafta3_odev2;



public class Lesson {
	private int id;
	private String name;
	private LessonProgram[] lessonPrograms;
	Lesson(){
		this.id=0;
		this.name="";
		this.lessonPrograms=new LessonProgram[]{
				new LessonProgram("", "",false)
				,new LessonProgram("", "",false)
				,new LessonProgram("", "",false)
				,new LessonProgram("", "",false)
				,new LessonProgram("", "",false)
				,new LessonProgram("", "",false)
				,new LessonProgram("", "",false)
				,new LessonProgram("", "",false)
				,new LessonProgram("", "",false)
				,new LessonProgram("", "",false)
			
		};
	
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LessonProgram[] getLessonPrograms() {
		return lessonPrograms;
	}
	public void setLessonPrograms(LessonProgram[] lessonPrograms) {
		this.lessonPrograms = lessonPrograms;
	}
	public Lesson(int id, String name, LessonProgram[] lessonPrograms) {
		super();
		this.id = id;
		this.name = name;
		this.lessonPrograms = lessonPrograms;
	}
	
}
