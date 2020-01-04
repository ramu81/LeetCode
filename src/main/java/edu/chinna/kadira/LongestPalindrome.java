package edu.chinna.kadira;

import static java.lang.System.out;

public class LongestPalindrome {

	public static void main(String[] args) {
//		out.println(isLongestPalindrome("121"));
		out.println(isLongestPalindrome("kondapalliramuduudumar"));
	}

	private static String isLongestPalindrome(String s) {
		String result = "";
		int length = s.length();
		int len = 0;
		boolean[][] isPoly = new boolean[length][length];

		for (int j = 0; j < length; j++)
			for (int i = j; i >= 0; i--)
				if (s.charAt(i) == s.charAt(j) && (j - i < 2 || isPoly[i + 1][j - 1])) {
					isPoly[i][j] = true;
					if (j - i + 1 > len) {
						result = s.substring(i, j + 1);
						len = j - i + 1;
					}
				}

		return result;
	}
}
