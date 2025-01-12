import java.util.*;
public class Weights{
public static void main(String[] args){
 Scanner input=new Scanner(System.in);
  double weight;
  System.out.println("Enter weight in pounds: ");
  weight= input.nextDouble();
  
  //converting to kilograms
  double kg= weight*2.2;

  //display
  System.out.println("The weight of the person in pound is "+weight+" and in kg is "+kg);

}
}