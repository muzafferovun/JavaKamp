package objectquee;

public class UserManager {
	public void addUser(User user,String name) {
			if(user.getId()==0) {
				User nuser=new User(1,name);
				user=nuser;
			}
			else addUser(user.getUser(),name);
	}
	public void listUser(User user) {
		User nuser=user;
		while(nuser!=null) {
			System.out.println(nuser.getId()+"->"+nuser.getName());
				nuser=nuser.getUser();
		}
		
	}
	
}
