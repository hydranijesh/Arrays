public class Q12 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        boolean equal = true;

        // Check length first
        if (arr1.length != arr2.length) {
            equal = false;
        } else {

            // Compare each element
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    equal = false;
                    break;
                }
            }
        }

        System.out.println("Arrays equal: " + equal);
    }
}