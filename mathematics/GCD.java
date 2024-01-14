package mathematics;
import java.util.Scanner;
/*
 * Calculate GCD using euclidian algorithm
 * 
 * Example 1: GCD of 48 and 18 is 6
 * Example 2: GCD of 27 and 9 is 9
 * Example 3: GCD of 35 and 14 is 7
 * Example 4: GCD of 72 and -24 is 24 (ignoring signs)
 * Example 5: GCD of 0 and 8 is 8
 */

public class GCD {

    static int calculateGcd(int a, int b){
        // Ensure that both numbers are positive
        a = Math.abs(a);
        b = Math.abs(b);

        if(a == 0)
            return b;
        
        if(b == 0)
            return a;

        if(a == b)
            return a;
        
        if(a > b)
            return calculateGcd(a-b, b);
        return calculateGcd(a, b-a);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num_a = sc.nextInt();
        int num_b = sc.nextInt();
        int gcd = calculateGcd(num_a, num_b);
        System.out.println(gcd);
        sc.close();
    }
}
