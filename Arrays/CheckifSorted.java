import java.util.Scanner;

public class CheckifSorted{

    static boolean isSorted(int[] arr){
        boolean issorted = false;
        int count=0;

        if(arr[0]<arr[1]){
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]<arr[i+1]){
                    count++;
                }
            }
        }else{
            for(int i=arr.length-1;i>=0;i--){
                if(arr[i]>arr[i-1]){
                    count++;
                }
            }
        }

        if(count == arr.length-1){
            issorted = true;
        }
        return issorted; 
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = sc.nextInt();

        System.out.println("Enter the array elements: ");
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(isSorted(arr));


        sc.close();
    }
}