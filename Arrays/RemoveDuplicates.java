import java.util.Scanner;

public class RemoveDuplicates {

    static int[] func(int[] arr){
        
       // int index = 0;

        for(int j = 1;j<arr.length;j++){
           
        }
        
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        //input array size
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        //declare and input array 
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        arr = func(arr);

        for(int x : arr){
            System.out.print(x+" ");
        }
        
        sc.close();
    }
}
