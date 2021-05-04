package mustafakus_hafta3_odev2;

public class User {
	private int id;
	private String nickName;
	private String name;
	public int getId() {
		return id;
	}
	
	public void showProfile() {
	
		System.out.println("Kullanýcý Bilgileri");
		
		System.out.println("      nickName :"+this.getNickName());
		System.out.println("      Name :"+this.getName());
		
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
