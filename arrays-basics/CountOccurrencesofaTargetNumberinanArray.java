public class CountOccurrencesofaTargetNumberinanArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,3,4,2,5,6,7,8,5,4,5,7,5,7,8,9,9,3,4,3,2};
        int target = 1;
        int occ = 0;
        for(int ele : arr){
            if(target==ele){
                occ++;
            }
        }
        if(occ==0){
            System.out.println("Target element "+target+" not found in array.");
        }else{
            System.out.println("Target element "+target+" occurance: "+occ);
        }
    }
}
