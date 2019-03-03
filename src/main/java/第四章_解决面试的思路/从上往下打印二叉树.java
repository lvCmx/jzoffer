package 第四章_解决面试的思路;

import common.Node;

import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 层次遍历，利用辅助栈来实现
 */
public class 从上往下打印二叉树 {
    public static void main(String[] args) {
        Node root = new Node( null, null,1);
        Node left1 = new Node( null, null,2);
        Node right1 = new Node( null, null,3);
        root.lnode=left1;
        root.rnode=right1;

        printTree(root);

    }

    /**
     * 按层次顺序输出二叉树中的节点
     * @param node
     */
    public static void printTree(Node node){
        if(node==null){
            return ;
        }
        // 基于链表的队列
        LinkedBlockingQueue<Node> queue = new LinkedBlockingQueue();
        queue.add(node);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.println(temp.data);
            if(temp.lnode!=null){
                queue.add(temp.lnode);
            }
            if(temp.rnode!=null){
                queue.add(temp.rnode);
            }
        }
    }
}
