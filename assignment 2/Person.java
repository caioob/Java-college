package assignment2;

public class Person {
	String name, address, phone, email;

	Person(String name_, String address_, String phone_, String email_){
		name = name_;
		address = address_;
		phone = phone_;
		email = email_;
	}
	
	public String toString() {
		return "Person " + name;
	}
}

/*------------------------student----------------*/	
class Student extends Person{
	String status;
	Student(String name_, String address_, String phone_, String email_, String status_) {
		super(name_, address_, phone_, email_);
		status = status_;
	}
	public String toString() {
		return "Student " + name;
	}
}


/*------------------------employee----------------*/	
class Employee extends Person{
	String office;
	long salary;
	myDate hired;
	Employee(String name_, String address_, String phone_, String email_, String office_, long salary_, long date) {
		super(name_, address_, phone_, email_);
		salary = salary_;
		hired = new myDate(date);
	}
	
	public String toString() {
		return "Employee " + name;
	}
}

class Faculty extends Employee{
	int officeHours;
	String rank;
	Faculty(String name_, String address_, String phone_, String email_, String office_, long salary_, long date, int officeHours_, String rank_) {
		super(name_, address_, phone_, email_, office_, salary_, date);
		officeHours = officeHours_;
		rank = rank_;
	}
	
	public String toString() {
		return "Faculty " + name;
	}
}

class Staff extends Employee{
	String title;
	Staff(String name_, String address_, String phone_, String email_, String office_, long salary_, long date, String title_) {
		super(name_, address_, phone_, email_, office_, salary_, date);
		title = title_;
	}
	
	public String toString() {
		return "Staff " + name;
	}
}

