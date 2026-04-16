public class Q15 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        // Shift left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Last element becomes 0
        arr[arr.length - 1] = 0;

        // Print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}