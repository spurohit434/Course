import java.util.Scanner;

public class RightMostDigit {

    /**
     * This method finds the rightmost digit in a given string.
     *
     * @param str The string to find the rightmost digit in.
     * @return The rightmost digit in the string. If no digit is found, return -1.
     */
    public int getRightmostDigit(String str) {

        // TODO: Write your code here
        if(str.length() == 0){
            return -1;
        }
        
        int j = str.length();
        
        for(int i=j-1;i>=0;i--){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                return Character.getNumericValue(ch);
            }
        }
        
        return -1;
        
    }


    public static void main(String[] args) {
        RightMostDigit obj = new RightMostDigit();
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        int result = obj.getRightmostDigit(str);
        if (result== -1) {
            System.out.printf("\"%s\" doesn\'t have any digit in it", str).println();
        } else{
            System.out.printf("\"%s\" have atleast one digit in it and the right most digit is %d", str, result).println();
        }
        sc.close();
    }
}