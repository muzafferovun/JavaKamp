package mustafakus_hafta3_odev2;

public class LessonProgram {
	private String name;
	private boolean activate;
	LessonProgram(String name, String content,boolean activate) {
		
		this.name = name;
		this.content = content;
		this.activate=activate;
	}
	private String content;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isActivate() {
		return activate;
	}
	public void setActivate(boolean activate) {
		this.activate = activate;
	}
	
}
