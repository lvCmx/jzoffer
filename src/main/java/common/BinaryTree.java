package common;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTree {
    private Node root;  // 用一个根结点来表示二叉树

    public BinaryTree(int data){
        this.root=new Node(data);
    }

    public static Node addNode(Node parentNode,int data,boolean isLeft){
        //父节点为空，无法添加子节点
        if(parentNode==null){
            throw new RuntimeException("父节点为空，无法添加子节点");
        }
        if(isLeft==true && parentNode.lnode!=null){
            throw new RuntimeException("左子节点已经存在，添加失败");
        }
        if(isLeft!=true && parentNode.rnode!=null){
            throw new RuntimeException("右子节点已经存在，添加失败");
        }
        Node node = new Node(data);
        if(isLeft==true){
            parentNode.lnode=node;
        }else{
            parentNode.rnode=node;
        }
        return node;
    }

    //先序遍历
    public List<Integer> preOrderTraverse(Node node){
        List<Integer> list = new ArrayList<Integer>();
        if(node.lnode!=null){
            list.addAll(preOrderTraverse(node.lnode));
        }if(node.rnode!=null){
            list.addAll(preOrderTraverse(node.rnode));
        }
        return list;
    }


    /**
     * 先序式非递归式的
     *   思路：对于任意节点T，访问这个节点并压入栈中，然后访问节点的左子树，
     *        遍历完左子树后，取出栈顶的节点T，再先序遍历T的右子树
     * @param node
     */
    public void printBinaryTreePreUnrecur(Node node) {
        Node p=node;
        LinkedList<Node> nodes = new LinkedList<Node>();
        while(p!=null || !nodes.isEmpty()){
            if(p!=null){
                nodes.add(p);
                System.out.println(p.data);
                p=p.lnode;
            }else{
                p = nodes.poll();
                p = p.rnode;
            }
        }
    }

    /**
     * 非递归的中序
     *
     */
    public void printBinaryTreeMidUnrecur(Node node){
        Node p=node;
        LinkedList<Node> nodes = new LinkedList<Node>();
        while(p!=null || !nodes.isEmpty()){
            if(p!=null){
                nodes.add(p);
                p=p.lnode;
            }else{
                p = nodes.poll();
                System.out.println(p.lnode);
                p = p.rnode;
            }
        }
    }
}
