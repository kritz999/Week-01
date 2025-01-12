import java.util.*;
public class NumberOfChocolates{

public static void main(String[] args){

 Scanner input=new Scanner(System.in);
 // initialize number of chocolates and number of childers
  	 int numberOfChocolate,numberOfChildren;

  	 System.out.println("Enter number of chocolates and number of children:");

  	 numberOfChocolate= input.nextInt();
  	 numberOfChildren= input.nextInt();
   
  	 //finding number of chocolates each child will get
   	int each_child= numberOfChocolate/numberOfChildren;
   
   	//remaining chocolates
  	 int remaining_chocolates= numberOfChocolate%numberOfChildren;
   
   	System.out.println("the number of chocolates each child gets is "+each_child+" and the number of remaining chocolates are "+remaining_chocolates);
}
}