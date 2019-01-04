package linklist;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

 示例：

 给定一个链表: 1->2->3->4->5, 和 n = 2.

 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        ListNode slow = head;
        for(int i=0; i<n;i++) {
            fast = fast.next;
            if(fast == null) return slow.next;
        }
        while(fast.next != null ) {
            fast = fast.next;
            slow = slow.next;
        }
        //获得要删除的点前一个点;
        slow.next = slow.next.next;
        return head;
    }
}
