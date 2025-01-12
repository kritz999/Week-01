import java.util.*;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input for a, b, and c (all as doubles)
        System.out.println("ENTER THE VALUE OF a ");
        double a = sc.nextDouble();
        System.out.println("ENTER THE VALUE OF b ");
        double b = sc.nextDouble();
        System.out.println("ENTER THE VALUE OF c ");
        double c = sc.nextDouble();
        
        // Performing operations and displaying results
        
        // Operation a + b * c
        double d = a + b * c;
        System.out.println("THE RESULT OF a + b * c is " + d);
        
        // Operation a * b + c
        double e = a * b + c;
        System.out.println("THE VALUE OF a * b + c is " + e);
        
        // Operation c + a / b
        double f = c + a / b;
        System.out.println("THE VALUE OF c + a / b is " + f);
        
      
        System.out.println("The modulo operation is not valid for doubles.");
    }
}

