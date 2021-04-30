package coreJava_Concepts;

import java.util.Arrays;

public class O6_Largest_Smallest_InArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = { -10, 10, 0, 23, 57, 66, -100};
		
		int largest = num[0];
		int smallest = num[0];
		
		for(int i = 1; i<num.length; i++) {
			if(num[i] > largest) {
				largest = num[i];
			} else if(num[i] < smallest) {
				smallest = num[i];
			}
		}
		
		System.out.println("\n given array is : " +Arrays.toString(num));
		System.out.println("Largest Number : " +largest);
		System.out.println("Smallest Number : " +smallest);

	}

}
