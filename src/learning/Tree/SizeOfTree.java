package learning.Tree;

public class SizeOfTree {
    static int size(Node root){
        if(root == null)
            return 0;
        else
            return 1+(size(root.right) + size(root.left));
    }
}
