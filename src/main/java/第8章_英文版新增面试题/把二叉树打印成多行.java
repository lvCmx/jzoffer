package 第8章_英文版新增面试题;

import common.Node;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class 把二叉树打印成多行 {
    public static void printTree(Node node){
        if(node==null){
            return ;
        }
        ArrayBlockingQueue<Node> queue = new ArrayBlockingQueue<Node>(100);
        queue.add(node);
        int nextLevel=0;
        int toBePrinted=1;
        while(!queue.isEmpty()){
            Node poll = queue.poll();
            System.out.print(poll.data);
            if(poll.lnode!=null){
                queue.add(poll.lnode);
                ++nextLevel;
            }
            if(poll.rnode!=null){
                queue.add(poll.rnode);
                ++nextLevel;
            }
            --toBePrinted;
            if(toBePrinted==0){
                System.out.println();
                toBePrinted=nextLevel;
                nextLevel=0;
            }
        }
    }
}
