package week1.day2assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Method 1
		int[] data = { 3, 2, 11, 4, 6, 7 };
		int length = data.length;
		Arrays.sort(data);
		System.out.println("Second Largest Element in the array is " + data[length - 2]);

		// Method 2
		int temp = 0;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; i < length; i++) {
				if (data[i] < data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;

				}
			}
		}
		System.out.println();
		System.out.println("Second Largest Element in the array is " + data[length - 2]);
	}
}
