package common;

public class ListNodeUtil {

    /**
     * 创建链表
     * @param arr
     * @return
     */
    public static ListNode createListNode(int[] arr){
        if(null==arr || arr.length<=0){
            return null;
        }
        ListNode root=new ListNode(-1,null);
        ListNode temp=root;
        ListNode node=null;
        for(int i=0;i<arr.length;i++){
            node=new ListNode(arr[i],null);
            temp.next=node;
            temp=temp.next;
        }
        // 如果直接返回root,就相当于返回了它的头节点
        return root.next;
    }

    /**
     * 打印链表
     * @param phead
     */
    public static void print(ListNode phead){
        if(null==phead){
            return;
        }
        ListNode head=phead;
        while(null!=head){
            System.out.println(head.value);
            head=head.next;
        }
    }
}
