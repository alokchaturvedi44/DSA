public class Transform_to_SumTree {
    public static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int Transform(Node root){
        if(root == null){
            return 0;
        }
        int leftchild = Transform(root.left);
        int rightchild = Transform(root.right);

        int data = root.data;
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftchild + newRight + rightchild;

        return data;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        //       1
        //     /   \
        //    2     3
        //  /   \  /  \
        // 4    5  8   9
        //     /        \
        //    6          7

        //        44
        //      /   \
        //    15     24 
        //   /  \   /  \
        //  0    6 0    7   
        //      /        \
        //     0          0 

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.right.left = new Node(8);
        root.right.right = new Node(9);
        root.right.right.right = new Node(7);

        Transform(root);
        preorder(root);
    }
}
