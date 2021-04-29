package coreJava_Concepts;

public class O4_MissingNumber_InArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,4,5};
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		
		System.out.println(sum);
		
		int sum1 = 0;
		for(int j = 0; j<=5; j++) {
			sum1 = sum1 + j;
		}
		
		System.out.println(sum1);
		
		int missingNum = (sum1 - sum);
		
		System.out.println("Missing number is : " +missingNum);
		

	}

}
