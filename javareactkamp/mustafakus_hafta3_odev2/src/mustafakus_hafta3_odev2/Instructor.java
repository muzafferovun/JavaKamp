package mustafakus_hafta3_odev2;

public class Instructor extends User {
	private String experiance;
	
		Instructor(int id,String nickName,String name,String experiance){
			this.setId(id);
			this.setNickName(nickName);
			this.setName(name);
			this.setExperiance(experiance);
			
		}
	public String getExperiance() {
			return experiance;
		}
		public void setExperiance(String experiance) {
			this.experiance = experiance;
		}
	public void showProfile() {
		super.showProfile();
		System.out.println("Deneyim");
		
		System.out.println("      Experiance :"+this.getExperiance());
		
	}

}
