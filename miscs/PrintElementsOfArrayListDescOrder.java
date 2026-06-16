import java.util.ArrayList;
import java.util.Collections;

public class PrintElementsOfArrayListDescOrder {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(2);
        li.add(43);
        li.add(53);
        li.add(11);
        li.add(23);
        li.add(92);

        Collections.sort(li,Collections.reverseOrder());

        System.out.println(li);
    }
}
