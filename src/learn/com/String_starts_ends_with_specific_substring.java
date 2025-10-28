package learn.com;

public class String_starts_ends_with_specific_substring {

	public static void main(String[] args) {
		
		String str = "hi";
		
//        if (str.startsWith("learn") && str.endsWith("learn")) 
//        {
//            System.out.println("String starts and ends with the given substrings");
//        } 
//        else {
//            System.out.println("Condition not satisfied");
//            
//        }
        
        //Another manual method
        String start = "learn";
        String end = "learn";

        //boolean start = 14>= 5 && str.substring(0, 5).equals(start);
    boolean starts = str.length() >= start.length() && str.substring(0, start.length()).equals(start);

    boolean ends = str.length() >= end.length() && str.substring(str.length() - end.length()).equals(end);

        if (starts && ends)
            System.out.println("String starts and ends with the given substrings");
        else
            System.out.println("Condition not satisfied");

	}

}
