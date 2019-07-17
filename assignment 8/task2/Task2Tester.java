package task2;

import java.util.Scanner;

public class Task2Tester {

	public static void main(String[] args) {
		CountriesStates a = new CountriesStates();
		Scanner input = new Scanner(System.in);
		System.out.print("Insert the state you want to find the capital: ");
		String capitalInput = input.next();
		String result = a.findCapital(capitalInput);
		if(result != null) {
			System.out.println(capitalInput +"'s capital is: "+result);
		}
		else {
			System.out.println("State not found");
		}
		
		input.close();
		
	}

}
