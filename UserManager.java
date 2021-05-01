package ödev;

public class UserManager {
	public void add(user user) {
		System.out.println("kullanýcý katýldý " + user.getName()+ " " +user.getSurname());
		
	}
	
	public void delete(user user) {
		System.out.println("kullanýcý ayrýldý " + user.getName()+ " " +user.getSurname());
		
	}

}
