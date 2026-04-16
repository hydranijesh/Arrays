public class Q31 {
    // INTERSECTION OF TWO ARRAYS
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {2, 3, 4};

        // Check common elements
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
}