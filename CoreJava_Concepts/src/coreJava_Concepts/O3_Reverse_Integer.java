package coreJava_Concepts;

public class O3_Reverse_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. using mathematic
		int num = 1234567;
		int rev = 0;
		
		while (num != 0) {
			//rev = rev * 10 + num % 10;
			rev = rev * 10 + num %10;
			num = num / 10;
		}
		
		System.out.println("Reverse num is: " +rev);
		
		
		//2. using stringBuffer method
		long num1 = 112233;
		String str = "abc";
		
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println(sb.reverse());
		
		//System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}

}
