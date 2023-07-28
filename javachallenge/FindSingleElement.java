package javachallenge;

public class FindSingleElement {

	static void printDistinctValues(int arr[], int len) {
		for (int i = 0; i < len; i++) {

			int count = 0;
			for (int j = 0; j < len; j++)
				if (arr[i] == arr[j]) {
					count++;
				}

			if (count == 1) {
				System.out.print(arr[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		int iparr[] = { 1, 3, 5, 2, 9, 10, 2, 1, 3 };
		int length = iparr.length;
		System.out.println("Input array");
		for (int i = 0; i < length; i++)
			System.out.print(iparr[i] + " ");
		System.out.println();
		System.out.println("Below elements are present once in the input array");
		printDistinctValues(iparr, length);
	}
}