import java.util.*;
Public class Swap{
public static void main(String[] args){
 Scanner input=new Scanner(System.in);
 int number1,number2;
 System.out.println("Enter 2 numbers: ");
 number1=input.nextInt();
 number2=input.nextInt();

 //declaring a third variable
 int temp;

//swapping
 temp=number1;
 number1=number2;
 number2=temp;
 
//display
  System.out.println("The swapped numbers are "+number1+" and "+number2);
}
}