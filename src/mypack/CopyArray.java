package mypack;

public class CopyArray {

    public static void main(String[] args) {
        copyArr();
    }

    public static void copyArr() {
        int[] arr1 = {1, 34, 45, 2, 32};
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
            System.out.print("Arr1: " + arr1[i] + " ");


        }
        System.out.println();
        for (int i : arr2) {
            System.out.print("Arr2: " + i + " ");
        }
    }
}
