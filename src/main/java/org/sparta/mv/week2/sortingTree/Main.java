package org.sparta.mv.week2.sortingTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(10);
        tree.addElement(10);
        tree.addElement(11);
        tree.addElement(12);
        tree.addElement(13);
        tree.addElement(14);
        tree.addElement(15);
        tree.addElement(16);

        System.out.println(tree.findElement(9));
        System.out.println(tree.findElement(12));
    }
}
