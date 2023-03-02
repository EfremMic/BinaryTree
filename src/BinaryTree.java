import javax.swing.tree.TreeNode;

public class BinaryTree {

    private TreeNode root;

    public class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    // Method to create a binary tree with the following structure:
    //      0
    //     / \
    //    2   3
    //       / \
    //      5   4
    public void createBinaryTree() {
        TreeNode base = new TreeNode(0); // Create a node with data 0, which is the root node
        TreeNode one = new TreeNode(2);// Create a node with data 2
        TreeNode two = new TreeNode(3);// Create a node with data 3
        TreeNode three = new TreeNode(4);// Create a node with data 4
        TreeNode four = new TreeNode(5);// Create a node with data 5

        // Link the nodes together to form the binary tree
        root = base;// Set the root node to the node with data 0
        base.left = one;// Set the root node to the node with data 0
        base.right = two;// Set the root node to the node with data 0
        two.left = four;// Set the left child of the node with data 3 to the node with data 5
        two.right = three;// Set the left child of the node with data 3 to the node with data 5
    }

    // Main method to create an instance of the BinaryTree class and call the printTree method
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.createBinaryTree();
        tree.printTree();
    }

    // Method to print out the binary tree in inorder traversal
    public void printTree() {
        printTree(root);
    }

    // Recursive helper method to print out the binary tree in inorder traversal
    private void printTree(TreeNode node) {
        if (node != null) {
            printTree(node.left);// Traverse the left subtree
            System.out.print(node.data + " ");// Print the data of the current node
            printTree(node.right);// Traverse the right subtree
        }
    }
}
