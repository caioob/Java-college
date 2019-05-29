package assignment2;

public class Assignment2_task1 {

	public static void main(String[] args) {
		myDate b = new myDate();
		myDate a = new myDate(561555550000L);//
		System.out.println("============================");
		System.out.println("Testing no arg constructor");
		System.out.println("============================");
		System.out.println("day: " + b.returnDay());
		System.out.println("month: " + b.returnMonth());
		System.out.println("year: " + b.returnYear());
		System.out.println("============================");
		System.out.println("Testing 1 arg constructor");
		System.out.println("============================");
		System.out.println("day: " + a.returnDay());
		System.out.println("month: " + a.returnMonth());
		System.out.println("year: " + a.returnYear());
		System.out.println("============================");
		System.out.println("Testing setDate()");
		System.out.println("============================");
		b.setDate(561555550000L);
		System.out.println("day: " + b.returnDay());
		System.out.println("month: " + b.returnMonth());
		System.out.println("year: " + b.returnYear());
		System.out.println("============================");
	}
}
