package mypack;

public class FreqArray {
    public static void main(String[] args) {
        freqArray();
    }

    public static void freqArray() {
        int[] arr = {1, 23, 1, 1, 34, 45, 23, 3};
        int[] fr = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    fr[j] = visited;
                    count++;
                }
            }
            if (fr[i] != visited) {
                fr[i] = count;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (fr[i] != visited) {
                System.out.println(arr[i] + " " + fr[i]);
            }
        }
    }
}
