import java.util.*;

	public class Compare{

		public static void main (String[]args){

		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter String1");
		  String s1 = sc.nextLine();
		  System.out.println("enter String2");
		  String s2 = sc.nextLine();

		  Boolean resultCharAt = Compare(s1,s2);
			
		  Boolean resultUsingEquals = s1.equals(s2);
		  
		 System.out.println("compare using string charAt() "+ resultCharAt);

		System.out.println("Compare using string Equals "+resultUsingEquals);

			}

		public static boolean Compare(String s1, String s2){

			
			if(s1.length()!=s2.length()){
				return false;
				
				}	

				//compare each character of the string

				for(int i=0;i<s1.length();i++){
					if(s1.charAt(i)!=s2.charAt(i)){
					return false;
				}
				}

				return true;

			}

}