package ödev;

public class StudentManager extends UserManager {
	public void registration(Student student) {
		System.out.println("kayıt tamamlandı " + student.getName()+ " " + student.getSurname());
		
	}

}
