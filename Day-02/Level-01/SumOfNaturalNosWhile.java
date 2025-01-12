import java.util.*;
class SumOfNaturalNosWhile{
  public static void main(String args[]){
   	Scanner sc= new Scanner(System.in);
  	 int number;

	//enter the value of the number
  	 System.out.print("Enter no:");
  	 number= sc.nextInt();
	//initialize the value of the sum=0
   	int sum=0;
   
  	 //check if the number is a natural number
   	if(number>0){
     	int i=1;
     	while(i<=number){
      	sum+= i;
      	i++;
    }
  }
  
 	 int sum2= number*(number+1)/2;
  	if(sum==sum2){
    	System.out.print("The sums are same i.e "+sum);
   }
 	 else{
    	System.out.print("The sums are not same");
   }
 }
}
