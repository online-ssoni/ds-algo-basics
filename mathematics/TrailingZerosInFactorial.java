package mathematics;

import java.util.Scanner;

/*
 * Trailing zeros in factorial
 * 
 * count the powers of 5 divisibe by original number
 */
public class TrailingZerosInFactorial {
    static int getTrailingZeros(int x){
        int result = 0;
        int powers = 1;
        while(x/Math.pow(5, powers) > 0){
            result += (int)(x/Math.pow(5, powers));
            powers++;
        }
        return result;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int trailingZeros = getTrailingZeros(num);
        System.out.println(trailingZeros);
        sc.close();
    }
}
