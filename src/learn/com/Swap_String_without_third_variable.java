package learn.com;

public class Swap_String_without_third_variable {

	public static void main(String[] args) {
		
		String a = "visva";
		String b = "ram";
		
		a = a+ b; // a= visvaram length: 8
		
		b= a.substring(0, a.length() - b.length());  // (0, 8-3) (0,5) b=  visva length: 5
		
		a= a.substring(b.length());
		
		System.out.println(a );
		System.out.println(b);
		
		

	}

}
