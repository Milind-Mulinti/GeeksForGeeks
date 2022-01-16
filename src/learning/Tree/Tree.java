package learning.Tree;

public class Tree {
    Node root;

    static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.item);
            inOrder(root.right);
        }
    }
    static void preOrder(Node root){
        if(root != null){
            System.out.println(root.item);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    static void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.item);
        }
    }


    public static void main(String[] args) {

        // create an object of Tree
        Tree tree = new Tree();

        // create nodes of tree
        tree.root = new Node(1);
        tree.root.left = new Node(12);
        tree.root.right = new Node(9);

        // create child nodes of left child
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);

        System.out.println("In Order traversal");
        tree.inOrder(tree.root);
        tree.preOrder(tree.root);
        tree.postOrder(tree.root);
    }
}
