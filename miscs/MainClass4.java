import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass4 {
    public static void main(String[] args) {
        List<Employee> li = new ArrayList<>();
        li.add(new Employee(1, "Rachit", 87000.0));
        li.add(new Employee(2, "Ismail", 24000.0));
        li.add(new Employee(3, "Arpit", 46000.0));
        li.add(new Employee(4, "Kaksha", 66000.0));

        Collections.sort(li,new SortBySalDesc());

        for(Employee e : li){
            System.out.println(e);
        }
    }
}
