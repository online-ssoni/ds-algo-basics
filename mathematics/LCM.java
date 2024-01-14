package mathematics;
import java.util.Scanner;
/*
 * Function to find LCM of two numbers
 * 
 * Logic:
 *  a x b = LCM(a, b) * GCD (a, b)
 *  LCM(a, b) = (a x b) / GCD(a, b)
 */
public class LCM {
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

        // LCM(a, b) = (a x b) / GCD(a, b)
        int lcm = (num_a * num_b) / gcd;
        
        System.out.println(lcm);
        sc.close();
    }
    
}
