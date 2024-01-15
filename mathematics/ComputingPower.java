package mathematics;
import java.util.Scanner;
/*
 * Computing power using recursion
 */
public class ComputingPower {
    static long power(int num, int x){
        if(x==0)
            return 1;
        if(num==0)
            return 0;
        return num * power(num, x-1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = sc.nextInt();
        long pow = power(num, x);
        System.out.println(pow);
    }
}
