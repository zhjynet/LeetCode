package linkedlist.q206;

/**
 * @author zhangjingyu
 * @version V1.0.0
 * @Title: Soultion2
 * @Package linkedlist.q206
 * @Description: TODO
 * @date 2020/8/15 17:55
 */
public class Soultion2 {
    /**
     * @param head
     * @return linkedlist.q206.ListNode
     * @Title reverseList
     * @Description //TODO
     * @author zhangjingyu
     * @date 2020/8/15 18:03
     * @version V1.0.0
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
}
