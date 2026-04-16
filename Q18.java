import java.util.Arrays;
import java.util.Collections;

public class Q18 {
    public static void main(String[] args) {

        Integer[] arr = {5, 2, 1, 4, 3};

        // Sort in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        // Print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}