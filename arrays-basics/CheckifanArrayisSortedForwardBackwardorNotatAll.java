public class CheckifanArrayisSortedForwardBackwardorNotatAll {
    public static void main(String[] args) {
        int[] arr = {5,4,3,24,5};
        if(isAsc(arr)){
            System.out.println("Array sorted in Forward direction.");
        }else if(isDesc(arr)){
            System.out.println("Array sorted in backward direction");
        }else{
            System.out.println("Array is not sorted.");
        }
    }
    private static boolean isDesc(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1])
                return false;
        }
        return true;
    }
    
    private static boolean isAsc(int[] arr) {

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
                return false;
        }

        return true;
    
    }

}
