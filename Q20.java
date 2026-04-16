public class Q20 {
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 7};

        int smallest = arr[0];
        int second = Integer.MAX_VALUE;

        // Find smallest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Find second smallest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < second && arr[i] != smallest) {
                second = arr[i];
            }
        }

        System.out.println("Second smallest = " + second);
    }
}