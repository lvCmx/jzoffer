package 第8章_英文版新增面试题;

import common.ListNode;

public class 链表中环的入口结点 {
    public static void main(String[] args) {
        int[] arr=new int[]{1, 2, 3, 4, 5, 6};
        ListNode result=new ListNode(-1,null);
        ListNode root=result;
        for(int i=0;i<arr.length;i++){
            result.next=new ListNode(arr[i],null);
            result=result.next;
            if(i==arr.length-1){
                result.next=root.next.next.next;
            }
        }
        root = root.next;
        ListNode node=findNode(root);
        System.out.println(node.value);
    }

    private static ListNode findNode(ListNode root) {
        ListNode head=root;
        ListNode pSlow=head.next;
        if(pSlow==null){
            return null;
        }
        ListNode pFast=pSlow.next;
        while(pFast!=null && pSlow!=null){
            if (pFast == pSlow) {
                break;
            }
            pSlow=pSlow.next;
            pFast=pFast.next;
            if(pFast!=null){
                pFast=pFast.next;
            }
        }
        ListNode p1=root;
        while(p1!=null && pSlow!=null){
            if(p1==pSlow){
                return p1;
            }
            p1=p1.next;
            pSlow=pSlow.next;
        }
        return null;
    }
}
