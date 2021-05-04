package interfaces;

public class CustomerManager {
	private Logger[] loggers;
	public CustomerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}
	public void add(Customer customer) {
		System.out.println("Müþteri Eklendi");
		Utils.RunLoggers(loggers,customer.getFirstName()+" Eklendi");
	}
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi");
		Utils.RunLoggers(loggers,customer.getFirstName()+" Silindi");
	}
}
