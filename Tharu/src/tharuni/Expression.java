package tharuni;

import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int length ,breadth ,height;
		int totalArea,volume;
		System.out.println("enter values length,breadth,height");
		length=sc.nextInt();
		breadth=sc.nextInt();
		height=sc.nextInt();
		
		totalArea=2*(length*breadth+length*height+breadth*height);
		volume=length*breadth*height;
		
		System.out.println("totalArea is"+totalArea);
		System.out.println("volume is "+volume);
		//
//
	}

}
