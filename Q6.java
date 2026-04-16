public class Q6 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3};

        int oldValue = 2;
        int newValue = 9;

        // Replace values
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldValue) {
                arr[i] = newValue;
            }
        }

        // Print updated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}