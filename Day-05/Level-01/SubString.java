import java.util.*;

	public class SubString{

		public static String rev(String s1,int start,int end){
			
		String sub ="";
		for(int i=start; i<end ;i++){
			
			sub+=s1.charAt(i);
			
			}
			return sub;

		}

		


		public static void main(String[]args){

			Scanner sc = new Scanner(System.in);

			System.out.println("enter string1");
			String s1 =sc.nextLine();
			
			System.out.println("enter start");
			int start = sc.nextInt();
			
			System.out.println("enter end");
			int end = sc.nextInt();
			String result1 =rev(s1,start,end);
			System.out.println(result1);

			String result2 =s1.substring(start,end);
			System.out.println(result2);
				
			System.out.println("the substring using for loop "+result1);

			System.out.println("The substring using direct method " + result2);
				if(result1 == result2){
					System.out.println("True");
				}else{
					System.out.println("False");
					}
		}

	}