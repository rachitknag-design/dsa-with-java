import java.util.Scanner;

class Solution {

    private void reverseArray(int[] arr, int startIndex, int endIndex){
        while(startIndex<endIndex){
            swap(arr, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public void findNextpermutation(int[] arr){
        int index = -1;
        int n = arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            reverseArray(arr, 0, n-1);
            return;
        }

        for(int i=n-1;i>index;i--){
            if(arr[index]<arr[i]){
                swap(arr, index, i);
                break;
            }
        }
        reverseArray(arr,index+1,n-1);
    }
}

public class NextPermutation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Next Permuation: ");
        Solution sol = new Solution();
        sol.findNextpermutation(arr);

        for(int x: arr){
            System.out.print(x+ " ");
        }

        sc.close();
    }
}
