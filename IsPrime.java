package week1.day1assignments;

public class IsPrime {

	public static void main(String[] args) {
	    int n = 41;
	    int rem=0;
	    if (n <= 1) {
	      System.out.println("The number"+n+" is not a prime number");
	      return;
	    }

	    for (int i = 1; i <= (n/2); i++) {
	      if (n % i == 0) {
	        rem++;
	      }
	    }
	    if (rem > 1) {
	        System.out.println("The input "+n+" is not a prime number");
	    }
	    else {
	      System.out.println("The input "+n+" is a prime number");
	    }
	}
}