package 第8章_英文版新增面试题;

import common.ListNode;
import common.ListNodeUtil;

public class 删除链表中重复的结点 {
    public static void main(String[] args) {
        int[] arr=new int[]{-1,1,1,2,3,4,4,5,5};
        ListNode head = ListNodeUtil.createListNode(arr);
        ListNode result=delDuplication(head);
        ListNodeUtil.print(result);
    }

    private static ListNode delDuplication(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode pHead=head;
        ListNode temp=pHead;
        ListNode pre=pHead;
        boolean flag=false;
        while(pHead.next!=null){
            if(pHead.value==pHead.next.value){
                flag=true;
                if(pHead.next.next!=null){
                    pHead.next=pHead.next.next;
                    continue;
                }else {
                    pHead.next=null;
                }
            }
            if(flag){
                if(pre.next!=null && pre.next.next!=null){
                    pre.next=pre.next.next;
                }else{
                    pre.next=null;
                }
                flag=false;
            }else{
                pre=pHead;
            }
            if(pHead.next!=null)
                pHead=pHead.next;
        }
        return temp;
    }
}
