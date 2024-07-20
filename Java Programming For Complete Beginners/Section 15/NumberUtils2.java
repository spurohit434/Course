import java.util.Scanner;

public class NumberUtils2 {

    public int getSumOfDigits(int number) {
        // Write your code here
        if(number < 0){
            return -1;
        }
        if(number == 0){
            return 0;
        }
        int sum =0 ;
        
        while(number > 0){
            sum += number % 10;
            number = number/10;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        NumberUtils2 obj = new NumberUtils2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int result = obj.getSumOfDigits(num);
        System.out.printf("Sum of digits of %d is %d",num,result).println();
        sc.close();
    }
}