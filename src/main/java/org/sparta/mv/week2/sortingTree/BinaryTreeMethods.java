package org.sparta.mv.week2.sortingTree;

public interface BinaryTreeMethods {
    Node getRootElement();

    int getNumberOfElements();

    void addElement(int element);

    void addElements(final int[] elements);

    boolean findElement(int value);

//    int getLeftChild(int element) throws ChildNotFoundException;
//
//    int getRightChild(int element) throws ChildNotFoundException;
//
//    int[] getSortedTreeAsc();
//
//    int[] getSortedTreeDesc();
}

