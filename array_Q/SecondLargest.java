package ArrayPractice;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,4,5,6};
        System.out.println(secondLargest(arr));
    }
    static int secondLargest(int [] arr){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];

            } else if (arr[i]>secondMax && arr[i]!=max) {
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
}
