package eu.sig.training.ch03.binarytree;

public class BinaryTreeSearch {

    // tag::calculateDepth[]
    public static int calculateDepth(BinaryTreeNode<Integer> node, int nodeValue) {
        int depth = 0;
        if (node.getValue() == nodeValue) {
            return depth;
        } else {
            if (nodeValue < node.getValue()) {
                return nextDepth(node.getLeft(), nodeValue);
            } else {
                return nextDepth(node.getRight(), nodeValue);
            }
        }
    }
    // end::calculateDepth[]

    public static int nextDepth(BinaryTreeNode<Integer> node, int currentNodeValue) {
        if (node == null) {
            throw new TreeException("Value not found in tree!");
        } else {
            return 1 + calculateDepth(node, currentNodeValue);
        }
    }

}
