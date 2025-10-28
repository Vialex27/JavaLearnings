package learn.com;

public class Length_of_string {

	public static void main(String[] args) {


		String str ="visva";
		char[] arr = 	str.toCharArray();
		int count = 0;

		for(int i =0;i<arr.length;i++) 
		{
			count ++;

		}

		System.out.println("length of string: " + count);

	}

}
