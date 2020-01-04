package edu.chinna.kadira;

import static java.lang.System.out;
import static java.util.Objects.isNull;

/***
 * Write an efficient algorithm that searches for a value in an m x n matrix.
 * This matrix has the following properties:
 * 
 * Integers in each row are sorted in ascending from left to right. 
 * Integers in each column are sorted in ascending from top to bottom.
 * 
 * @author Vasantha
 *
 */
public class SearchMatrix {

	public static void main(String[] args) {

		int[][] matrix = { 
				{ 1, 4, 7, 11, 15 }, 
				{ 2, 5, 8, 12, 19 }, 
				{ 3, 6, 9, 16, 22 }, 
				{10,13, 14, 17,24},
				{18,21, 23, 26,30} };
		out.println(new SearchMatrix().searchMatrix(matrix, 16));
	}

	public boolean searchMatrix(int[][] matrix, int target) {

		if (isNull(matrix) || matrix.length == 0 || matrix[0].length == 0)
			return false;
		
		int n = matrix.length, m = matrix[0].length;
		int i = 0, j = m - 1;

		while (i < n && j >= 0) {
			int num = matrix[i][j];

			if (num == target)
				return true;
			else if (num < target)
				i++;
			else
				j--;
		}

		return false;

	}
}
