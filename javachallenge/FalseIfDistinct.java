package javachallenge;

import java.util.Arrays;

public class FalseIfDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 1, 3,3,4,3,2,4,2 };
		int length = nums.length;
		Arrays.sort(nums);
		int count = 0;
		for (int i = 0; i < length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				count++;
			}
			if (count == 0) {
				System.out.println("False");
				break;
			} else {
				System.out.println("True");
				break;
			}
		}
	}
}
