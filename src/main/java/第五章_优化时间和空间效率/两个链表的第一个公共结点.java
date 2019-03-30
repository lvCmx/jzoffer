package 第五章_优化时间和空间效率;

import common.ListNode;
import common.ListNodeUtil;

public class 两个链表的第一个公共结点 {
    public static void main(String[] args) {
        ListNode listNode = ListNodeUtil.createListNode(new int[]{1, 2, 3, 5, 7, 8, 0});
        ListNode listNode2 = ListNodeUtil.createListNode(new int[]{3, 5, 7, 8, 0});
        ListNode node = findMutualNode(listNode, listNode2);
        System.out.println(node.value);
    }

    /**
     * 假如A链表长度超过B链表
     * A链表长度
     * B链表长度
     * A链表先循环(A-B)次，然后A与B链表再依次判断是否相同
     *
     * @param listNode
     * @param listNode2
     * @return
     */
    private static ListNode findMutualNode(ListNode listNode, ListNode listNode2) {
        if (listNode == null || listNode2 == null) {
            return null;
        }
        ListNode tempNode1 = listNode;
        ListNode tempNode2 = listNode2;
        int lengA = 0;
        int lengB = 0;
        while (tempNode1 != null) {
            lengA++;
            tempNode1 = tempNode1.next;
        }
        while (tempNode2 != null) {
            lengB++;
            tempNode2 = tempNode2.next;
        }
        tempNode1 = listNode;
        tempNode2 = listNode2;
        if (lengA < lengB) {
            int temp = lengA;
            lengA = lengB;
            lengB = temp;

            tempNode1 = listNode2;
            tempNode2 = listNode;
        }
        int index = 1;
        while (tempNode1 != null && tempNode2 != null) {
            if (index++ <= (lengA - lengB)){
                tempNode1=tempNode1.next;
                continue;
            }
            if(tempNode1.value==tempNode2.value){
                return tempNode1;
            }
            tempNode1=tempNode1.next;
            tempNode2=tempNode2.next;
        }
        return null;
    }
}