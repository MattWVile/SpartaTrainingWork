package org.sparta.mv.week2.sortingTree;


// they dont see nodes they see values
// code to an api - Who is using your code?

public class BinaryTree implements BinaryTreeMethods{
    private final Node rootNode;
    private int counter = 0;

    public BinaryTree(final int element) {
        rootNode = new Node(element);
    }

    public void addElement(final int element){
        addNodeToTree(rootNode, element);
    }

    public void addElements(final int[] elements){
        for (int element : elements){
            addNodeToTree(rootNode, element);
        }

    }
    public int getNumberOfElements(){
        return counter;
    }

    public boolean findElement(final int value){
        Node node = findNode(value);
        if (node != null){
            return true;
        }
        return false;
    }

    private Node findNode(int element){
        Node node = rootNode;
        while(node != null){
            if(element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()){
                node = node.getLeftChild();
            } else{
                node = node.getRightChild();
            }
        }
        return null;
    }

    private void addNodeToTree (Node node, int element){
        if (element <= node.getValue()){
            if(node.isLeftChildEmpty()){
                Node left = new Node(element);
                node.setLeftChild(left);
                counter ++;
            }else{
                addNodeToTree(node.getLeftChild(), element);
            }
        }else if(element > node.getValue()) {
            if(node.isRightChildEmpty()){
                Node right = new Node(element);
                node.setRightChild(right);
                counter ++;
            }else{
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }

    @Override
    public Node getRootElement() {
        return this.rootNode;
    }

//    @Override
    public int getLeftChild(int element)  {
        int leftChild = findNode(element).getLeftChild().getValue();
        return leftChild;
    }

    //@Override
    public int getRightChild(int element)  {
        int rightChild = findNode(element).getRightChild().getValue();
        return rightChild;
    }


//    public int[] getSortedTreeAsc() {
//        Node node = getRootElement();
//        int[] arrayToSort = new int[counter];
//        Node parent = node;
//        for (int i = 0 ; i < counter - 1; i++){
//            if(!node.isLeftChildEmpty() && node.getRightChild() == arrayToSort[counter - 1 ]){
//                parent = node;
//                node = node.getLeftChild();
//            } else if (node.isLeftChildEmpty()){
//                arrayToSort[i] = node.getValue();
//                i ++;
//                node = parent;
//            } else if (node.isRightChildEmpty()){
//
//            }
//        }
//
//        return new int[0];
//
    public int[] getSortedTreeDesc() {
        return new int[0];
    }
}
