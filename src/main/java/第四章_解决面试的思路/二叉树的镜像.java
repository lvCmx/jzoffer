package 第四章_解决面试的思路;

import common.BinaryTree;
import common.Node;

public class 二叉树的镜像 {

    public static void reverse(Node node){
        if(node==null){
            return ;
        }
        if(node.lnode==null && node.rnode==null){
            return ;
        }
        Node temp=node.lnode;
        node.lnode=node.rnode;
        node.rnode=temp;
        if(node.lnode!=null){
            reverse(node.lnode);
        }
        if(node.rnode!=null){
            reverse(node.rnode);
        }
    }
}
