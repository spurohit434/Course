import java.util.Scanner;

public class IsArraySorted {

    /**
     * This method checks if the input array is sorted in ascending order.
     * 
     * @param array the array to check
     * @return true if the array is sorted, false otherwise
     */
    public boolean isSorted(int[] array) {

        // TODO: Write code here
        int n = array.length ;
        for(int i=0;i<n-1;i++){
            if(array[i] > array[i+1]){
                return false;
            }
        }
        
        return true;
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

        IsArraySorted obj = new IsArraySorted();
        boolean flag = obj.isSorted(array);
        System.out.println(flag);
    }


}