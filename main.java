package ödev;

public class main {
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Ahmet");
		student1.setSurname("Örs");
		student1.setLevel(4);
		
		Student student2 = new Student(2,"emre", "korkmaz",3);
		
		Instructor instructor1= new Instructor();
		instructor1.setId(3);
		instructor1.setName("ozan");
		instructor1.setSurname("yılmaz");
		instructor1.setCertificate("İngilizce");
		
		Instructor instructor2 = new Instructor(4,"ferhat", "güler", "Fransızca");
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		studentManager.add(student1);
		studentManager.delete(student1);
		studentManager.registration(student1);
		
		System.out.println("------------");
		
		studentManager.add(student2);
		studentManager.delete(student2);
		studentManager.registration(student2);
		
		System.out.println("----------");
		
		instructorManager.add(instructor1);
		instructorManager.delete(instructor1);
		instructorManager.openClass(instructor1);
		
		System.out.println("------------");
		
		instructorManager.add(instructor2);
		instructorManager.delete(instructor2);
		instructorManager.openClass(instructor2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
