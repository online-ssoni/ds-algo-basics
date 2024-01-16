package mathematics;

import java.util.Scanner;

/*
    Geometric progression
    Given first term (a), common ratio (r), and an integer N of the Geometric Progression series, the task is to find the Nth term of the series.

    Examples: 

    Input: a = 2 r = 2, N = 4
    Output: The 4th term of the series is : 16

    Input: a = 2 r = 3, N = 5
    Output: The 5th term of the series is : 162

    We know the Geometric Progression series is like = 2, 4, 8, 16, 32 …. … 
    In this series 2 is the stating term of the series . 
    Common ratio = 4 / 2 = 2 (ratio common in the series). 
    so we can write the series as :

    t1 = a1 
    t2 = a1 * r(2-1) 
    t3 = a1 * r(3-1) 
    t4 = a1 * r(4-1) 
    . 
    . 
    . 
    . 
    tN = a1 * r(N-1)

 */
public class GeometricProgression {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int first_term = sc.nextInt();
        int common_ratio = sc.nextInt();
        int num = sc.nextInt();
        int result = (int) (first_term * Math.pow(common_ratio, num - 1));
        System.out.println(result);
    }
}
