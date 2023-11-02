public class SegregateArray {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1, 1, 0, 1, 0};

        int countZeros = 0;
        int countOnes = 0;

        // Count the number of 0s and 1s in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZeros++;
            } else {
                countOnes++;
            }
        }

        // Reconstruct the array with segregated 0s and 1s
        for (int i = 0; i < countZeros; i++) {
            arr[i] = 0;
        }

        for (int i = countZeros; i < arr.length; i++) {
            arr[i] = 1;
        }

        // Print the segregated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
