package edu.chinna.kadira;

/**
 * A number is divisible by 13, if and only if the number obtained by adding
 * last digit multiplied by 4 to rest is also divisible by 13. Eg : 2353
 * 
 * @author Vasantha
 *
 */
public class NumberDivisibleBy9 {

	public static void main(String[] args) {
		String temp = "83959092724";
		char[] tmpCharArr = temp.toCharArray();
		int aVal = 0;
		int bVal = 0;
		int actVal = 0;
		for (int i = (tmpCharArr.length - 1); i >= 0; i--) {
			int digit = Character.getNumericValue(tmpCharArr[i]);
			actVal = (digit + bVal) * 4;
			aVal = (actVal) / 10;
			bVal = (actVal) % 10;
			System.out.println(actVal + " " + aVal+ "  " + bVal);
		}
	}

}
