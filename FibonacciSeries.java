package week1.day1assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=0;
int n2=1;
int sum;
System.out.println("Fibonacci Series");
System.out.print(n1+" "+n2+" ");
for(int i=1;i<10;i++)
{
	sum=n1+n2;

	System.out.print(sum+" ");
	n1=n2;
	n2=sum;
	}
	}
}
