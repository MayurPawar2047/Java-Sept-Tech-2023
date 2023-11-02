import java.util.Scanner;
import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Fill the array with user input
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Display the original array
        System.out.println("Original Array:");
        displayArray(array);

        // Sort the array
        sortArray(array);
        System.out.println("Sorted Array:");
        displayArray(array);

        // Search for an element
        System.out.print("Enter the element to search for: ");
        int searchValue = scanner.nextInt();
        int searchIndex = searchElement(array, searchValue);
        if (searchIndex != -1) {
            System.out.println(searchValue + " found at index " + searchIndex);
        } else {
            System.out.println(searchValue + " not found in the array");
        }

        // Insert an element
        System.out.print("Enter the element to insert: ");
        int elementToInsert = scanner.nextInt();
        System.out.print("Enter the index to insert at: ");
        int insertIndex = scanner.nextInt();
        array = insertElement(array, elementToInsert, insertIndex);
        System.out.println("Array after insertion:");
        displayArray(array);

        // Delete an element
        System.out.print("Enter the index to delete an element: ");
        int deleteIndex = scanner.nextInt();
        array = deleteElement(array, deleteIndex);
        System.out.println("Array after deletion:");
        displayArray(array);

        // Find the maximum and minimum values
        int maxValue = findMaxValue(array);
        int minValue = findMinValue(array);
        System.out.println("Maximum Value: " + maxValue);
        System.out.println("Minimum Value: " + minValue);
    }

    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

    public static int searchElement(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1; // Element not found
    }

    public static int[] insertElement(int[] arr, int element, int index) {
        int[] newArray = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }

        newArray[index] = element;

        for (int i = index; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }

        return newArray;
    }

    public static int[] deleteElement(int[] arr, int index) {
        int[] newArray = new int[arr.length - 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }

        for (int i = index; i < newArray.length; i++) {
            newArray[i] = arr[i + 1];
        }

        return newArray;
    }

    public static int findMaxValue(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMinValue(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
