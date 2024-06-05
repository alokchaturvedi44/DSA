public class Delete_Node {
    public static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(root.data > value){
            root.left = insert(root.left, value);
        }
        else{
            root.right = insert(root.right, value);
        }
        return root;
    }
    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static Node delete(Node root, int value){
        if(root.data < value){
            root.right = delete(root.right, value);
        }
        else if(root.data > value){
            root.left = delete(root.left, value);
        }
        else{
            // case 1 -> no child
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2 -> single child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // case 3 -> two child
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        Inorder(root);
        System.out.println();

        root = delete(root, 8 );
        Inorder(root);
    }
}
