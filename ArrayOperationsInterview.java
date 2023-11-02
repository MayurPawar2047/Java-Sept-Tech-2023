import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ArrayOperationsInterview {
    public static void main(String[] args) {
        Random random = new Random(5656);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Fill the array with random numbers
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(88);
        }

        // Display the original array
        displayArray(array);

        // Sort the array
        sortArray(array);
        System.out.println("Sorted Array:");
        displayArray(array);

        // Traverse the array
        System.out.println("Traversing Array:");
        traverseArray(array);

        // Insert an element
        insertElement(array, 42, 3); // Insert 42 at index 3
        System.out.println("After Insertion:");
        displayArray(array);

        // Delete an element
        deleteElement(array, 3); // Delete element at index 3
        System.out.println("After Deletion:");
        displayArray(array);

        // Update an element
        updateElement(array, 99, 2); // Update element at index 2 to 99
        System.out.println("After Update:");
        displayArray(array);

        // Search for an element
        int searchValue = 42;
        int searchIndex = searchElement(array, searchValue);
        System.out.println("Index of " + searchValue + ": " + searchIndex);

        // Find the maximum and minimum values
        int maxValue = findMaxValue(array);
        int minValue = findMinValue(array);
        System.out.println("Maximum Value: " + maxValue);
        System.out.println("Minimum Value: " + minValue);

        // Calculate the average
        double average = calculateAverage(array);
        System.out.println("Average: " + average);

        // Reverse the array
        reverseArray(array);
        System.out.println("Reversed Array:");
        displayArray(array);

        // Find the second largest element
        int secondLargest = findSecondLargest(array);
        System.out.println("Second Largest Element: " + secondLargest);

        // Check if the array is a palindrome
        boolean isPalindrome = isPalindromeArray(array);
        System.out.println("Is Palindrome Array: " + isPalindrome);
    }

    // ... Previous methods (displayArray, sortArray, traverseArray, insertElement, deleteElement, updateElement, searchElement, findMaxValue, findMinValue, calculateAverage)

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must have at least 2 elements.");
            return -1;
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }

        return secondMax;
    }

    public static boolean isPalindromeArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
