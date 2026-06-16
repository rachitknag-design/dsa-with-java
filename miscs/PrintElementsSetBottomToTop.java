import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintElementsSetBottomToTop {
    public static void main(String[] args) {
        Set<Integer> st = new LinkedHashSet<>();
        st.add(100);
        st.add(5);
        st.add(67);
        st.add(2);
        st.add(89);

        List<Integer> li = new ArrayList<>(st);

        for(int i = li.size()-1;i>=0;i--){
            System.out.println(li.get(i));
        }
        
    }
}
