package week1.day2assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		int length = arr.length;
		Arrays.sort(arr);

		for (int i = 0; i < length; i++) {
			if (arr[i] != i + 1) {
				System.out.println("Missing element in the array is " + (i + 1));
				break;
			}
		}
	}

}
