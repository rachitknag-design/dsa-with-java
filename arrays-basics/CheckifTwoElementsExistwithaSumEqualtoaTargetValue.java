import java.util.HashSet;
import java.util.Set;

public class CheckifTwoElementsExistwithaSumEqualtoaTargetValue {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 3, 6};
        int target = 18;
        boolean isExists = false;
        for(int i=0;i<arr.length-1;i++){
            int prefixSum = target - arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(prefixSum == arr[j]){
                    isExists = true;
                    break;
                }
            }
        }

        Set<Integer> st = new HashSet<>();
        boolean isExists2 = false;
        for(int ele : arr){
            int prefixSum = target-ele;

            if(st.contains(prefixSum)){
                isExists2 = true;
                break;
            }
            st.add(ele);
        }
        System.out.println("Using sets: "+isExists2);
        System.out.println("Using loops approach: "+ isExists);
    }
}
