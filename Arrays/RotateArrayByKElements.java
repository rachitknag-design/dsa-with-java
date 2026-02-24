import java.util.Scanner;

public class RotateArrayByKElements {

    static void reverseArray(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static int[] rotateArray(int[] arr, int K, String direction){
        
        if(arr.length==0 || K==0) return arr;

         K = K%arr.length; //normalization for K if K>arr.length

         if(direction.equals("left")){
         reverseArray(arr, 0, arr.length-1);
         reverseArray(arr, 0, arr.length-K-1);
         reverseArray(arr, arr.length-K+1, arr.length-1);
         }else if(direction.equals("right")){
            reverseArray(arr, 0, arr.length-1);
            reverseArray(arr, 0, K-1);
            reverseArray(arr, K, arr.length-1);
         }
        
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        System.out.println("Enter the array elements: ");
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter K value: ");
        int K = sc.nextInt();
        System.out.print("Select direction from (left/right)? ");
        String direction = sc.next();

        arr = rotateArray(arr,K,direction);

        System.out.println("Array after rotation: ");
        for(int x:arr){
            System.out.print(x+" ");
        }


        sc.close();
    }
    
}
