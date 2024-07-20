import java.util.Scanner;

public class NumberUtils {

    public int getLastDigit(int number) {
        // Write your code here
        if(number == 0){
            return number;
        }
        if(number < 0){
            return -1;
        }
        return number%10;
    }

    public static void main(String[] args){
        NumberUtils obj = new NumberUtils();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int result = obj.getLastDigit(num);
        System.out.printf("Last digit of %d is %d",num,result).println();
        sc.close();
    }


}