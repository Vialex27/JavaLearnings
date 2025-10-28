package learn.com;

import java.util.regex.Pattern;

public class Check_two_strings_equal_without_considering_case_space {

	public static void main(String[] args) {
		String str1 = " Test\t Automation\n  ";
        String str2 = "testautomation";
        
        // s matches any whitespace (space, tab, newline).
        
      String s1 =  str1.replaceAll("\\s+","").toLowerCase();
     String s2 =  str2.replace("\\s+", "").toLowerCase();
     
   
     
     System.out.println(s1);
     
     if(s1.equals(s2)==true)
     {
    	 System.out.println("two strings are equal");
     }
     
     else {
    	 
    	 System.out.println("it is not equal");
     }

     
     
	}
}
