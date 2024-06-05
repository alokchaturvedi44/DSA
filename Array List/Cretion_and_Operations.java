import java.util.ArrayList;
import java.util.*;
public class Cretion_and_Operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // Add element
        list.add(5);
        list.add(12);
        list.add(23);
        list.add(10);
        list.add(44);
        list.add(90);

        list2.add("Alok");
        list2.add("Hardik");
        list2.add("Vinit");

        System.out.println(list);
        System.out.println(list2);

        // Get an element
        int element = list.get(2);
        System.out.println(element);

        String str = list2.get(0);
        System.out.println(str);

        // Remove an element
//        list.remove(1);
//        System.out.println(list);
        list2.remove(0);
        System.out.println(list2);

        // Set an element or update
        list.set( 1, 45);
        System.out.println(list);

        // Contains an element
        System.out.println(list.contains(5));
        System.out.println(list.contains(100));
        System.out.println(list2.contains("Alok"));
        System.out.println(list2.contains("Hardik"));

        // Size of ArrayList
        System.out.println("Size of the Array list is: " + list.size());

        // traversal
        System.out.print("Elements of the list are: ");
        for( int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ,");
        }
    }

}
