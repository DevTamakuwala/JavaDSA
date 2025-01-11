package BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(47);
        binarySearchTree.rInsert(21);
        binarySearchTree.rInsert(18);
        binarySearchTree.rInsert(27);
        binarySearchTree.rInsert(76);
        binarySearchTree.rInsert(52);
        binarySearchTree.rInsert(82);


        System.out.println(binarySearchTree.minValue(binarySearchTree.root));
        System.out.println(binarySearchTree.minValue(binarySearchTree.root.right));

        binarySearchTree.insert(2);
        binarySearchTree.insert(1);
        binarySearchTree.insert(3);

        System.out.println("\nRoot: " + binarySearchTree.root.value);
        System.out.println("\nRoot --> Left: " + binarySearchTree.root.left.value);
        System.out.println("\nRoot --> Right: " + binarySearchTree.root.right.value);

        binarySearchTree.deleteNode(2);

        System.out.println("\nRoot: " + binarySearchTree.root.value);
        System.out.println("\nRoot --> Left: " + binarySearchTree.root.left.value);
        System.out.println("\nRoot --> Right: " + binarySearchTree.root.right);

        System.out.println(binarySearchTree.rContains(2));
        System.out.println(binarySearchTree.contains(27));


        binarySearchTree.insert(47);
        binarySearchTree.insert(21);
        binarySearchTree.insert(76);
        binarySearchTree.insert(18);
        binarySearchTree.insert(27);
        binarySearchTree.insert(52);
        binarySearchTree.insert(82);

        System.out.println(binarySearchTree.BFS());
        System.out.println(binarySearchTree.DFSPreOrder());
        System.out.println(binarySearchTree.DFSPostOrder());
        System.out.println(binarySearchTree.DFSInOrder());
    }
}
