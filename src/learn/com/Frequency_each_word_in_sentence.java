package learn.com;

import java.util.LinkedHashMap;
import java.util.Map.Entry;


public class Frequency_each_word_in_sentence {

	public static void main(String[] args) {
		
		
		String	input= "QA QA Automation Test Test Test";
		String[] str = input.split(" ");
		
		LinkedHashMap<String,Integer> hp = new LinkedHashMap<String,Integer>();
		
		for(int i=0;i<=str.length-1;i++) {
			
			String s = str[i];
			
			if(hp.containsKey(s))
			{
			int count =	hp.get(s);
			hp.put(s, count+1);
				
			}
			else {
				
				hp.put(s, 1);
			}
		}
		
		for(Entry<String,Integer> x: hp.entrySet()) {
			
			System.out.println(x.getKey() + "=" + x.getValue());
		}

	}

}
