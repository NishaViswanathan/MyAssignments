package javachallenge;

public class FindHappyNumber {

	public static int isHappyNum(int n) {
		int rem = 0, sum = 0;
		while (n > 0) {
			rem = n % 10;
			sum += rem * rem;
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int input = 23, happynum = input;

		while (happynum != 1 && happynum != 4) {
			happynum = isHappyNum(happynum);
		}
		if (happynum == 1) {
			System.out.println(input + " is a happy number");
		}
		else if (happynum == 4) {
			System.out.println(input + " is not a happy number");
		}

	}
}
