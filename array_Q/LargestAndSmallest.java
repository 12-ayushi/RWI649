package ArrayPractice;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,51,2,3,4};
        System.out.println(largeElement(arr));
        System.out.println(smallElement(arr));
    }
    static int largeElement(int [] arr ){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int smallElement(int[] arr){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
