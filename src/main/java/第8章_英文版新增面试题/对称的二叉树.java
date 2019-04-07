package 第8章_英文版新增面试题;

import common.Node;

public class 对称的二叉树 {
    public static boolean isSymmetrical(Node node){
        return isSymmetrical(node,node);
    }

    private static boolean isSymmetrical(Node node, Node node1) {
        if(node==null && node1==null){
            return true;
        }
        if(node==null || node1==null){
            return false;
        }
        if(node.data!=node1.data){
            return false;
        }
        return isSymmetrical(node.rnode,node.lnode) && isSymmetrical(node.lnode,node1.rnode);
    }
}
