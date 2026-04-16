public class Q10 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};

        // Create new array of same size
        int[] arr2 = new int[arr1.length];

        // Copy elements
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        // Print copied array
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}