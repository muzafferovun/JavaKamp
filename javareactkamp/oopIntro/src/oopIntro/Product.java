package oopIntro;

public class Product {
	int id;
	String name;
	double unitPrice;
	String detail;
	double discount;
	
	public double getUnitPrice() {
		return unitPrice;
	}
	public double getlastPrice() {
		return this.unitPrice*(100-this.discount)/100;
	}
	
	Product(int pid,String pname,double punitprice,String pdetail){
		this.id=pid;
		this.name=pname;
		this.unitPrice=punitprice;
		this.detail=pdetail;
		this.discount=0;
	}
	Product(int pid,String pname,double punitprice,String pdetail,double discount){
		this.id=pid;
		this.name=pname;
		this.unitPrice=punitprice;
		this.detail=pdetail;
		this.discount=discount;
		
		
	}
	Product(){
		
	}
	
}
