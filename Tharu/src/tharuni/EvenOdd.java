package tharuni;
import java.util.*;

public class EvenOdd {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		double a=sc.nextDouble();
		
		if(a%2==0) {
			System.out.println("is even");
		
		}
		else {
			System.out.println("is odd");
		}
	}

}
