import java.util.Scanner;

public class TwoSum {

    static boolean twoSum(int[] arr, int k){
        
        int index1 = 0;
        int index2;


        while(index1<arr.length){
            for(index2=index1+1;index2<arr.length;index2++){
                if(k-arr[index1]==arr[index2]){
                    return true;
                }
            }
            index1++;
        }
        return false;
    }

    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();

            System.out.println("enter the array elements: ");
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter k value: ");
            int k = sc.nextInt();

            if(twoSum(arr,k)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

            sc.close();
        }
    }
}
