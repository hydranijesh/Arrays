public class Q16 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        // Shift right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // First element becomes 0
        arr[0] = 0;

        // Print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}