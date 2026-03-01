// import java.util.Scanner;

// public class UnionOfTwoSortedArray {

//     static List<Integer> findUnion(int[] arr1, int[] arr2){
//        int m = arr1.length;
//        int n = arr2.length;
     
//        int i=0;
//        int j=0;
//        int index = 0;

//        while(i<m && j<n){
//         if(arr1[i]<=arr2[j]){
//             if(index==0||UnionArr[index-1]!=arr1[i]){
//                  UnionArr[index++] = arr1[i];
//             }
//             i++;
//         }else{
//             if(index==0||UnionArr[index-1]!=arr2[j]){
//                  UnionArr[index++] = arr2[j];
//             }
//             j++;
//         }
//        }
//        while(i<m){
//          if(index==0||UnionArr[index-1]!=arr1[i]){
//                 UnionArr[index++] = arr1[i];
//             }
//             i++;
//        }
//        while(j<n){
//         if(index==0||UnionArr[index-1]!=arr2[j]){
//                 UnionArr[index++] = arr2[j];
//             }
//             j++;
//        }
        
//         return UnionArr;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of 1st array: ");
//         int m = sc.nextInt();
//         System.out.print("Enter the size of 2nd array: ");
//         int n = sc.nextInt();

//         System.out.println("Enter "+m+" elements for 1st array: ");
//         int[] arr1 = new int[m];
//         for(int i=0;i<arr1.length;i++){
//             arr1[i] = sc.nextInt();
//         }

//         System.out.println("Enter "+n+" elements for 2nd array: ");
//         int[] arr2 = new int[n];
//         for(int i=0;i<arr2.length;i++){
//             arr2[i] = sc.nextInt();
//         }

//         int[] res = findUnion(arr1,arr2);

//         for(int x : res){
//             System.out.print(x+" ");
//         }


//         sc.close();
//     }
    
// }
import java.util.*;

class Solution {
    // Function to find union of two sorted arrays using two pointers
    public List<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        // List to store union elements
        List<Integer> Union = new ArrayList<>();

        // Initialize pointers
        int i = 0, j = 0;

        // Iterate while both arrays have elements
        while (i < n && j < m) {
            // If element in arr1 is smaller
            if (arr1[i] < arr2[j]) {
                // Add if empty or not duplicate
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;  // Move pointer in arr1
            }
            // If element in arr2 is smaller
            else if (arr2[j] < arr1[i]) {
                // Add if empty or not duplicate
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;  // Move pointer in arr2
            }
            else {
                // Elements are equal, add once if not duplicate
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++; j++;  // Move both pointers
            }
        }

        // Append remaining elements from arr1
        while (i < n) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }

        // Append remaining elements from arr2
        while (j < m) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }

        // Return the union list
        return Union;
    }
}

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        int n = arr1.length, m = arr2.length;

        Solution obj = new Solution();
        List<Integer> result = obj.findUnion(arr1, arr2, n, m);

        System.out.print("Union of arr1 and arr2 is: ");
        for (int val : result) System.out.print(val + " ");
    }
}

