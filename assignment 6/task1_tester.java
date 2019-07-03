package assignment_6;

import java.io.IOException;

public class task1_tester {

	public static void main(String[] args) throws IOException {
		Account [] a = new Account[11];
		for(int i = 1; i <= 10; i++) {
			a[i] = new Account(i, 100);
		}
	}

}
