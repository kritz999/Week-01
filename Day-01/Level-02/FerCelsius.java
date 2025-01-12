import java.util.*;
public class FarCelsius{
public static void main(String[] args){
  Scanner sc =new Scanner(System.in);
  double farenheit;
  System.out.print("Enter temperature in farenheit: ");
  //taking input temperature
  farenheit= sc.nextDouble();
   
  //convert to celsius
  double celsiusResult= (farenheit-32)*(5/9);
  
  //display
  System.out.println("The "+farenheit+" farenheit is "+celsiusResult+" celsius");
} 
}