package learn.com;

public class Count_number_of_characters_without_space {

	public static void main(String[] args) {

		String str = "Hello World Java ";
		String tmp =  str.replace(" ", "");

		int count = 0;

		char[] arr =	tmp.toCharArray();

		for(int i=0;i<=arr.length-1;i++) {

			count+=1;


		}
		System.out.println(count);
	}

}
