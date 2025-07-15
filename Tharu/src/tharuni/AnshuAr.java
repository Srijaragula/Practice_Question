package tharuni;

public class AnshuAr {

	public static void main(String[] args) {
		int[] arr= {23,35,67,4,37};
		int max=arr[0],min=arr[0];
		for(int num:arr) {
			if(num<max)max=num;
			if(num>min)min=num;
			
		}
		System.out.println("max" +max);
		System.out.println("min" +min);
		

	}

}
