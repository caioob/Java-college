package assignment2;


public class assignment2_task2 {
	public static void main(String[] args) {
		Person people = new Person("John", "Sun street", "1234567891", "a@b.com");
		System.out.println("Testig Testig toString() in Person");
		System.out.println(people);
		System.out.println("_____________________________" );
		Student stu = new Student("George", "Moon street", "1234567891", "b@c.com", "freshman");
		System.out.println("Testig toString() in Student");
		System.out.println(stu);
		Employee emp = new Employee("John", "Star street", "1234567891", "c@d.com", "Downtown", 1000, 561555550000L);
		System.out.println("_____________________________" );
		System.out.println("Testig toString() in Employee");
		System.out.println(emp);
		Faculty fac = new Faculty("Ana", "Mars street", "1234567891", "d@e.com", "Downtown", 1000, 561555550000L, 7, "A+");
		System.out.println("_____________________________" );
		System.out.println("Testig toString() in Faculty");
		System.out.println(fac);	
		Staff sta = new Staff("John", "Jupiter street", "1234567891", "e@f.com", "Downtown", 1000, 561555550000L, "Manager");
		System.out.println("_____________________________" );
		System.out.println("Testig toString() in Staff");
		System.out.println(sta);
		System.out.println("_____________________________" );
	}
}
