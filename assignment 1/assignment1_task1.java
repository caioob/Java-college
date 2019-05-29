import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {
		Scanner ccInput = new Scanner(System.in);
		System.out.println("Please insert a valid credit card number:");
		long ccNumber = ccInput.nextLong();
		boolean valid = isValid(ccNumber);
		if(valid == true) {
			System.out.println( ccNumber+" IS VALID!!");
		}
		else {
			System.out.println( ccNumber+" IS INVALID!!");
		}
		
		
		/*testing methods
		int a = sumOfDoubleEvenPlace(ccNumber);
		System.out.println(a);
		int b = sumOfOddPlace(ccNumber);
		System.out.println(b);
		int c = getSize(ccNumber);
		System.out.println(c);
		long d = getPrefix(ccNumber, 1);
		System.out.println(d);
		System.out.println(isValid(ccNumber));
		*/
;		
	}
	
	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		long check = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
		int preFixSize = 0;
		if((getPrefix(number, 2) % 10) != 0 && getPrefix(number, 2) == 37){
			preFixSize = 2;
		}
		else {
			preFixSize = 1;
		}
		if ((check % 10 == 0) && prefixMatched(number, preFixSize) == true && getSize(number) >= 13 && getSize(number) <= 16) {
			return true;
		}
		else return false;
	}
	
	/**Return this number if it is a single digit, otherwise,* return the sum of the two digits */
	public static int getDigit(int number) {
		if(number <= 9) {
			return number;
		}
		else {
			int first = number%10;
			int second = number/10;
			return first+second;
		}
	}

	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
        long result = 0, temp = 0;
        while(number > 0) {
        	temp = number % 100;
			result += getDigit((int) ((temp / 10) * 2));//add if 2 digits	
			number = number / 100;
        }
        return (int)result;
	}
	
	
	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {
		long temp = 0;
		while(number > 0) {
			temp += number % 10;
			number = number / 100;
		}
		return (int) temp;
	}
	
	/** Return the number of digits in d */
	public static int getSize(long d) {
		int count = 0;
		while(d > 0) {
			d = d/10;
			count++;
		}
		return count;
	}
	
	/** Return the first k number of digits from number. If the* number of digits in number is less than k, return number. */
	public static long getPrefix(long number, int k) {
		if(getSize((int)number) > k) {
			return k;
		}
		else {
            int size = (int) getSize(number);
            for (int i = 0; i < (size - k); i++) {
                number = number / 10;
            }
            return number;
		}
	}
	
	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		long preFix = getPrefix(number, d);
		if(preFix == 4 || preFix == 5 || preFix == 37 || preFix == 6) {
			return true;
		}
		else {
			return false;
		}
	}
}
