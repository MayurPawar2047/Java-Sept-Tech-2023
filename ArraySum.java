public class ArraySum {
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {10, 20, 30, 40, 50,100,200};
        
        // Initialize a variable to store the sum
        int sum = 0;
        
        // Iterate through the array and add each element to the sum
        for (int number : numbers) {
            sum += number;
        }
        
        // Print the sum
        System.out.println("Sum of array elements: " + sum);
    }
}

