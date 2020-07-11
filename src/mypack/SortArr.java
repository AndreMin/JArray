package mypack;

public class SortArr {
    public static void main(String[] args) {
        sortArrAsc();
        System.out.println();
        sortArrDesc();
    }

    public static void sortArrDesc() {
        int[] arr = {11, 2, 358, 4, 55, 6, 1, 1, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] < arr[j]) {
                    int k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortArrAsc() {
        int[] arr = {11, 2, 358, 4, 55, 6, 1, 1, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] > arr[j]) {
                    int k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            System.out.print(arr[i] + " ");
        }
    }
}
