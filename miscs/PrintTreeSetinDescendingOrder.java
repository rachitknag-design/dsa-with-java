import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class PrintTreeSetinDescendingOrder {
    public static void main(String[] args) {
        Set<Integer> st = new TreeSet<>(Collections.reverseOrder());
        st.add(23);
        st.add(34);
        st.add(56);
        st.add(1);
        st.add(39);

        System.out.println(st);
    }
}
