package tharuni;
import java.util.Scanner;
public class Element {

	public static void main(String[] args) {
////		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a array");
	int num=sc.nextInt();
	int [] arr=new int[6];
	

	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		arr[i]=sc.nextInt();
	}
	System.out.println("array elements are");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}

}

//import java.util.Scanner;
//
//public class Element {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter array size: ");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//
//        System.out.println("Enter array elements:");
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.print("Enter index to print: ");
//        int index = sc.nextInt();
//
//        if (index >= 0 && index < size) {
//            System.out.println("Element at index " + index + ": " + arr[index]);
//        } else {
//            System.out.println("Invalid index.");
//        }
//    }
//}

