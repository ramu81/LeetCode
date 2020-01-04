package edu.chinna.kadira;

import static java.lang.Integer.parseInt;
import static java.lang.System.out;
/**
 * A number is divisible by 20, if it is divisible by 4 and 5. 
 * if a number is divisible by 4 by checking if last 2 digits are divisible by 4;
 * @author Vasantha
 *
 */
public class NumberDivisibleBy20 {

	public static void main(String[] args) {

		String temp = "90";

		int lastTwoDigits = parseInt(temp.substring(temp.length() - 2));

		if (lastTwoDigits % 5 == 0 && lastTwoDigits % 4 == 0) {
			out.println(" You are correct.... ");
		} else {
			out.println(" Grrrr ... no");
		}
	}

}
