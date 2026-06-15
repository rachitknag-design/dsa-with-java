// Insert an Element at the Xth Position, Shifting Right

import java.util.Arrays;
import java.util.Scanner;

public class InsertanElementattheXthPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int arr[] = {10,20,40,50};
        int newArr[]  = new int[arr.length+1];
        System.out.print("Enter new Element: ");
        int input = sc.nextInt();
        System.out.print("Enter X: ");
        int x = sc.nextInt();

        if(x<1||x>arr.length){
            System.out.println("Invalid input");
            return;
        }

        for(int i=0;i<x-1;i++){
            newArr[i] = arr[i];
        }
        newArr[x-1] = input;

        for(int i=x;i<newArr.length;i++){
            newArr[i] = arr[i-1];
        }

        System.out.println(Arrays.toString(newArr));

        sc.close();

    }    
}
