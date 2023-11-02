public class MaxMinArray {

    public static void main(String[] args) {
        int[] arr = { 300, 45, 12, 67, 89, 34, 56,100,1,};

        // Initialize max and min with the first element of the array
        int max = arr[0];
        int min = arr[0];

        // Iterate through the array to find max and min
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
            if (arr[i] < min) {
                min = arr[i]; // Update min if a smaller element is found
            }
        }

        // Print the maximum and minimum elements
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
