
package odev3;

public class Teacher extends UserManager{
    
    int id=1;
    String username="Santeros";
    String password="1234";
    String alan="JAVA Geliştiricisi";
    
    public void user(){
        
        System.out.println(this.id+" nolu "+this.username+" isimli EĞİTMEN sisteme giriş yaptı.");
        
    }
    
    
}
