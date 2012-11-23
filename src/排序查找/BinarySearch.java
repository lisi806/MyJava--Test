package ≈≈–Ú≤È’“;

import java.util.Arrays;

public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = new int[] { 0, 2 };
		for (int i = 0; i <= 5; i++) {
			int result = binarySearch0(a, 0, a.length, i);
			System.out.println(result);
//			System.out.println((-i)>>>2);
		}
	}

	private static int binarySearch0(int[] a, int fromIndex, int toIndex,
			int key) {
		int low = fromIndex;
		int high = toIndex - 1;

		while (low <= high) {
			int mid = (low + high) >>> 1;
			int midVal = a[mid];

			if (midVal < key)
				low = mid + 1;
			else if (midVal > key)
				high = mid - 1;
			else
				return mid; // key found
		}
		return -(low + 1); // key not found.
	}
}
