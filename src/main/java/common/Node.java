package common;

public class Node {
    public Node lnode;
    public Node rnode;
    public int data;

    public Node(int data) {
        this.data=data;
    }
    //构造一个新结点，该结点以lNode结点为其左孩子，rNode结点为其右孩子
    public Node(Node lNode,Node rNode,int data) {
        this.lnode=lNode;
        this.rnode=rNode;
        this.data=data;
    }

}