package 第四章_解决面试的思路;

import common.Node;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;

/**
 *
 */
public class 从上往下打印二叉树_按行打印 {
    public static void main(String[] args) {
        Node root = new Node( null, null,1);
        Node left1 = new Node( null, null,2);
        Node right1 = new Node( null, null,3);
        root.lnode=left1;
        root.rnode=right1;

        printTreeAndLine(root);

    }

    /**
     * 通过两个变量来记录一个last(当前最后一个)，一个是nlast(下一行最后一个)
     * @param root
     */
    public static void printTreeAndLine(Node root) {
        if (null == root) {
            return;
        }
        Node last = root;
        Node nlast = null;
        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.print(temp.data + ",");
            if (temp.lnode != null) {
                queue.add(temp.lnode);
                nlast = temp.lnode;
            }
            if (temp.rnode != null) {
                queue.add(temp.rnode);
                nlast = temp.rnode;
            }
            if (last == temp) {
                System.out.println();
                last = nlast;
            }
        }
    }
}
