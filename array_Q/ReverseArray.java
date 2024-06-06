package ArrayPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5};
        reverse(arr);
//        System.out.println(Arrays.toString(arr));
        for(int i: arr){
            System.out.println(i);
        }
    }

    static void reverse(int arr[]){
        int s=0;
        int e= arr.length-1;
        while (s<=e){
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
    }
}
