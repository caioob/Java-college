package a1;

public class Assigment1Task2 {
	public static void main(String[] args) {
		boolean lockers [] = new boolean[100];
		int student = 1;
		System.out.println("True = opened locker || False = closed locker");
		while (student < 100) {
			openLockers(lockers, student);
			student++;
		}
		for(int i = 0; i < lockers.length; i++) {
			if(lockers[i] == true) {
				System.out.println("Locker " + (i + 1) + ": Open!");
			}
			else {
				System.out.println("Locker " + (i + 1) + ": Closed!");
			}
			
		}
	}
	
	public static void openLockers(boolean [] lock, int student ) {
		for (int  i = student - 1; i < lock.length; i++) {
			if(lock[i] == true) {
				lock[i] = false;
			}
			else {
				lock[i] = true;
			}
		}
	}
}
