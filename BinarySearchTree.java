/**
 * BinarySearchTree
 */
public class BinarySearchTree {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    private Node root;

    private BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertrec(root, key);
    }

    public Node insertrec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (root.data > key) {
            root.left = insertrec(root.left, key);
        } else {
            root.right = insertrec(root.right, key);
        }
        return root;
    }

    public void inorder() {
        inorderTrav(root);
    }

    private void inorderTrav(Node root) {
        if (root != null) {
            inorderTrav(root.left);
            System.out.print(root.data + " ");
            inorderTrav(root.right);
        }
    }

    public void preOrder() {
        preOrderTrav(root);
    }

    private void preOrderTrav(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderTrav(root.left);
            preOrderTrav(root.right);
        }
    }

    public void postOrder() {
        postOrderTrav(root);
    }

    private void postOrderTrav(Node root) {
        if (root != null) {

            postOrderTrav(root.left);
            postOrderTrav(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(60);
        bst.insert(35);
        bst.insert(75);
        bst.insert(40);
        bst.insert(20);
        bst.insert(70);
        bst.insert(85);
        System.out.println("Completed");
        bst.inorder();
        System.out.println("Completed");
        bst.preOrder();
        System.out.println("Completed");
        bst.postOrder();
    }

}