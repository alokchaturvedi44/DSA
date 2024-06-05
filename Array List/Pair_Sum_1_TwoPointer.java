import java.util.ArrayList;

public class Pair_Sum_1_TwoPointer {
    public static boolean pairsum1(ArrayList<Integer> list, int target){
        int lp = 0;   // left pointer
        int rp = list.size() - 1;  // right pointer

        while( lp < rp ){
            if( list.get(lp) + list.get(rp) == target){
                return true;
            }
            else if( list.get(lp) + list.get(rp) < target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(12);
        list.add(4);
        list.add(5);

        int target = 5;
        int target2 = 100;
        System.out.println( pairsum1(list, target) );
        System.out.println( pairsum1(list, target2) );
    }
}
