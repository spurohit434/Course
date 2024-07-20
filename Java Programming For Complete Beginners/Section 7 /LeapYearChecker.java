import java.util.Scanner;

public class LeapYearChecker {
    public boolean isLeapYear(int year) {
        if(year < 1 || year % 4 != 0){
            return false;
        }
        
        if(year % 4 == 0 && year % 100 == 0 && year % 400 != 0){
            return false;
        }
        
       return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        LeapYearChecker obj = new LeapYearChecker();
        boolean result = obj.isLeapYear(year);
        System.out.printf("%d is %s year",year,(result?"a leap year":"not a leap year"));
        sc.close();
    }
}