package modules.Algos.binaryTree;

/**
 *  Sample program to explain binary inorder traversal.
 *  -Inorder traversal is defined as a type of tree traversal technique which follows the Left-Root-Right pattern,
 *  such that: The left subtree is traversed first. Then the root node for that subtree is traversed.
 *  Finally, the right subtree is traversed.
 *
 */
class Node {

    int key;
    Node left,right;

    Node(int key) {
        this.key = key;

        left = right = null;
    }

}


public class BinaryTreeInorderTraversalTest {

    private Node root;

    public BinaryTreeInorderTraversalTest() {
        root = null;
    }


    public void inOrderTraversal(Node node) {

        if(node == null) return;

        inOrderTraversal(node.left);
        System.out.println("Key = "+node.key);
        inOrderTraversal(node.right);

    }

    public static void main(String[] args) {

        BinaryTreeInorderTraversalTest test = new BinaryTreeInorderTraversalTest();
        test.root = new Node(1);
        test.root.left = new Node (2);
        test.root.right  = new Node (3);
        test.root.left.left = new Node (4);
        test.root.left.right = new Node (5);
        test.root.right.left  = new Node (6);
        test.root.right.right  = new Node (7);
        test.root.right.right.left  = new Node (8);
        test.root.right.right.right  = new Node (9);

        test.inOrderTraversal(test.root);

    }
}
