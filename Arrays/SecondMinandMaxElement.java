import java.util.Scanner;

public class SecondMinandMaxElement{


    static int[] findSecondElements(int[] arr){
        if(arr.length<=2){
            return new int[]{-1,-1};
        }
        int ans[] = new int[2];

        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

         for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                secondMin = min;
                min = arr[i];
            }else if(secondMin>arr[i]&&arr[i]!=max){
                secondMin = arr[i];
            }
            ans[0] = secondMin;
        }

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                secondMax = max;
                max = arr[i];
            }else if(secondMax<arr[i]&&arr[i]!=max){
                secondMax = arr[i];
            }
            ans[1] = secondMax;
        }

        return ans;


        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();


        System.out.println("Enter the array elements: ");
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int[] res = findSecondElements(arr);

        System.out.println("Second smallest element: "+res[0]);
        System.out.println("Second largest element: "+res[1]);

        sc.close();
    }
}