import java.util.Scanner;

public class BubbleSort {

    static void sort(int[] arr){
        int n = arr.length;

        for(int i=n-1;i>=0;i--){
            int maxIndex = i;
            for(int j=i-1;j>0;j++){
                if(arr[maxIndex]<arr[j]){
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Array after sorting: ");
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
