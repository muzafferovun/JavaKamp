package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndividualCustomer engin=new IndividualCustomer();
		
		CorporateCustomer hepsiBurada=new CorporateCustomer();
		engin.CustomerNumber="sa32423423";
		hepsiBurada.CustomerNumber="m324242342243";
		SendikaCustomer sk=new SendikaCustomer();
		sk.CustomerNumber="s2323213";
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(hepsiBurada);
		customerManager.add(engin);
		customerManager.add(sk);
		customerManager.addMultiple(new Customer[] {hepsiBurada,engin,sk});
	}
}
