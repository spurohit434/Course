import java.util.Scanner;

public class NumberUtils1 {

    /**
     * This method calculates and returns the number of digits in a given integer.
     * If the number is negative, it returns -1.
     * If the number is zero, it returns 1 as zero is considered to have one digit.
     * @param number: an integer
     * @return number of digits in number, or -1 if number is negative, or 1 if number is zero.
     */
    public int getNumberOfDigits(int number) {
        // Write your code here
        if(number == 0){
            return 1;
        }
        if(number < 0){
            return -1;
        }
        
        int count =0;
        while(number != 0){
            number = number/10;
            count++;
        }
        
        return count;
    }

    public static void main(String[] args) {
        NumberUtils1 obj = new NumberUtils1();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        int result= obj.getNumberOfDigits(number);
        System.out.printf("total number of digits in %d is %d",number,result).println();
        sc.close();
    }
}