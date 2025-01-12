import java.util.*;
public class CelsiusFar{
public static void main(String[] args){
  Scanner sc =new Scanner(System.in);
   double celsius;
   System.out.print("enter temperature in celsius:");

   //input the temperature
   celsius= sc.nextDouble();

   //convert to farenheit
   double farenheitResult= celsius*(9/5)+32;

   //display
   System.out.println("The "+celsius+" celsius is "+ farenheitResult+"   farenheit");
}
}

