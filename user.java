package ödev;

public class user {
	
	private int id;
	private String Name;
	private String Surname;
	
	
	
	public user(int id, String Name, String Surname) {
		super();
		this.id=id;
		this.Name=Name;
		this.Surname=Surname;
	}
	
	public user() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}
	
}



	

	
	
	
	
	
	