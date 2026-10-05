package binarySearchTree;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();

        int[] S = {8, 3, 12, 6, 15, 5, 13, 20, 7};

        for (int x : S) {
            tree.insert(x);
        }

        System.out.println(tree.search(13)); // true
        System.out.println(tree.minimum());  // 3
        System.out.println(tree.maximum());  // 20

        tree.delete(12);
    }
}