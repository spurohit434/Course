import java.util.Scanner;

public class AreSumOfArrayEqual {
    
    private int[] array1;
    private int[] array2;

    public AreSumOfArrayEqual(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public boolean areSumsEqual() {

        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);
        
        if(sum1 == sum2){
            return true;
        }
        
        return false;

        // TODO: Write the code to compare the sums of the arrays and return the result.
    }

    private int calculateSum(int[] array) {
        
        // TODO: Write the code to calculate the sum of the array.
        int sum = 0;
        for(int num: array){
            sum += num;
        }
        
        return sum;

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        System.out.println("Enter the elements of the array1 :");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter the elements of the array2 :");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        scanner.close();

        AreSumOfArrayEqual obj = new AreSumOfArrayEqual(array1,array2);
        boolean flag = obj.areSumsEqual();
        System.out.println(flag);
    }
}