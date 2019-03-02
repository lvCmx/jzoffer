package 第三章_高质量的代码;

import common.ListNode;
import common.ListNodeUtil;

/**
 * 输入一个链表，输出该链表的倒数第k个结点。
 * 这题利用两个指针
 */
public class 链表中倒数第k个结点 {

    public static void main(String[] args) {
        ListNode head = ListNodeUtil.createListNode(new int[]{1, 2, 4, 5, 6, 7, 8});
        int kthToTail = findKthToTail(head, 2);
        System.out.println(kthToTail);
    }

    public static int findKthToTail(ListNode head,int k){
        if(null==head || k<0){
            return -1;
        }
        int tail=0;
        ListNode temp=head;
        ListNode slow=head;
        while(null!=temp){
            tail++;
            if(tail>k){
                slow=slow.next;
            }
            temp=temp.next;
        }
        return slow.value;
    }
}
