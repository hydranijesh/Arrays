public class Q9 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        // Print even numbers
        System.out.print("Even: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();

        // Print odd numbers
        System.out.print("Odd: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}