import java.util.Scanner;

public class RearrangeArrayElementsbySign2 {


    // Function to rearrange array so that
    // positive numbers appear at even indices
    // and negative numbers appear at odd indices
    static int[] rearrangeArray(int[] arr){

        // Create a new array to store the rearranged result
        int[] ans = new int[arr.length];

         // posIndex -> position for positive numbers (even indices)
        // negIndex -> position for negative numbers (odd indices)
        int posIndex = 0;
        int negIndex = 1;

        // Traverse the input array
        for(int i=0;i<arr.length;i++){
            // If the element is negative, place it at odd index
            if(arr[i]<0){
                ans[negIndex] = arr[i];
                negIndex=negIndex+2; // move to next odd index
            }
            // If the element is positive, place it at even index
            else
                {
                ans[posIndex] = arr[i];
                posIndex = posIndex+2; // move to next even index
            }
        }
        // Return the rearranged array
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        arr = rearrangeArray(arr);

        System.out.println("Array after Rearrangement: ");
        for(int x: arr){
            System.out.print(x+" ");
        }
        sc.close();
    }    
}
