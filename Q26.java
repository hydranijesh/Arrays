public class Q26 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int last = arr[arr.length - 1];

        // Shift right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Put last element at first
        arr[0] = last;

        // Print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}