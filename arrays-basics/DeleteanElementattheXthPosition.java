import java.util.Arrays;
import java.util.Scanner;

public class DeleteanElementattheXthPosition {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int arr[] = {10,20,40,50};
        int newArr[]  = new int[arr.length-1];
        System.out.print("Enter Index: ");
        int index = sc.nextInt();
        if(index<1||index>arr.length){
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        for(int i=0;i<index-1;i++){
            newArr[i] = arr[i];
        }

        for(int i=index-1;i<newArr.length;i++){
            newArr[i] = arr[i+1];
        }
        

        System.out.println(Arrays.toString(newArr));

        sc.close();

    }    
}
