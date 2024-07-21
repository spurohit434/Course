import java.util.Scanner;

public class UpperCase {
    
    /**
     * This method counts the number of uppercase letters in a given string.
     *
     * @param str The string to count uppercase letters in.
     * @return The number of uppercase letters in the string.
     */
    public int countUppercaseLetters(String str) {
        // TODO: Write your code here
        if(str.length() == 0){
            return 0;
        }
        int j = str.length();
        int count = 0;
        
        for(int i=0;i<j;i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        
        return count;
    }


    public static void main(String[] args){
        UpperCase obj = new UpperCase();
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        int count= obj.countUppercaseLetters(str);
        System.out.printf("Number of uppercase characters in \"%s\" is %d",str,count).println();
        sc.close();
    }

}