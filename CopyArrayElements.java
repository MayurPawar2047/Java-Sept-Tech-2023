public class CopyArrayElements {
    public static void main(String[] args) {
        int[] sourceArray = { 1, 2, 3, 4, 5 };
        int[] destinationArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }
        System.out.print("Destination Array: ");
        for (int i = 0; i<destinationArray.length; i++) {
            System.out.print(destinationArray[i]);
        }
     }
}


