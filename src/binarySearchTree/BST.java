package binarySearchTree;

public class BST {

    static class Node {
        int key;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
        }
    }

    private Node root;

    public void insert(int key) {
        root = insert(root, key);
    }

    private Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }

        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        }

        return node;
    }

    public boolean search(int key) {
        return search(root, key);
    }

    private boolean search(Node node, int key) {
        if (node == null) {
            return false;
        }

        if (key == node.key) {
            return true;
        }

        if (key < node.key) {
            return search(node.left, key);
        } else {
            return search(node.right, key);
        }
    }

    public int minimum() {
        Node current = root;

        while (current.left != null) {
            current = current.left;
        }

        return current.key;
    }

    public int maximum() {
        Node current = root;

        while (current.right != null) {
            current = current.right;
        }

        return current.key;
    }

    public void delete(int key) {
        root = delete(root, key);
    }

    private Node delete(Node node, int key) {
        if (node == null) {
            return null;
        }

        if (key < node.key) {
            node.left = delete(node.left, key);
        } else if (key > node.key) {
            node.right = delete(node.right, key);
        } else {
            if (node.left == null && node.right == null) {
                return null;
            }

            if (node.left == null) {
                return node.right;
            }

            if (node.right == null) {
                return node.left;
            }

            Node predecessor = maximumNode(node.left);
            node.key = predecessor.key;
            node.left = delete(node.left, predecessor.key);
        }

        return node;
    }

    private Node maximumNode(Node node) {
        while (node.right != null) {
            node = node.right;
        }

        return node;
    }
}