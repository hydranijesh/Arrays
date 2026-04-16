public class Q13 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4};
        int key = 2;

        // Find first occurrence
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("First occurrence at index " + i);
                break; // stop at first match
            }
        }
    }
}