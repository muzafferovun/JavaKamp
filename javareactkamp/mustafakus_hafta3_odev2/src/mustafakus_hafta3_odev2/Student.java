package mustafakus_hafta3_odev2;

public class Student extends User {
	private String profile;
	Student(int id,String nickName,String name,String profile){
		this.setId(id);
		this.setNickName(nickName);
		this.setName(name);
		this.setProfile(profile);
		
	}

	public void showProfile() {
		super.showProfile();
		System.out.println("      Özgeçmiþ :"+this.getProfile());
		
	}

	
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
}
