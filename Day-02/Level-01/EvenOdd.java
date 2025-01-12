import java.util.*;
public class EvenOdd{
	public static void main(String[]args){
	
	Scanner sc = new Scanner(System.in);
	//taking input from the user
	System.out.println("Enter the value of number");
	int n = sc.nextInt();
	if(n>=1){
	for(int i = 1;i<=n;i++){
	
		if(i% 2== 0){
			System.out.println( i +" is even");
		}else{
			System.out.println( i +" is odd");
		}
           }}else{

          System.out.println("Please enter number greater then 1");
          }
}
}
			