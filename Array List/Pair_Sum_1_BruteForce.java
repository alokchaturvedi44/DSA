import java.util.ArrayList;
public class Pair_Sum_1_BruteForce {
    public static boolean pairsum1(ArrayList<Integer> list, int target){

        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
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
        System.out.println( pairsum1(list, target) );
        System.out.println( pairsum1(list, 1) );
    }
}
