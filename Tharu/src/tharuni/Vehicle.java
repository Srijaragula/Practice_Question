package tharuni;

import java.util.Scanner;

public class Vehicle {

	public static void main(String[] args) {
		float base,height,area;
		System.out.println("Enter base and height");
		Scanner sc=new Scanner(System.in);
		base=sc.nextFloat();
		height=sc.nextFloat();
		
		area=base*height/2;
		
		System.out.println("area of the triangle is"+area);
	}

}
