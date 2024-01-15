package mathematics;
import java.util.Scanner;
/*
 * Check if a number is prime or not
 */
public class CheckForPrime {
    static boolean isPrime(int num){
        if (num >= 1 && num <= 3)
            return true;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }
}
