package mathematics;
import java.util.Scanner;

/*
 * 
    Find digits in factorial

    Input:  5
    Output: 3
    Explanation: 5! = 120, i.e., 3 digits

    Input: 10
    Output: 7
    Explanation: 10! = 3628800, i.e., 7 digits
    

    We know,
    log(a*b) = log(a) + log(b)

    Therefore
    log( n! ) = log(1*2*3……. * n) = log(1) + log(2) + …….. +log(n)

    Now, observe that the floor value of log base 
    10 increased by 1, of any number, gives the
    number of digits present in that number.
    Hence, output would be : floor(log(n!)) + 1.

 */

class DigitsInFactorial{

    static int countDigits(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        if(num < 0){
            return 0;
        }
        double digits = 0;
        for(int i=2; i<=num; i++){
            digits += Math.log10(i);
        }
        return (int)(Math.floor(digits) + 1);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = countDigits(num);
        System.out.println(result);
    }

}