package 第三章_高质量的代码;

import common.ListNode;
import common.ListNodeUtil;

/**
 * 这题思路：
 * 取前面的节点使其与后面的节点断开连接，然后连接前面的接点
 */
public class 反转链表 {

    public static void main(String[] args) {
        ListNode head = ListNodeUtil.createListNode(new int[]{6, 5, 4, 3, 2, 1});
        ListNode reverse = reverse(head);
        ListNodeUtil.print(reverse);

    }
    public static ListNode reverse(ListNode phead){
        if(null==phead || null==phead.next){
            return null;
        }
        ListNode preverseHead=null; // 最终返回的头节点
        ListNode pnode=phead;
        ListNode prev=null;     // 用来记录每次反转的节点
        while(pnode!=null){
            ListNode pnext = pnode.next;
            if(pnext==null){
                preverseHead=pnode;
            }
            pnode.next=prev;    //把ponde.next= prev;相当于是把反转过的给ponde的next

            prev=pnode;         // 然后pnode再把值给prev，pnode=pnext就是下一个
            pnode=pnext;
        }
        return preverseHead;
    }
}
