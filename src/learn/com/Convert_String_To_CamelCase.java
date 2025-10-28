package learn.com;

public class Convert_String_To_CamelCase {

	public static void main(String[] args) {
		
//		 String str = "learn java from examples";
//
//	        str = str.trim().toLowerCase(); 
//	        // Step 1: remove extra spaces & lowercase everything
//	        String result = "";      

//	        
//	        
//	        boolean makeUpper = false;    
//	        // Step 3: flag to capitalize next character
//
//	        // Step 4: Loop through each character
//	        for (int i = 0; i < str.length(); i++) {
//	            char ch = str.charAt(i); // get character at position i
//
//	            if (ch == ' ') 
//	            
//	            {
//	                // Step 5: If space found so just  setting the flag true for next char
//	                makeUpper = true;
//	            }
//	            
//	            else {
//	                // Step 6: If previous char was space → make current uppercase
//	                if (makeUpper== true) {
//	                    result = result  + Character.toUpperCase(ch);
//	                    makeUpper = false; // reset flag
//	                } else {
//	                    // Step 7: Otherwise, just add lowercase character
//	                    result = result + ch;
//	                }
//	            }
//	        }
//
//	        System.out.println("Original String: " + str);
//	        System.out.println("CamelCase String: " + result);
	        
	        
	        
	        
	        
	        String str1 = "learn java from examples ";  
	        
	        
	      String str =  str1.trim().toLowerCase();
	      
	      String result="";
	      boolean makeUpper = false;
	      
	      for(int i =0;i<=str.length()-1;i++) {
	    	  
	    	  char ch = str.charAt(i);
	    	  
	    
	    	  if(ch==' ') {
	    		  
	    		  makeUpper = true;
	    	  }
	    	  
	    	  else if(makeUpper == true) {
	    			  
	    			result = result+  Character.toUpperCase(ch);
	    			makeUpper = false;
	    		  }
	    		  
	    		  else {
	    			  result = result + ch;
	    		  }
	    	  }
	      System.out.println(result);  

	        
	}

}
