package ArrayPractice;

import java.util.Arrays;

public class SortArrays {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,13,3,33,2,22,2,23,3};
        sortArrays(arr);
       for (int i: arr){
           System.out.println(i);
       }
    }
    static void sortArrays(int[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }
}
