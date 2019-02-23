package 第二章_面试需要的基础知识;

import java.util.Stack;

public class 重建二叉树 {
//    public static void main(String[] args) {
//        int [] preorder={1,2,4,7,3,5,6,8};
//        int [] inorder={4,7,2,1,5,3,8,6};
//        BinaryTreeNode root=constructCore(preorder,inorder);
//        print(root);
//    }
//
//    private static BinaryTreeNode constructCore(int[] preorder, int[] inorder) {
//        if(null==preorder || null==inorder || (preorder.length!=inorder.length && preorder.length<=0)){
//            return null;
//        }
//
//        return constructCore2(preorder,inorder);
//    }
//    private static BinaryTreeNode constructCore2(int[] preorder,int[] inorder) {
//        //根
//        BinaryTreeNode root = new BinaryTreeNode(preorder[0],null,null);
//        if(preorder.length==1){
//            return root;
//        }
//        //在中序遍历中找根结点
//        int index = getIndex(inorder, root.key);
//
//    }
//
//    //再先序输出该二叉树，递归的形式
//    private static void print(BinaryTreeNode root) {
//        if(root!=null){
//            System.out.println(root.key);
//            print(root.left);
//            print(root.right);
//        }
//    }
//    //非递归的形式
//    private static void printWhile(BinaryTreeNode root){
//        if(null==root){
//            return;
//        }
//        Stack<BinaryTreeNode> nodes=new Stack<BinaryTreeNode>();
//        nodes.add(root);
//
//        while(nodes.isEmpty()){
//            BinaryTreeNode pop = nodes.pop();
//            if(null!=pop){
//                System.out.println(pop.key);
//                if(null!=pop.left){
//                    nodes.push(pop.left);
//                }
//                if(null!=pop.right){
//                    nodes.push(pop.right);
//                }
//            }
//        }
//
//    }
//
//    public static int getIndex(int[] array,int temp){
//        int index = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]==temp) {
//                index = i;
//                return index;
//            }
//        }
//        return index;
//    }
}

/**
 * 树节点
 */
class BinaryTreeNode{
    int key;
    BinaryTreeNode left;
    BinaryTreeNode right;
    public BinaryTreeNode(int key,BinaryTreeNode left,BinaryTreeNode right){
        this.key=key;
        this.left=left;
        this.right=right;
    }
}
