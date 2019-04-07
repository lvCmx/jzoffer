package 第8章_英文版新增面试题;

import common.Node;

public class 二叉树的下一个结点 {
    public static void main(String[] args) {
        Node a = new Node(null,null,1);
        Node b= new Node(null,null,1);
        Node c = new Node(null,null,1);
        Node d = new Node(null,null,1);
        Node e = new Node(null,null,1);
        Node f = new Node(null,null,1);
        Node g = new Node(null,null,1);
        Node h = new Node(null,null,1);
        Node i = new Node(null,null,1);
        a.lnode=b;
        a.rnode=c;
        b.lnode=d;
        b.rnode=e;
        c.lnode=f;
        c.rnode=g;
        e.lnode=h;
        e.rnode=i;

        h.parent=e;
        i.parent=e;
        d.parent=b;
        e.parent=b;
        f.parent=c;
        g.parent=c;
        c.parent=a;
        b.parent=a;

        Node node=getNextNode(i);
        System.out.println(node.data);
    }

    private static Node getNextNode(Node root) {
        if(root==null){
            return null;
        }
        Node pNext=null;
        if(root.rnode!=null){
            Node rnode = root.rnode;
            while(rnode.lnode!=null){
                rnode=rnode.lnode;
            }
            pNext=rnode;
        }else if(root.parent!=null){
            Node current=root;
            Node parent = root.parent;
            while(parent!=null && current==parent.rnode){
                current=parent;
                parent= parent.parent;
            }
            pNext=parent;
        }
        return pNext;
    }
}
