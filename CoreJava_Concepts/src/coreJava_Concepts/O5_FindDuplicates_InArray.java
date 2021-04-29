package coreJava_Concepts;

import java.util.HashSet;
import java.util.Set;

public class O5_FindDuplicates_InArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String languages[] = {"Java", "python", "c", "unix", ".net", "Java"};
		
		for (int i=0; i< languages.length; i++) {
			for(int j=i+1; j<languages.length; j++) {
				
				if (languages[i].equals(languages[j])) {
					System.out.println(languages[i]);
				}
			}
		}
		
		System.out.println("************************");
		
		//Second method using HashSet: Java Collection : it stores unique value
		
		Set<String> store = new HashSet<String>();
		
		for(String lang: languages) {
			if(store.add(lang) == false) {
				System.out.println(lang);
			}
			
		}

	}

}
