package coreJava_Concepts;

import java.util.HashSet;
import java.util.Set;

public class O01_practice {
	
	public static void main(String[] args) {
		
		String a[] = {"java", "python", "ruby", "c", "java"};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i].equals(a[j])) {
					System.out.println(a[i]);
					
				}
			}
		}
		
		Set<String> store = new HashSet<String>();
		
		for(String a1: a) {
			if(store.add(a1) == false) {
				
				System.out.println(a1);
			}
		}
		
		
		String str = "Hello_welcome_to_java_classes";
		
		String test[] = str.split("_");
		
		for(int i=0; i<test.length; i++) {
			
			System.out.print(test[i]);
		}
		
		
		
	}

}
