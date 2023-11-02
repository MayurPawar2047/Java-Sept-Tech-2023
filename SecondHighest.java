public class  SecondHighest {
    public static void main(String[] args) {
        int a[] = {6, 8, 2, 4, 3, 1, 5, 7};
        int temp;

        // Sort the array in ascending order
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Sorted array:");

        for (int element : a) {
            System.out.print(element + " ");// This code prints the current element (the value of element) followed by a space. I
        }

        // The second smallest element is at index 1
        System.out.println("\nSecond smallest element is: " + a[1]);
        // The second largest element is at index a.length - 2
        System.out.println("Second Largest element is: " + a[a.length - 2]);
    }
}
