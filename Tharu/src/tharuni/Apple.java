package tharuni;

public class Apple {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str="APPLE";
			String str7="apple";
			String str2=new String("hello i am chitti");
			char c[]= {'h','e','l','l','o'};
			String str3=new String(c);
			byte b[]= {65,66,67,68};
			String str4=new String(b);
			System.out.println(str4+" "+str+" "+str2+" "+str3 );
			System.out.println(str==str7);
			String str9=str3.replace('e', 's');
			System.out.println(str9);
			String str5="www.abcd.org";
			System.out.println(str2.endsWith("chitti"));
	        System.out.println(str.toUpperCase());
	        System.out.println(str.toLowerCase());
	        char a[]={'s','r','i','j','a'};
	        String str10=new String(a);
	        System.out.println(str10);
	        byte e[]= {33,6,77,88,99};
	        String str11=new String(e);
	        System.out.println(str11);
	        System.out.println(str==str2);



	}

}
