import java.util.*;

public class IntOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input for a, b, and c
        System.out.println("ENTER THE VALUE OF a ");
        int a = sc.nextInt();
        System.out.println("ENTER THE VALUE OF b ");
        int b = sc.nextInt();
        System.out.println("ENTER THE VALUE OF c ");
        int c = sc.nextInt();
        
        // Operation: a + b * c
        int d = a + b * c;
        System.out.println("THE RESULT OF a + b * c is " + d);
        
        // Operation: a * b + c
        int e = a * b + c;
        System.out.println("THE VALUE OF a * b + c is " + e);
        
        // Operation: c + a / b
        int f = c + a / b;
        System.out.println("THE VALUE OF c + a / b is " + f);
        
        // Operation: a % b + c
        int g = a % b + c;
        System.out.println("THE VALUE OF a % b + c is " + g);
    }
}
