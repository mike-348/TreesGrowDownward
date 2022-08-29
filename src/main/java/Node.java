/**
 * Created by kristofer on 7/13/20.
 */
public class Node {
    Integer value;
    Node left;
    Node right;

    Node(Integer value) {
        this.value = value;
        right = null;
        left = null;
    }

    public Integer getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
