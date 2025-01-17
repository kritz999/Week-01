import java.util.*;
public class Compare{

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the string");

		String s1= sc.nextLine();

		//counting vowels and consonents

		int countVowel =0;

		int countConsonent =0;

		s1 = s1.toLowerCase();
		
		for(int i=0;i<s1.length();i++){
			
			char ch = s1.charAt(i);
 				
			if(ch =='a'||ch =='e'||ch=='i'||ch=='0'||ch=='u'){

				countVowel++;				

				}else if(ch=>'a' && ch<='z'){
					
					countConsonent++;
				}



			}
		
	System.out.println(" The count of vowels is "+ 	countVowel);
	System.out.println(" The count of consonant is " + countConsonent);


 


}

 	


			














		}
		