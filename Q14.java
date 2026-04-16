public class Q14 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4};
        int key = 2;

        int index = -1;

        // Traverse entire array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i; // keep updating
            }
        }

        System.out.println("Last occurrence at index " + index);
    }
}