import java.util.HashMap;
import java.util.Map;

public class CountUniqueandDuplicateElementsinanArray {
    public static void main(String[] args) {
        int unq = 0, dupli = 0, unq1 = 0, dulpi1 = 0;
        int arr[] = {1,2,1,2,3,4,5,5,6,7,7,8};
        boolean isVis[] = new boolean[arr.length];
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
            if(entry.getValue()==1) unq++;
            else dupli++;
        }

        for(int i=0;i<arr.length;i++){
            int count = 0;
            if(isVis[i]==false){
                for(int j=0;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        isVis[j] = true;
                    }
                }
                if(count==1){
                unq1++;
                }else{
                    dulpi1++;
                }
            }
        }
        System.out.println(mp);

        System.out.println("Unique elements count: "+unq);
        System.out.println("Duplicate elements count: "+dupli);
        System.out.println("For loop approach unique elements: "+unq1);
        System.out.println("For loop approach duplicate elements: "+dulpi1);
    }
}
