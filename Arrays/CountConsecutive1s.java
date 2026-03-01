import java.util.Scanner;

public class CountConsecutive1s {
    static int countones(int[] arr){
        int count=0,maxones=1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                maxones = (maxones<count)?count:maxones;
            }else{
                count=0;
            }
        }

        return maxones;
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
        
        System.out.println("The max consecutive zeros count is : "+countones(arr));

        sc.close();
    }
}
