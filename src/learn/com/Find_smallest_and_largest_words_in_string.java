package learn.com;

public class Find_smallest_and_largest_words_in_string {

	public static void main(String[] args) {

		String str ="v vissss visva a how are you";
		String [] tmp =	str.split(" ");

		String largest =tmp[0];
		String smallest = tmp[0];


		for(int i =1;i<=tmp.length-1;i++)
		{
			if(tmp[i].length() > largest.length())
			{
				largest= tmp[i];
			}

			
			else if( tmp[i].length() < smallest.length())
			{
			smallest =	tmp[i];
			}

		}
		
		System.out.println(largest);
		System.out.println(smallest);
		

	}

}
