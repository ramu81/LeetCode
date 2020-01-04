package edu.chinna.kadira;

import static java.lang.Integer.parseInt;
import static java.lang.System.out;

/**
 * A number is divisible by 75, if it is divisible by 3. if the sum of the digit
 * is divisible by 3 and divisible by 25(if the last two digit is divisible by
 * 25) both.
 * 
 * @author Vasantha
 *
 */
public class NumberDivisibleBy75 {

	public static void main(String[] args) {

		String temp = "175";
		
		int sumOfDigits = temp.chars().map(Character::getNumericValue).boxed().mapToInt(a -> a).sum();
		int lastTwoDigits = parseInt(temp.substring(temp.length() - 2));

		boolean flag = sumOfDigits % 3 == 0 && lastTwoDigits % 25 == 0;
		
		out.println("  Number Divisible By 75 :  " + flag);
	}

}
