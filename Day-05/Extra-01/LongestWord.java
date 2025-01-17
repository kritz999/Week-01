import java.util.*;

	public class LongestWord{

		public static void main(String[]args){

			Scanner sc = new Scanner (System.in);

			System.out.println("enter the sentence");
			String sentence = sc.nextLine();

			String Longestword = findlongestword(sentence);

			System.out.println("the longest word is"+ Longestword);
			

			}



		public static String findlongestword(String sentence){

			String [] words = sentence.split("\\s+");//string words get splitted by the .split method
			
			String LongestWord ="";

			for(String word :words){

			if(word.length()> LongestWord.length()){

				LongestWord = word;

				}

				}
				return LongestWord;

		}




	}