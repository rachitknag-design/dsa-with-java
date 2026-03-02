import java.util.Scanner;

public class SortArrayofZerosOnesTwos {

    static void sortArray(int[] arr){
        
        //dutch Flag algorithm

        int low = 0, mid = 0, high = arr.length-1;

        while (mid<=high){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }

            if(arr[mid] == 1){
                mid++;
            }

            if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENter the array size: ");
        int n = sc.nextInt();

        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        sortArray(arr);

        System.out.println("After sorting:");
        for(int x: arr){
            System.out.print(x+" ");
        }


        sc.close();
    }

}