import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Solution {
    public ArrayList<Integer> findLeaderinArray(int[] arr){
        ArrayList<Integer> ans  = new ArrayList<>();

        if(arr.length == 0){
            return ans;
        }

        int max = arr[arr.length-1];
        ans.add(arr[arr.length-1]);

        for(int i = arr.length-1;i>=0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }

        Collections.reverse(ans);
        
        return ans;
    }
}

public class LeadersinanArray {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the size of array: ");
       int n = sc.nextInt();

       System.out.println("Enter the array elements: ");
       int[] arr = new int[n];
       for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
       }

       
       System.out.println("Leaders from the array are: ");
       Solution sol = new Solution();
       ArrayList<Integer> ans = sol.findLeaderinArray(arr);
       

       for(int x : ans){
            System.out.print(x+" ");
       }
       
       sc.close();
    }
}
