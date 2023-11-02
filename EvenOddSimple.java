import java.util.Scanner;
import java.util.Random;

public class EvenOddSimple {
    public static void main(String[] args) {
        Random random = new Random(5656);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] A = new int[size];

        // Fill the array with random numbers
        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(88);
        }

        // Separate even and odd numbers
        int[] evenArray = new int[size];
        int[] oddArray = new int[size];
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                evenCount++;
                evenArray[evenCount] = A[i];
            } else {
                oddCount++;
                oddArray[oddCount] = A[i];
                }
        }

        // Print even numbers
        System.out.println("Even Array:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }

        // Print odd numbers
        System.out.println("\nOdd Array:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i] + " ");
        }
    }
}
