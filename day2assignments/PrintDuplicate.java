package week1.day2assignments;

import java.util.Arrays;

public class PrintDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Method 1
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int length = arr.length;
		Arrays.sort(arr);
		for (int i = 0; i < length; i++) {
			int count = 0;
			for (int j = i + 1; j < length - 1; j++) {
				if (arr[i] == arr[j]) {
					count++;
					System.out.print(arr[i] + " ");
				}
			}
		}
	}
}