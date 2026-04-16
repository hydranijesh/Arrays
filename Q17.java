import java.util.Arrays;

public class Q17 {
    public static void main(String[] args) {

        int[] arr = {5, 2, 1, 4, 3};

        // Sort array (ascending)
        Arrays.sort(arr);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}