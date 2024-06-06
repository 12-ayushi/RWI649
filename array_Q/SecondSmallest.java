package ArrayPractice;

public class SecondSmallest {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,4,55,6747,7};
        System.out.println(secondSmallest(arr));
    }
    static int secondSmallest(int [] arr){
        int small=Integer.MAX_VALUE;
        int secondSmall=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<small){
                secondSmall=small;
                small=arr[i];
            }else if(arr[i]< secondSmall && arr[i]!=small){
                secondSmall=arr[i];
            }
        }
        return secondSmall;
    }
}
