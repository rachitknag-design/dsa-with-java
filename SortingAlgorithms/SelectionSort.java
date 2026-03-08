import java.util.Scanner;

public class SelectionSort {

    static void sort(int[] arr){

        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted array is: ");
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        sort(arr);

        sc.close();
    }
}