import java.util.ArrayList;

public class Swaping {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(12);
        list.add(4);
        list.add(5);

        swap(list, 2, 3);
        swap(list, 1, 5);
        System.out.println(list);
    }
}
