package mathematics;
import java.util.Scanner;

/*
 * Exactly three divisors
 * Find numbers from 1 to N with exactly 3 divisors
 * 
 * Input: N = 16
    Output: 4 9
    Explanation: 4 and 9 have exactly three divisors.

    Input: N = 49
    Output: 4 9 25 49
    Explanation: 4, 9, 25 and 49 have exactly three divisors.




    Idea: After having a close look at the examples mentioned above, you have noticed that all the required numbers are perfect squares and that too of only prime numbers. 

    Proof: Suppose the number is N, and it is a perfect square with square root X such that X is prime.

    Now if we find the factors of N, it will always have following combinations:

        1*N
        X*X

    Therefore the required numbers will have only three numbers as their divisors:

        1, 
        that number itself, and 
        just a single divisor in between 1 and the number.

        Algorithm: We can generate all primes within a set using any sieve method efficiently and then we should take all primes i, such that i*i <=N. 

        Follow the below steps to solve the problem:

            Generate the prime numbers from 1 to N using any sieve method efficiently
            Print all the prime numbers(X) between 1 to N, such as X2 is less than or equal to N

 */

public class Exactly3Divisors {

    public static void print3Divisors(int num){
        Boolean prime[] = new Boolean[num+1];
        for(int i=0; i<=num; i++)
            prime[i] = true;
        
        for(int i=2; i*i<=num; i++){
            if(prime[i] == true){
                for(int k=i*i; k<=num; k+=i){
                    prime[k] = false;
                }
            }
        }
        for(int i=1; i<=num; i++){
            if(prime[i]){
                if(i*i <= num){
                    if(i != 1){
                        System.out.println(i*i);
                    }
                }
            }
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        print3Divisors(num);
        sc.close();
    }
}
