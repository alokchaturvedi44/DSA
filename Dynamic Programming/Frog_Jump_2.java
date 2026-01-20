public class Frog_Jump_2 {

    public static int unvisitedLeaves(int N, int leaves, int frogs[]) {
        int result = 0;
        boolean visited[] = new boolean[leaves+1];
        
        for(int i=0; i<N; i++){
            int curr = frogs[i];
            
            if(curr <= leaves && !visited[curr]){
                for(int j=curr; j<=leaves; j+=curr){
                    visited[j] = true;
                }
            }
        }
        for(int i=1; i<=leaves; i++){
            if(!visited[i]) result++;
        }
        return result;
    }
    public static void main(String[] args) {
        int N = 3;
        int leaves = 4;
        int frogs[] = {3, 2, 4};

        System.out.println(unvisitedLeaves(N, leaves, frogs));
    }
}