//The following code is Dynamic Node Implementation of Binary Tree
class Node {
    char key;
    Node left, right;

    public Node(char item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree(char key) {
        root = new Node(key);
    }

    BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node('A');
        tree.root.left = new Node('B');
        tree.root.right = new Node('C');
        tree.root.left.left = new Node('D');
        tree.root.left.right = new Node('E');
    }
}
