package 第四章_解决面试的思路;

import common.Node;

import java.util.Stack;

/**
 * 之字打印二叉树，我们需要借助于栈来实现
 * 因为第一行的时候，从左到右
 * 第二行的时候，从右到左，需要先进的后出，所以我们需要借助于栈来实现。
 */
public class 之字打印二叉树 {
    public static void main(String[] args) {
        Node root = new Node( null, null,1);
        Node left1 = new Node( null, null,2);
        Node right1 = new Node( null, null,3);
        root.lnode=left1;
        root.rnode=right1;
        left1.lnode = new Node( null, null,4);
        left1.rnode = new Node( null, null,5);
        right1.lnode = new Node( null, null,6);
        right1.rnode= new Node( null, null,7);

        printZHI(root);

    }

    public static void printZHI(Node root) {
        if(null==root){
            return;
        }
        // 标记是从左到右，还是从右到左
        // true的时候，表示是从左到右
        boolean flag=true;
        Stack<Node> leftToRight = new Stack<Node>();
        leftToRight.add(root);
        Stack<Node> rightToLeft = new Stack<Node>();

        while(!leftToRight.isEmpty() || !rightToLeft.isEmpty()){
            if(flag){
                //从左到右
                Node temp = leftToRight.pop();
                System.out.print(temp.data+" ");
                if(temp.lnode!=null){
                    rightToLeft.add(temp.lnode);
                }
                if(temp.rnode!=null){
                    rightToLeft.add(temp.rnode);
                }

                if(leftToRight.isEmpty()){
                    System.out.println();
                    flag=false;
                }
            }else{
                //从右到左
                Node temp = rightToLeft.pop();
                System.out.print(temp.data+" ");
                if(temp.lnode!=null){
                    leftToRight.add(temp.rnode);
                }
                if(temp.rnode!=null) {
                    leftToRight.add(temp.lnode);
                }

                if(rightToLeft.isEmpty()){
                    System.out.println();
                    flag=true;
                }
            }
        }
    }
}
