public class Q7 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int key = 3;

        boolean found = false; // Assume not found

        // Check each element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true; // Found the element
                break;        // Stop checking further
            }
        }

        // Print result
        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}