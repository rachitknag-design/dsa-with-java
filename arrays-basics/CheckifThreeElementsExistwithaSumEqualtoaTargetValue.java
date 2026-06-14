import java.util.HashSet;
import java.util.Set;

public class CheckifThreeElementsExistwithaSumEqualtoaTargetValue {
    public static void main(String[] args) {
        int arr[] = {1,4,6,8,2};
        int target = 12;
        boolean isExists = false;

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int prefixSum = target - (arr[i]+arr[j]);
                for(int k=j+1;k<arr.length;k++){
                    if(prefixSum==arr[k]){
                        isExists = true;
                        break;
                    }
                }
            }
        }

        boolean isExists1 = false;
        for(int i=0;i<arr.length-2;i++){
            int remainingTarget = target - arr[i];
            
            Set<Integer> st = new HashSet<>();
            for(int j=i+1;j<arr.length;j++){
                int prefixSum = remainingTarget - arr[j];

                if(st.contains(prefixSum)){
                    System.out.println("Triplets found: "+arr[i]+" "+" "+prefixSum+" "+arr[j]);
                    isExists1 = true;
                    break;
                }
                st.add(arr[j]);
            }
        }

        System.out.println("Using loops approach: "+isExists);
        System.out.println("Using Set approach: "+isExists1);
    }
}
