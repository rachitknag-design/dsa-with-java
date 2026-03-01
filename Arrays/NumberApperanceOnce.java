import java.util.Scanner;

public class NumberApperanceOnce {

    static int numberOnlyOnce(int[] arr){
        int num=0;

        for(int i=0;i<arr.length;i++){
            num = num^arr[i];
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENter the size of array: ");
        int n = sc.nextInt();
        
        System.out.println("Enter the array elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The element that appers only once is: "+numberOnlyOnce(arr));
        sc.close();
    }
    
}
