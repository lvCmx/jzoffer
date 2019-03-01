package 第三章_高质量的代码;

import common.ListNode;
import common.ListNodeUtil;

public class 在O1时间删除链表结点 {
    public static void main(String[] args) {
        ListNode listNode = ListNodeUtil.createListNode(new int[]{1, 2, 4, 5, 6, 7});
        // 删除4
        deleteNode(listNode,listNode.next.next);
        // 输出看看一有没有删除
        ListNodeUtil.print(listNode);
    }

    public static void deleteNode(ListNode head, ListNode node){
        if(null==head || null==node){
            return ;
        }
        //要删除的结点不是尾结点
        if(null!=node.next){
            //将当前节点的下个节点复制到本节点上，再删除下一个节点
            ListNode next = node.next;
            node.value=next.value;
            if(null!=next.next){
                node.next=next.next;
            }else{
                node.next=null;
            }
        }else if(head==node){
            // 链表只有一个结点，删除头结点（也是尾结点）
            node=null;
            head=null;
        }else {
            // 链表中有多个结点，删除尾结点 ，对于这种方式，没办法，只能去遍历出它的前一个节点，通过前一个节点来删除它。
            ListNode temp=head;
            while(temp.next!=node){
                temp=temp.next;
            }
            // 找到后，删除它
            temp.next=null;
            node=null;
        }
    }
}
