public class FindtheSecondMaximumElement {
    public static void main(String[] args) {
        int arr[] = {2,1,4,5,3,7};
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                second_max = max;
                max = arr[i];
            }else if(arr[i]>second_max&&arr[i]!=max){
                second_max = arr[i];
            }
        }

        if(second_max == Integer.MIN_VALUE){
            return;
        }else{
            System.out.println("Second maximum element : "+second_max);
        }
    }
}
