## BinaryTree
The BinaryTree repository contains a Java implementation of a binary tree data structure. The code provides functionality to create a binary tree with a predefined structure, traverse the tree in inorder traversal, and print the tree.

# Features
TreeNode class: Represents a node in the binary tree, storing an integer value and references to its left and right children.
createBinaryTree method: Constructs a binary tree with a specific structure, as described in the code comments.
printTree method: Prints the binary tree in inorder traversal order.

# Usage
To use the BinaryTree code:

1, Import the javax.swing.tree.TreeNode class.
2, Create an instance of the BinaryTree class.
3, Call the createBinaryTree method to create the binary tree.
4, Call the printTree method to print the tree in inorder traversal.

# import javax.swing.tree.TreeNode;

 public class BinaryTree {
    // Code implementation...
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.createBinaryTree();
        tree.printTree();
    }
 }

## Example
The following example demonstrates the usage of the BinaryTree class:
 BinaryTree tree = new BinaryTree();
 tree.createBinaryTree();
 tree.printTree();

Output:
2 0 5 3 4

      0
     / \
    2   3
       / \
      5   4

## Contributing
Contributions to the BinaryTree repository are welcome. If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.
