package edu.chinna.kadira;

import static java.lang.System.out;

/***
 * 
 * Given a sorted array arr[] of n elements, write a function to search a given
 * element x in arr[].
 * 
 * @author Vasantha
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		Integer[] aArr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91, 200, 345 };
		Integer anEle = 500;
		out.println(binarySearch(aArr, anEle));
	}

	private static int binarySearch(Integer[] pArr, Integer pEle) {
		int high = pArr.length;
		int low = 0;
		int mid = low + high >>> 1;

		while (mid < high) {
			boolean flag = mid == low || mid == high;
			Integer pivot = pArr[mid];
			if (pEle == pivot)
				return mid;
			else if (pEle < pivot) {
				high = mid;
				if (flag) {
					mid = -1;
					break;
				}
			} else {
				low = mid;
				if (flag) {
					mid = -1;
					break;
				}
			}

			mid = low + high >>> 1;
		}

		return mid;
	}

}
