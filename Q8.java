public class Q8 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int even = 0;
        int odd = 0;

        // Traverse array
        for (int i = 0; i < arr.length; i++) {

            // Check even or odd
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}