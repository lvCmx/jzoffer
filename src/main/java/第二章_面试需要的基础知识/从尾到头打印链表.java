package 第二章_面试需要的基础知识;

public class 从尾到头打印链表 {
    public static void main(String[] args) {
        //初始化一个链表
        ListNode root=new ListNode(0);
        ListNode temp=root;
        ListNode node=null;
        for(int i=1;i<10;i++){
            node=new ListNode(i);
            temp.next=node;
            temp=node;
        }
        //从尾到头打印链表
        reverseListNode(root);
    }

    public static void reverseListNode(ListNode node){
        if(null==node){
            return;
        }
        if(null!=node.next){
            reverseListNode(node.next);
        }
        System.out.println(node.key);
    }
}

/*
    定义链表结构
*/
class ListNode{
    ListNode next;
    Integer key;
    public ListNode(Integer key){
        this.key=key;
    }
}