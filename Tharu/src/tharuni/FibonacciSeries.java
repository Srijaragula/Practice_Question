package tharuni;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how may terms");
		int count=sc.nextInt();
		int a=0,b=1;
		
		System.out.println("Fibonacci");
		for(int i=0;i<count;i++) {
			System.out.println(a+ " ");
			int next=a+b;
			a=b;
			b=next;
			
			
			
		}
			
		

	}

}
