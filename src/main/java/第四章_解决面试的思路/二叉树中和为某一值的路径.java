package 第四章_解决面试的思路;

import common.Node;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 输入一棵二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径
 * 从树的根结点开始住下一直到叶结点所经过的结点形成一条路径。
 */
public class 二叉树中和为某一值的路径 {

    public static void main(String[] args) {
        Node root = new Node( null, null,1);
        Node left1 = new Node( null, null,2);
        Node right1 = new Node( null, null,3);
        root.lnode=left1;
        root.rnode=right1;
        left1.lnode = new Node( null, null,4);
        left1.rnode = new Node( null, null,5);
        right1.lnode = new Node( null, null,3);

        int num=7;
        findPath(root,num);
    }

    public static void findPath(Node root, int expectedSum) {
        if(root==null){
            return ;
        }
        // 用于保存满足条件的路径
        List<Integer> path=new ArrayList();
        int currentSum=0;
        findPath(root,expectedSum,path,currentSum);

    }

    private static void findPath(Node root, int expectedSum, List<Integer> path, int currentSum) {
        currentSum+=root.data;
        path.add(root.data);    //将当前元素的值添加到路径中

        // 是不是子节点
        boolean isLeft=root.lnode==null && root.rnode==null;
        if(currentSum == expectedSum && isLeft){
            System.out.println("找到一条路径...");
            Iterator<Integer> iterator = path.iterator();
            while(iterator.hasNext()){
                Integer next = iterator.next();
                System.out.print(next +"  ");
            }
        }

        //如果不是叶结点，则遍历它的子节点
        if(root.lnode!=null){
            findPath(root.lnode, expectedSum,  path,  currentSum);
        }
        if(root.rnode!=null){
            findPath(root.rnode, expectedSum,  path,  currentSum);
        }

        // 在返回到父结点之前，在路径上删除当前结点。
        path.remove(path.size()-1);
    }
}
