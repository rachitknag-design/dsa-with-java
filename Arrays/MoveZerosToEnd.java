import java.util.Scanner;

public class MoveZerosToEnd {

    static void moveZeros(int[] arr){


        int j=-1;
        //to select first index of element 0
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        //if no 0's is found return
        if(j==-1){
            return;
        }

        //swap non-zeros element with zeros
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        System.out.println("Enter the array elements: ");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        moveZeros(arr);

        for(int x:arr){
            System.out.print(x+", ");
        }

        
        sc.close();
    }
}
