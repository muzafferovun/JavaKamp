package objectquee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserManager userManager=new UserManager();
		User users=new User();
		userManager.addUser(users, "ali");
		userManager.addUser(users, "ali");
		userManager.addUser(users, "ali");
		userManager.addUser(users, "ali");
		userManager.addUser(users, "ali");
		userManager.listUser(users);
	}

}
