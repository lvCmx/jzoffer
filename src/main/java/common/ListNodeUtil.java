package common;

/**
 * 说明：一些公用的东西就写到这里面了
 */
public class ListNodeUtil {
    //循环输出链表
    public static void print(ListNode node){
        while(null!=node){
            System.out.println(node.value);
            node=node.next;
        }
    }

    // 生成一个链表，用于测试
    public static ListNode createListNode(int [] arr){
        if(null!=arr && arr.length>0){
            ListNode result=new ListNode(-1,null);
            ListNode root=result;
            for(int i=0;i<arr.length;i++){
                result.next=new ListNode(arr[i],null);
                result=result.next;
            }
            return root.next;
        }
        return null;
    }

    public static ListNode createListNodeHasHead(int[] arr) {
        if(null!=arr && arr.length>0){
            ListNode result=new ListNode(-1,null);
            ListNode root=result;
            for(int i=0;i<arr.length;i++){
                result.next=new ListNode(arr[i],null);
                result=result.next;
            }
            return root;
        }
        return null;
    }

    public static void printNotHasHead(ListNode node) {
        if(null==node || null==node.next){
            return;
        }
        node=node.next;
        while(null!=node){
            System.out.println(node.value);
            node=node.next;
        }
    }
}
