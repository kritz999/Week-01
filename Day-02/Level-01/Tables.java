import java.util.*;
public class Tables{
  public static void main(String args[])
{
  	 Scanner input= new Scanner(System.in);
  	 int number;
   	System.out.println("enter number between 6 and 9: ");
   	number= input.nextInt();

   	if(number>=6 &&  number<=9){
      	for(int i=1; i<=10; i++){
        System.out.println(number+"X"+i+" = "+number*i);
       }
    }
  }
}
   