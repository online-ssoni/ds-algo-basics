package mathematics;
import java.util.Scanner;

/*
 * Write down all the prime factors of the number
 */
public class PrimeFactors {
    static void printPrimeFactors(int num){
        while(num%2 == 0){
            System.out.println(2);
            num /= 2;
        }

        for(int i=3; i<= Math.sqrt(num); i+=2){
            if(num%i == 0){
                System.out.println(i);
                num /= i;
            }
        }
        if (num > 2)
            System.out.println(num);

    } 
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printPrimeFactors(num);
        sc.close();
    }
}
