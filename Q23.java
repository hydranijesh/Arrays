public class Q23 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4};

        // Mark duplicates as -1
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    arr[j] = -1; // mark duplicate
                }
            }
        }

        // Print unique elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}