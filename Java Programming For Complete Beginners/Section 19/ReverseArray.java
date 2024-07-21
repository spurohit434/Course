import java.util.Scanner;

public class ReverseArray {

    /**
     * This method reverses an array.
     * 
     * @param array the array to reverse
     * @return a new array with elements in reverse order
     */
    public int[] reverseArray(int[] array) {

        // TODO: Write your code here
        int n = array.length ;

        int i=0, j=n-1;
        while( i < j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        
        return array;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        scanner.close();

        ReverseArray obj = new ReverseArray();
        int[] ans = obj.reverseArray(array);
        System.out.println("Reversed array is");
        for(int mark : ans){
            System.out.println(mark);
        }
    }
}