package coreJava_Concepts;

public class O8_swapTwoInt_WithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		int y = 10;
		
		// interchange these two numbers with temp variable
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("X value is : " +x);
		System.out.println("y value is : " +y);
		
		//interchange without temp variable, using + operator
		
		x = x + y; //15
		y = x - y;// 5
		x = x - y; //10
		
		//interchange without temp variable, using * operator
		
		x = x*y; //50
		y = x/y; //5;
		x = x/y; //10;
		
		//interchange using XOR: ^
		x = x ^ y; //15 --> 1111
		y = x ^ y; //10 --> 1010
		x = x ^ y; //5 --> 0101
				
		

	}

}
