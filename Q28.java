public class Q28 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5}; // missing 3
        int n = 5;

        int sum = n * (n + 1) / 2; // total sum
        int actual = 0;

        // Find actual sum
        for (int i = 0; i < arr.length; i++) {
            actual += arr[i];
        }

        System.out.println("Missing number = " + (sum - actual));
    }
}