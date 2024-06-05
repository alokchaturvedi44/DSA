public class Diameter2 {
    public static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }

        Info leftinfo = diameter(root.left);
        Info rightinfo = diameter(root.right);

        int diam = Math.max(Math.max(leftinfo.diam, rightinfo.diam), leftinfo.ht + rightinfo.ht + 1);
        int ht = Math.max(leftinfo.ht, rightinfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        //       1
        //     /   \
        //    2     3
        //  /   \  /  \
        // 4    5  8   9
        //     /        \
        //    6          7

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.right.left = new Node(8);
        root.right.right = new Node(9);
        root.right.right.right = new Node(7);

        System.out.println("Diameter of tree: " + diameter(root).diam);
        System.out.println("Height of tree: " + diameter(root).ht); 
    }
}
