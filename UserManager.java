package �dev;

public class UserManager {
	public void add(user user) {
		System.out.println("kullan�c� kat�ld� " + user.getName()+ " " +user.getSurname());
		
	}
	
	public void delete(user user) {
		System.out.println("kullan�c� ayr�ld� " + user.getName()+ " " +user.getSurname());
		
	}

}
