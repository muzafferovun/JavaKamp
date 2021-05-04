package inheritance2;

public class Main {
	public static void main(String[] args) {

		CustomerManager cm=new CustomerManager();
		EmailLogger emailLogger=new EmailLogger();
		cm.add(emailLogger);
		
	}

}
