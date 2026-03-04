import java.util.Scanner;

public class RearrangeArrayElementsbySign2 {

    
    static int[] rearrangeArray(int[] arr){
        int[] ans = new int[arr.length];
        int posIndex = 0;
        int negIndex = 1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                ans[negIndex] = arr[i];
                negIndex=negIndex+2;
            }else{
                ans[posIndex] = arr[i];
                posIndex = posIndex+2;
            }
        }
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
