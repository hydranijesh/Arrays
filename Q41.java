public class Q41 {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1};

        int max = arr[0];

        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }

        System.out.println("Largest = " + max);
    }
}