import java.util.ArrayList;

public class Max_in_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(12);
        list.add(4);
        list.add(5);

        int maxim = Integer.MIN_VALUE;
        for( int i=0; i<list.size(); i++){
          /*  if( maxim < list.get(i) ){
                maxim = list.get(i);
            }  */
          // or
          maxim = Math.max( maxim, list.get(i) );
        }
        System.out.println("Maximum element in the list is: " + maxim);
    }
}
