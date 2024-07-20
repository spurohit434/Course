import java.util.Scanner;

public class TriangleValidator {
    public boolean isValidTriangle(int angle1, int angle2, int angle3) {
        // write your code here
        if( angle1 <= 0 || angle2 <= 0 || angle3 <= 0){
            return false;
        }
        if(angle1 + angle2 + angle3 == 180){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        TriangleValidator obj= new TriangleValidator();
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        boolean result = obj.isValidTriangle(s1,s2,s3);
        System.out.printf("Triangle wwith sides %d, %d, %d is a %s triangle",s1,s2,s3,(result?"Valid Triangle":"not a Valid Triangle"));
        sc.close();
    }


}