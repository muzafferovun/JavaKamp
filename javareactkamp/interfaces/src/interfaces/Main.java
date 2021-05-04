package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoggerManager loggerManager=new LoggerManager();
		Customer customer1=new Customer(1,"Muzaffer","Övün");
		CustomerManager customerManager=new CustomerManager(loggerManager.log("Customer"));
		customerManager.add(customer1);
	}

}
