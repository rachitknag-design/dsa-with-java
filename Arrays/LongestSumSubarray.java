import java.util.Scanner;

public class LongestSumSubarray {
    static int longestSubarray(int[] arr, int k){
        // int sum;
        // int count=0;

        // for(int i=0;i<arr.length;i++){
        //     sum = arr[i];
        //     for(int j=i+1;j<arr.length;j++){
        //         sum = sum+arr[j];
        //         if(sum == k){
        //             count = (count<(j-i+1))?(j-i+1):count;
        //         }
        //     }
        // }

        // if(count!=0){
        //     return count;
        // }
        // return count;
        int left = 0, right = 0, sum = arr[0], maxLen = 0;

        while(right<arr.length){
            if(left<=right&&sum>k){
                sum=sum-arr[left];
                left++;
            }

            if(sum==k){
                maxLen = (maxLen<(right-left+1))?(right-left+1):maxLen;
            }

            right++;
            if(right<arr.length){
            sum=sum+arr[right];
            }
        }

            return maxLen;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the array element: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Value k: ");
        int k = sc.nextInt();

        System.out.println("The longest subarray size sum to "+k+" is: "+longestSubarray(arr, k));
        sc.close();
    }
    
}
