import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintMapBottomToTop {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();

        mp.put(1,"A");
        mp.put(2,"B");
        mp.put(3,"C");
        mp.put(4,"D");

        List<Map.Entry<Integer,String>> li = new ArrayList<>(mp.entrySet());

        for(int i=li.size()-1;i>=0;i--){
            System.out.println(li.get(i));
        }
    }
}
