package coreJava_Concepts;

public class O7_StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is Java and string is very interesting topic";
		String str2 = "This is java and string is very interesting topic";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('s'));
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1 ));
		
		int second_index = str.indexOf('s', str.indexOf('s')+1 ); //second occurence of s
		
		System.out.println(str.indexOf('s', second_index + 1)); //third occurence of s
		
		
		System.out.println(str.indexOf("is"));
		
		System.out.println(str.indexOf("hello"));
		
		//String comparison		
		System.out.println(str.equals(str2));
		
		System.out.println(str.equalsIgnoreCase(str2));
		
		
		//subString
		System.out.println(str.substring(0, 5));
		
		//trim
		String s = "          Hello World     ";
		System.out.println(s.trim());
		
		System.out.println(s.replace(" ", ""));
		
		String date = "01-01-2021";
		System.out.println(date.replace("-", "/"));
		
		
		
		//Split
		String test = "Hello_World_Welcome_To_Java";
		System.out.println(test.replace("_", " "));
		
		String sp[] = test.split("_");
		
		for(int i=0; i<sp.length; i++) {
			System.out.print(sp[i]);
		}
		
		
		

	}

}
