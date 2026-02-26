import java.util.Scanner;

public class LinearSearchAnElement {

    static int linearSearch(int[] arr, int ele){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                return i;
            }
        }
        
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the siz of array: ");
        int size = sc.nextInt();

        System.out.println("Enter the array elements: ");
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int ele = sc.nextInt();
        
        System.out.println(linearSearch(arr,ele));
        sc.close();
    }
}
