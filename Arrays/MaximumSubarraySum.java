import java.util.Scanner; 

public class MaximumSubarraySum {

    //Kadane's Algorithm
    static int maxSumSubArray(int[] arr){
       int maxSum = Integer.MIN_VALUE;
       int sum =0 ;
       for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
        if(sum>maxSum){
            maxSum=sum;
        }
        if(sum<0){
            sum=0;
        }
       }
       return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        System.out.println("ENter the array elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Maximum Sum of an subArray: "+maxSumSubArray(arr));
        sc.close();
    }
}
