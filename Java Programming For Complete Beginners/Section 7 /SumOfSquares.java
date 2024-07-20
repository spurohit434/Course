import java.util.Scanner;

public class SumOfSquares {
    public long calculateSumOfSquares(int n) {
       // write your code here
       if( n < 0){
           return -1;
       }
       int sum =0;
       for(int i=1;i<=n;i++){
           sum += i*i;
       }
       return sum;
    }

    public static void main(String[] args){
        SumOfSquares obj = new SumOfSquares();
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        long answer= obj.calculateSumOfSquares(num);
        System.out.println("Sum of Square of numbers till "+num+" is equal to "+answer);
        sc.close();
    }
}