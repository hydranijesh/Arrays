public class Q19 {
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 7};

        int largest = arr[0];
        int second = arr[0];

        // Find largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Find second largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }

        System.out.println("Second largest = " + second);
    }
}