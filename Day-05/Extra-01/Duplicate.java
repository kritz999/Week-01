import java.util.*;

public class Duplicate{

	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);

		
		System.out.println("enter the string");

		String s1 = sc.nextLine();
		char[] str = s1.toCharArray();
		int len = str.length;
		String result = RemoveDuplicate(str,len);
		

		System.out.println("String after removing duplicates: " + result);

       		 sc.close();
    }

		
	public static String RemoveDuplicate(char[] str,int len){
		String Nondup ="";//empty String
			
		for( int i =0;i<len;i++){
				int j;
			for(j=0;j<i;j++){
				if(str[i]==str[j]){
					break;//duplicate found
				}

			}
		if(j==i){
			Nondup+=str[i];
				
			}
		}
		return dup;
	
   }
}













