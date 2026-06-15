public class FindtheSecondMinimumElement {
    public static void main(String[] args) {
        int arr[] = {3,2,1,4,5,6,9};
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                second_min = min;
                min = arr[i];
            }else if(arr[i]<second_min && arr[i]!=min){
                second_min = arr[i];
            }
        }

        if(second_min == Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println("Second Minimum element : "+second_min);
        }
    }
}
