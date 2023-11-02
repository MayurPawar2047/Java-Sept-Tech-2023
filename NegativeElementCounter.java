

public class NegativeElementCounter {
    public static void main(String[] args) {
        

     

        int[] arr = {1,-2,-3,4,5};
 
       int negativeCount = 0;

        
        for (int i = 0; i<5; i++) {
            if (arr[i] < 0) {
                negativeCount++;
            }
        }

        // Display the result
        System.out.println("Total negative numbers: " + negativeCount);

    }
}
