package tharuni;
import java.utii.*;
import java.util.Scanner;


public class Pyramidpattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("pattern height");
		int n= sc.nextInt();
		
		for(int i = n;i>=1; i--) {
			//print spaces
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
				//print numbers
			
			}
			for(int k=1;k<= (2*i-1);k++) {
				System.out.print("*");
			}
			//print next line
			System.out.println();
		}

	}

}
