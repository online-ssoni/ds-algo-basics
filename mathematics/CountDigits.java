/*
 * Count digits
 * input = 1243252, output = 7
 */

class CountDigits{
    public static void main(String[]args){
        int num = 22134324;
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
}