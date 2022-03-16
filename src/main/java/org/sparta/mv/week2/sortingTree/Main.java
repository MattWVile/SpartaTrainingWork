package org.sparta.mv.week2.sortingTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(10);
        tree.addElement(9);
        tree.addElement(8);
        tree.addElement(11);
        tree.addElement(12);
        tree.addElement(13);
        tree.addElement(14);
        tree.addElement(15);
        tree.addElement(16);

        System.out.println(tree.findElement(9));
        System.out.println(tree.findElement(12));
        System.out.println(tree.getRootElement().getValue());
        System.out.println(tree.getNumberOfElements());
        System.out.println(tree.getRightChild(10));
        System.out.println(tree.getLeftChild(10));
    }
}
