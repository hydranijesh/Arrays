public class Q11 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};

        // New array size = sum of both arrays
        int[] arr3 = new int[arr1.length + arr2.length];

        int index = 0;

        // Copy first array
        for (int i = 0; i < arr1.length; i++) {
            arr3[index++] = arr1[i];
        }

        // Copy second array
        for (int i = 0; i < arr2.length; i++) {
            arr3[index++] = arr2[i];
        }

        // Print merged array
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
