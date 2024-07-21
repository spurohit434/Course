import java.util.Scanner;

public class IsGreater {
    
    /**
     * This method determines whether there's an element greater than a given number in an array.
     *
     * @param array The array to search through.
     * @param number The number to compare with the array elements.
     * @return True if there's an element greater than the given number in the array, false otherwise.
     */
    public boolean doesHaveElementGreaterThan(int[] array, int number) {

        // TODO: Write your code
        if(array.length == 0){
            return false;
        }
        
        for(int num: array){
            if(num > number){
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter a string");
        int[] arr1 = {2,3,7,1,4};
        IsGreater obj = new IsGreater();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();
        boolean flag = obj.doesHaveElementGreaterThan(arr1, num);
        System.out.println(flag);
        sc.close();
        
    }
}