package coreJava_Concepts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
//import java.util.Map.Entry;
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
		
		System.out.println("**********************");
		
		//get values from this HashMap:
		
		
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		
		for(String lang : languages) {
			Integer count = storeMap.get(lang);
			if(count == null) {
				storeMap.put(lang, 1);
			} else {
				storeMap.put(lang, ++count);
			}
		}
		
		
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		
		for(Entry<String, Integer> entry : entrySet) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
		
		


		
		
		

	}

}
