package javachallenge;

public class SquareRoot {

	public static void main(String[] args) {
		int ip = 120, sqroot = 0, i = 0, temp = 1;
		if (ip == 0) {
			System.out.println("Square root of the given number " + ip + " is " + ip);
		} else {
			while (temp <= ip) {
				i++;
				temp = i * i;

			}
			sqroot = i - 1;
			System.out.println("Square root of the given number " + ip + " is " + sqroot);
		}
	}

}
