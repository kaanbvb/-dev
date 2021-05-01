package ödev;

public class Student extends user {
	private int level;
	
	
	
	public Student(int id,String Name,String Surname, int level) {
		super(id, Name, Surname);
		this.level= level;
		
	}
	
	public Student () {
		
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
		
}	

