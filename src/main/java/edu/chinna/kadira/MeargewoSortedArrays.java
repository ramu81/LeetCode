package edu.chinna.kadira;

import static java.util.Arrays.stream;
import static java.util.Collections.addAll;
import static java.util.Comparator.naturalOrder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/***
 * 
 * @author Vasantha
 *
 */
public class MeargewoSortedArrays {

	public static void main(String[] args) {
		Integer[] a = { 1, 5, 7 };
		Integer[] b = { 3, 15 };
		List<Integer> aList = new ArrayList<Integer>();
		addAll(aList, a);
		addAll(aList, b);
		Integer[] temp = aList.stream().toArray(Integer[]::new);
		bubbleSort(temp, naturalOrder());
		stream(temp).forEach(System.out::println);
	}

	private static <T> void bubbleSort(T[] a, Comparator<? super T> c) {
		int length = a.length;
		for (int i = 0; i < length; i++)
			for (int j = 0; j < length - i - 1; j++)
				if (c.compare(a[j], a[j + 1]) == 1)
					swap(a, j);
	}

	private static <T> void swap(T[] a, int j) {
		T temp = a[j];
		a[j] = a[j + 1];
		a[j + 1] = temp;
	}


}
