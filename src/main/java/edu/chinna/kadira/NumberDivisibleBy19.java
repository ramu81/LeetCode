package edu.chinna.kadira;

import static java.lang.Long.parseLong;
import static java.lang.System.out;

/**
 * A number is divisible by 19. extract the last digit of the number every time
 * add 2* to the extracted digit repeat the above process as long as necessary
 * 
 * @author Vasantha
 *
 */
public class NumberDivisibleBy19 {

	public static void main(String[] args) {
		out.println(isNumberDivisibleBy19("38"));
		out.println(isNumberDivisibleBy19("47"));
	}

	private static boolean isNumberDivisibleBy19(String num) {
		long tempVal = parseLong(num);
		while (tempVal >= 100) {
			int lastDigit = (int) (tempVal % 10);
			tempVal = lastDigit * 2 + tempVal / 10;
		}
		return tempVal % 19 == 0;
	}
}
