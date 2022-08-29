/**
 * Created by kristofer on 7/13/20.
 */
public class TreeOneZero {
    Node root;

    public TreeOneZero() {
        root = null;
    }

    public TreeOneZero(Integer value) {
        root = new Node(value);
    }

    public Node addRecursively(Node node, Integer value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.getValue()) {
            node.setLeft(addRecursively(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(addRecursively(node.getRight(), value));
        }
        return node;
    }

    public void add(Integer value) {
        this.root = addRecursively(root, value);
    }

    public Node find(Node node, Integer value) {
        if (node == null) {
            return null;
        }
        if (value == node.getValue()) {
            return node;
        } else if (value < node.getValue()) {
            return find(node.getLeft(), value);
        } else {
            return find(node.getRight(), value);
        }
    }

    public boolean contains(Integer value) {
        return find(root, value) != null;
    }

    public static void main(String[] args) {
        TreeOneZero bt = new TreeOneZero();
        bt.add(1);
        bt.add(4);
        bt.add(6);
        bt.add(3);
        bt.add(2);
        bt.add(5);
        System.out.println(bt.contains(6));
        System.out.println(bt.contains(4));
        System.out.println(bt.contains(1));
    }

}
