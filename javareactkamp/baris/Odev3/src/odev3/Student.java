
package odev3;

public class Student extends UserManager{
    
    int id=1;
    String username="Barış";
    String password="1234";
    String okul="Kodlama.io";
    String sertifika="JAVA REACT";
    
    
    public void user(){
        
        System.out.println(this.id+ " nolu "+this.username+" isimli ÖĞRENCİ sisteme giriş yaptı.");
    }
    
}
