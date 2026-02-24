import java.util.Scanner;

public class LeftRotateArrayByOne {

    static int[] leftRotate(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;
        }
        

        return arr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the array size: ");
        int size = sc.nextInt();

        System.out.println("Enter the array elements: ");
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        arr = leftRotate(arr);

        for(int x : arr){
            System.out.print(x+" ");
        }


        sc.close();
    }
    
}
