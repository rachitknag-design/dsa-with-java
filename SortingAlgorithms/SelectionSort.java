public class SelectionSort {

    public static void sort(int[] arr){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
                
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Array Elements are after sorting: ");
        for(int val : arr){
            System.out.print(val+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        // Print array before sorting
        System.out.println("Before selection sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Call selection sort
        sort(arr);

    }
    
}
