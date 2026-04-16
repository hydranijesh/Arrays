public class Q25 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int first = arr[0];

        // Shift left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Put first element at last
        arr[arr.length - 1] = first;

        // Print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}