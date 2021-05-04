package mustafakus_hafta3_odev2;

import static java.util.Objects.isNull;

public class StudentManager {
	public void listStudents(Student[] students) {
		int i;
		boolean studentKontrol=false;
		for(i=0;i<students.length;i++) {
			if(isNull(students[i].getName())) {
				break;
			}
			else {
				if(studentKontrol==false) {
					System.out.println(" Öğrenci Listesi");
					studentKontrol=true;
				}
				System.out.println("   "+students[i].getName()+" ( "+students[i].getProfile()+" ) ");
			}
		}
		
	}
}
