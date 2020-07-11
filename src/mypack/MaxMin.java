package mypack;

public class MaxMin {
    public static void main(String[] args) {
        maxMin();
    }

    public static void maxMin(){
        int[] arr = {12,23,1,345,888,23,0,23};
        int min = arr[0];
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println("Max is: "+max+" Min is: "+min);

    }
}
