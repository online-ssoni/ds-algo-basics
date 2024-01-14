package mathematics;

import java.util.Scanner;
/*
 * Check if number is palindrome or not
 * 
 * input = 122, output = false
 * input = 121, output = true
 * input = 1, output = true
 * input = 3333, output = true
 */

public class PalindromeNumbers {

    static boolean checkPalindrome(int num){
        int reverse = 0;
        int temp = num;
        
        while(temp > 0){
            int rem = temp%10;
            reverse = (reverse*10) + rem;
            temp = temp/10;
        }

        if (num == reverse)
            return true;
        return false;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer: ");
        int num = sc.nextInt();
        System.out.println(checkPalindrome(num));
        sc.close();
    }
}
