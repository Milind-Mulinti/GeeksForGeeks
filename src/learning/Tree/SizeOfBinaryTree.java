package learning.Tree;

public class SizeOfBinaryTree {
    Node root;
    static int sumBT(Node root){
        if(root == null)
            return 0;
        else
            return (root.item +(sumBT(root.left) + sumBT(root.right)));
    }

    public static void main(String[] args) {
        SizeOfBinaryTree tree = new SizeOfBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(12);
        tree.root.right = new Node(9);

        // create child nodes of left child
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);

       int result =  sumBT(tree.root);
        System.out.println(result);
    }
}
