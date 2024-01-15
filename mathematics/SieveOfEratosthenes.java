package mathematics;
import java.util.Scanner;
/*
 * Sieve of eratosthenes
 * 
 * Write all prime numbers between 1 to n
 */
public class SieveOfEratosthenes {
    public static void sieve(int num){
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
                System.out.println(i);
            }
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sieve(num);
    }
}
