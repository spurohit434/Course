import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiplesOfNumber {
    /**
     * This method generates a list of multiples of a given number less than a specified limit.
     * 
     * @param number the number to find multiples of
     * @param limit the upper bound for the multiples
     * @return a List of multiples of the number less than the limit
     */
    public List<Integer> determineMultiples(int number, int limit) {

        // TODO: Write your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(limit < number){
            return ans;
        }
        if(number <= 0){
            return ans;
        }
        
        for(int i=1;i<limit;i++){
            if(i*number < limit){
                ans.add(i*number);
            }
        }
        
        return ans;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number");
        int num = scanner.nextInt();
        System.out.print("Enter the limit ");
        int limit = scanner.nextInt();
        scanner.close();

        MultiplesOfNumber obj = new MultiplesOfNumber();
        List<Integer> ans = obj.determineMultiples(num, limit);
        System.out.println("Multiples of given number are: ");
        for(int mark : ans){
            System.out.println(mark);
        }
        
    }


}
