    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;
    
    public class FactorsOfNum {
    
        /**
         * This method returns all factors of a given number in an ArrayList.
         * 
         * @param number the number to find factors of
         * @return a List of factors of the number
         */
        public List<Integer> determineAllFactors(int number) {
             ArrayList<Integer> ans = new ArrayList<Integer>();
             
             for(int i=1;i<=number ; i++){
                 if(number%i == 0){
                     ans.add(i);
                 }
             }
            // TODO: Write your code here
            return ans;
        }

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number ");
            int num = scanner.nextInt();
            

            scanner.close();

            FactorsOfNum obj = new FactorsOfNum();
            List<Integer> ans = obj.determineAllFactors(num);
            System.out.println("Factors of given number are: ");
            for(int mark : ans){
                System.out.println(mark);
            }
        }

    }
