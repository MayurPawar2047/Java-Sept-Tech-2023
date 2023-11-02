public class ArrayAverage {
    public static void main(String[] args) {
        // Initialize an array with elements
        int[] arr = {10, 20, 30, 40, 50};

        // Calculate the sum of elements in the array
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // Calculate the average
         System.out.println("Sum of the array elements: " + sum);
        double average =  sum / arr.length;

        // Display the average
        System.out.println("Average of the array elements: " + average);
    }
}
