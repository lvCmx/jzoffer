package 第四章_解决面试的思路;

import common.Node;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求：1.不能创建新节点
 * 2.只能调整树中结点的指针的指向。
 */
public class 二叉搜索树与双向链表 {
    public static void main(String[] args) {
        Node root = new Node( null, null,4);
        Node left1 = new Node( null, null,3);
        Node right1 = new Node( null, null,5);
        root.lnode=left1;
        root.rnode=right1;
        left1.lnode = new Node( null, null,1);
        left1.rnode = new Node( null, null,2);
        right1.rnode= new Node( null, null,7);



    }
}
