import java.util.Scanner;

public class LargestElementInArray{

static int findMaxElement(int[] arr){
  int max = arr[0];
  for(int i=1;i<arr.length;i++){
    if(max<arr[i]){
      max = arr[i];
    }
  }
  return max;
}
  
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    //input array size
    System.out.print("Enter array size: ");
    int size = sc.nextInt();

    //declare and initialize array
    int[] arr = new int[size];
    System.out.println("Enter the array elements: ");
    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
    }

    //display max element
    System.out.println("Max Element in array: "+findMaxElement(arr));
    
    sc.close();
  }
}
