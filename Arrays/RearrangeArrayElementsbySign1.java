import java.util.Scanner;

public class RearrangeArrayElementsbySign1 {

    // Function to rearrange array so that
    // positive numbers are at even indices
    // and negative numbers are at odd indices
    // using in-place swapping (no extra array)
    static void rearrangeArray(int[] arr){

         // Traverse the array
        for(int i = 0;i<arr.length;i++){
            // If index is even, it should contain a positive number
            if(i%2==0){
                if(arr[i]<0){
                    // Search ahead for a positive number and swap
                    for(int j=i;j<arr.length;j++){
                        if(arr[j]>0){
                            int temp = arr[j];
                            arr[j] = arr[i];
                            arr[i] = temp;
                            break;
                        }
                    }
                }
            }

            // If index is odd, it should contain a negative number
            if(i%2!=0){
                if(arr[i]>0){
                    // Search ahead for a negative number and swap
                    for(int j=i;j<arr.length;j++){
                        if(arr[j]<0){
                            int temp = arr[j];
                            arr[j] = arr[i];
                            arr[i] = temp;
                            break;
                        }
                    }
                }
            }
        }
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

        rearrangeArray(arr);

        System.out.println("Array after Rearrangement: ");
        for(int x: arr){
            System.out.print(x+" ");
        }
        sc.close();
    }    
}
