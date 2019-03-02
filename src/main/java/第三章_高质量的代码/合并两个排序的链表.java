package 第三章_高质量的代码;

import common.ListNode;
import common.ListNodeUtil;

public class 合并两个排序的链表 {
    public static void main(String[] args) {
        ListNode node1 = ListNodeUtil.createListNode(new int[]{1, 3, 5, 7, 9});
        ListNode node2 = ListNodeUtil.createListNode(new int[]{2, 4, 6, 8, 10});
        ListNode merge = merge(node1, node2);
        ListNodeUtil.print(merge);
    }

    public static ListNode merge(ListNode node1,ListNode node2){
        if(node1==null){
            return node2;
        }
        if(node2==null){
            return node1;
        }
        ListNode pnode1=node1;
        ListNode pnode2=node2;

        ListNode newHead=new ListNode(-1,null);
        ListNode temp=newHead;

        while(pnode1!=null && pnode2!=null){
            if(pnode1.value>pnode2.value){
                temp.next=pnode2;
                pnode2=pnode2.next;
                temp=temp.next;
            }else{
                temp.next=pnode1;
                pnode1=pnode1.next;
                temp=temp.next;
            }
        }
        while(pnode1!=null){
            temp.next=pnode1;
            pnode1=pnode1.next;
            temp=temp.next;
        }
        while(pnode2!=null){
            temp.next=pnode2;
            pnode2=pnode2.next;
            temp=temp.next;
        }
        return newHead.next;
    }
}
