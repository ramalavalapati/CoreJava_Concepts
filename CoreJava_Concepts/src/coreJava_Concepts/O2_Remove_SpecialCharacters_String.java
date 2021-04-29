package coreJava_Concepts;

public class O2_Remove_SpecialCharacters_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This #is &special *character (sentence";
		
		str = str.replaceAll("[^a-zA-Z 0-9]", "");
		
		System.out.println(str);

	}

}
