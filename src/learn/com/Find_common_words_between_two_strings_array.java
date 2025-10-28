package learn.com;

import java.util.LinkedHashSet;

public class Find_common_words_between_two_strings_array {

	
	 public static void main(String[] args) {
		 
		 

			
			 String[] fruit = {"apple","banana","orange", "grapes"};
			 String[] veg = {"tomato", "beans", "orange", "banana"};
			 
				LinkedHashSet<String> set1 = new LinkedHashSet<String>();	
				
				for(String x: fruit) {
					
					set1.add(x);
				}
				
				LinkedHashSet<String> set2 = new LinkedHashSet<String>();	
				
				for(String x: veg) {

						set2.add(x);
					
				}
				
				LinkedHashSet<String> common = new LinkedHashSet<String>();
				
				for(String c: set1 ) {
					
					if(set2.contains(c))
					{
						common.add(c);
					}
				}

				System.out.println(common);
		 
	 }
}
