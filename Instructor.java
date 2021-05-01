package ödev;

public class Instructor extends user {
	
	private String Certificate;

	public Instructor(int id, String Name, String Surname, String Certificate) {
		super(id, Name, Surname);
		this.Certificate = Certificate;
		
	}

	public Instructor() {
		
	}

	public String getCertificate() {
		return Certificate;
	}

	public void setCertificate(String certificate) {
		Certificate = certificate;
	}
	
	
	}


