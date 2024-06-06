package ArrayPractice;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr={0,1,1,1,2,1,2,0,0,0,1};
        int low=0;
        int mid=0;
        int high= arr.length-1;
        while (mid<=high){
            switch (arr[mid]){
                case 0:{
                    int t=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=t;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    int t=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=t;
                    high--;
                    break;
                }
            }
        }
        for (int i: arr){
            System.out.println(i);
        }
    }
}
