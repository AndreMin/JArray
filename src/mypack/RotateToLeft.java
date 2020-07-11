package mypack;

public class RotateToLeft {
    public static void main(String[] args) {
        rotateToLeft();
    }

    public static void rotateToLeft() {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2;
        for (int i = 0; i < n; i++) {
            int first = arr[0];
            int j;
            for (j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = first;
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
