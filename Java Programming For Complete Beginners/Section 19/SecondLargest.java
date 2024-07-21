import java.util.Scanner;

public class SecondLargest {
    
    /**
     * This method finds and returns the second largest element in the given array.
     * 
     * @param array the array in which to find the second largest element
     * @return the second largest element in the array
     */
     
    public int findSecondLargestElement(int[] array) {
        //TODO: Write your code here
        if(array.length < 2 ){
            return -1;
        }
       
        
        int max1 =0;
        int max2 =0;
        
        for(int num : array){
            if(num > max1 ){
                max1 = num;
            }
        }
        
        for(int num:array){
            if(num > max2 && num != max1){
                max2 = num;
            }
        }
        
        if(max2 == 0)return -1;
        return max2;
        
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

        SecondLargest obj = new SecondLargest();
        int ele = obj.findSecondLargestElement(array);
        System.out.printf("%d is the Second Largest element in given array", ele).println();
    }
}