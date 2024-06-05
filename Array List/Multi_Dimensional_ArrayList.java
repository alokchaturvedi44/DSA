import java.util.ArrayList;

public class Multi_Dimensional_ArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // adding values in list1, list2, list3
        for( int i=1; i<=5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        // adding list1, list2, list3 to mainlist
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        // all the lists are not required to be of the same size
        list2.remove(2);
        list2.remove(1);
        list3.remove(3);

        // linear mainlist
        System.out.println("Linear ArrayList: " + mainlist);

        // 2-D mainlist
        System.out.println("2-D ArrayList: ");
        for(int i=0; i<mainlist.size(); i++){
            ArrayList<Integer> currlist = mainlist.get(i);
            for(int j=0; j<currlist.size(); j++){
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }

    }
}
