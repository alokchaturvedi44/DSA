import java.util.ArrayList;

public class Pair_Sum_2 {

    // this problem is for sorted and rotated arraylist
    public static boolean pairsum2(ArrayList<Integer> list, int target){
        int n = list.size();
        int bp = -1;  // breaking point or pivot
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                bp =  i;
                break;
            }
        }
        int lp = bp + 1;  // left pointer
        int rp = bp;      // right pointer

        while( lp != rp ){
            if( list.get(lp) + list.get(rp) == target){
                return true;
            }
            else if( list.get(lp) + list.get(rp) < target){
                lp = ( lp + 1) % n;
            }
            else{
                rp = ( n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 20;
        int target2 = 100;
        System.out.println( pairsum2(list, target) );
        System.out.println( pairsum2(list, target2) );
    }
}
