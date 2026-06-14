public class FindtheMinimumElementinanArray {
     public static void main(String[] args) {
        int arr[] = {4,2,5,8,5,9,3,2,4};
        if(arr.length==0){
            System.out.println("Array is empty");
            return;
        }
        int min = arr[0];
        for(int ele: arr){
            if(ele<min){
                min = ele;
            }
        }
        System.out.println("Min Element: "+min);    
    }    
}
