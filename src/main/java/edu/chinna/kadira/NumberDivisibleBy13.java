package edu.chinna.kadira;

import static java.lang.Long.parseLong;
import static java.lang.System.out;

/**
 * A number is divisible by 13. extract the last digit of the number every time
 * add 4* to the extracted digit repeat the above process as long as necessary
 * 
 * @author Vasantha
 *
 */
public class NumberDivisibleBy13 {

	public static void main(String[] args) {
		out.println(isNumberDivisibleBy13("2353"));
		out.println(isNumberDivisibleBy13("2911285"));
	}

	private static boolean isNumberDivisibleBy13(String num) {
		long tempVal = parseLong(num);
		while (tempVal >= 100) {
			int lastDigit = (int) (tempVal % 10);
			tempVal = lastDigit * 4 + tempVal / 10;
		}
		return tempVal % 13 == 0;
	}
}
