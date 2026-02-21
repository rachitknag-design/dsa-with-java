import java.util.Scanner;

public class SumArrayElements{

  static int calculateSum(int[] arr){
    int sum = 0;
    for(int i=0;i<arr.length;i++){
      sum = sum+arr[i];
    }
    return sum;
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input array size
    System.out.print("Enter array size: ");
    int size = sc.nextInt();

    //declare array
    int[] arr = new int[size];

    //input array elements
    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
    }

    //function call
    int sum = calculateSum(arr);

    //print output sum
    System.out.println("Sum of array elements: "+sum+".");

    sc.close();
    
  }
}
