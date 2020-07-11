package mypack;

public class RotateToRight {
    public static void main(String[] args) {
        sum();
    }

    public static void sum() {
        int[] arr = {1, 2, 3, 4, 5};

        int n = 2;
        for (int i = 0; i < n; i++) {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
