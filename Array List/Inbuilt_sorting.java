import java.util.ArrayList;
import java.util.Collections;

public class Inbuilt_sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(13);
        list.add(12);
        list.add(42);
        list.add(5);

        System.out.println("Original list: " + list);
        Collections.sort(list);
        System.out.println("Ascending order: " + list);

        // descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order: " + list);
    }
}
